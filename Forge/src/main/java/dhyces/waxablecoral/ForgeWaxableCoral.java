package dhyces.waxablecoral;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.registries.DeferredRegister;

@Mod(WaxableCoral.MODID)
public class ForgeWaxableCoral {

    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(Registry.BLOCK_REGISTRY, WaxableCoral.MODID);
    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(Registry.ITEM_REGISTRY, WaxableCoral.MODID);

    public ForgeWaxableCoral() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCK_REGISTER.register(modBus);
        ITEM_REGISTER.register(modBus);

        WaxableCoral.init();

        if (!FMLLoader.isProduction()) {
            modBus.addListener(this::datagen);
        }
        if (FMLLoader.getDist().isClient()) {
            ForgeWaxableCoralClient.init(modBus);
        }

        modBus.addListener(this::onCommonLoad);
        MinecraftForge.EVENT_BUS.addListener(this::onBlockRightClick);
        MinecraftForge.EVENT_BUS.addListener(this::onAxeWaxOffUsed);
    }

    private void onCommonLoad(final FMLCommonSetupEvent event) {
        event.enqueueWork(WaxableCoralAPI::fillWaxingMap);
    }

    private void datagen(final GatherDataEvent event) {
        event.getGenerator().addProvider(event.includeClient(), new ModBlockStateProvider(event.getGenerator(), WaxableCoral.MODID, event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModLangProvider(event.getGenerator(), WaxableCoral.MODID, "en_us"));
        event.getGenerator().addProvider(event.includeClient(), new ModBlockLootTableProvider(event.getGenerator()));
    }

    private void onBlockRightClick(final PlayerInteractEvent.RightClickBlock event) {
        BlockPos waxingPos = event.getHitVec().getBlockPos();
        BlockState state = event.getLevel().getBlockState(waxingPos);
        ItemStack usedStack = event.getItemStack();
        Level level = event.getLevel();
        if ((state.is(BlockTags.CORALS) || state.is(BlockTags.CORAL_BLOCKS) || state.is(BlockTags.WALL_CORALS)) && (usedStack.is(WaxableCoral.HONEYCOMBS) || usedStack.is(Items.HONEYCOMB))) {
            Block waxed = WaxableCoralAPI.getWaxed(state.getBlock());
            if (waxed != null) {
                BlockState waxedState = waxed.withPropertiesOf(state);
                level.setBlock(waxingPos, waxedState, Block.UPDATE_ALL_IMMEDIATE);

                if (!event.getEntity().getAbilities().instabuild) {
                    usedStack.shrink(1);
                }
                event.getEntity().awardStat(Stats.ITEM_USED.get(usedStack.getItem()));
                if (event.getEntity() instanceof ServerPlayer serverPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, waxingPos, usedStack);
                }
                level.gameEvent(GameEvent.BLOCK_CHANGE, waxingPos, GameEvent.Context.of(event.getEntity(), waxedState));
                level.levelEvent(event.getEntity(), 3003, waxingPos, 0);
                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
        }
    }

    private void onAxeWaxOffUsed(final BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction().equals(ToolActions.AXE_WAX_OFF)) {
            BlockState state = event.getLevel().getBlockState(event.getContext().getClickedPos());
            if (state.is(WaxableCoral.WAXED_CORALS) || state.is(WaxableCoral.WAXED_CORAL_BLOCKS) || state.is(WaxableCoral.WAXED_WALL_CORALS)) {
                Block unwaxed = WaxableCoralAPI.getUnwaxed(state.getBlock());
                if (unwaxed != null) {
                    event.setFinalState(unwaxed.withPropertiesOf(state));
                    event.getLevel().scheduleTick(event.getPos(), unwaxed, 60 + event.getLevel().getRandom().nextInt(40));
                }
            }
        }
    }
}
