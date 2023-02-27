package dhyces.waxablecoral;

import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import dhyces.waxablecoral.integration.Compats;
import dhyces.waxablecoral.integration.ua.UpgradeAquaticCompat;
import dhyces.waxablecoral.integration.data.CompatBlockLootProvider;
import dhyces.waxablecoral.integration.data.CompatBlockStateProvider;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.*;

@Mod(WaxableCoral.MODID)
public class ForgeWaxableCoral {

    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(Registry.BLOCK_REGISTRY, WaxableCoral.MODID);
    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(Registry.ITEM_REGISTRY, WaxableCoral.MODID);

    public static final TagKey<Item> HONEYCOMBS = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("forge", "honeycombs"));

    public ForgeWaxableCoral() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCK_REGISTER.register(modBus);
        ITEM_REGISTER.register(modBus);

        WaxableCoral.init();
        if (Compats.isUpgradeAquaticLoaded()) {
            UpgradeAquaticCompat.init();
        }

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
        event.enqueueWork(() -> {
            WaxableCoralAPI.fillWaxingMap();
                    if (Compats.isUpgradeAquaticLoaded()) {
                        UpgradeAquaticCompat.addWaxing();
                    }
                }
        );
    }

    private void datagen(final GatherDataEvent event) {
        if (event.getGenerator().getOutputFolder().toString().contains("Common")) {
            event.getGenerator().addProvider(new ModBlockStateProvider(event.getGenerator(), WaxableCoral.MODID, event.getExistingFileHelper()));
            event.getGenerator().addProvider(new ModLangProvider(event.getGenerator(), WaxableCoral.MODID, "en_us"));
            event.getGenerator().addProvider(new ModBlockLootTableProvider(event.getGenerator()));
        } else {
            event.getGenerator().addProvider(new CompatBlockStateProvider(event.getGenerator(), WaxableCoral.MODID, event.getExistingFileHelper()));
//            event.getGenerator().addProvider(new CompatLangProvider(event.getGenerator(), WaxableCoral.MODID, "en_us"));
            event.getGenerator().addProvider(new CompatBlockLootProvider(event.getGenerator()));
        }
    }

    private void onBlockRightClick(final PlayerInteractEvent.RightClickBlock event) {
        BlockPos waxingPos = event.getHitVec().getBlockPos();
        Level level = event.getWorld();
        BlockState state = level.getBlockState(waxingPos);
        ItemStack usedStack = event.getItemStack();
        if (usedStack.is(HONEYCOMBS) || usedStack.is(Items.HONEYCOMB)) {
            Block waxed = WaxableCoralAPI.getWaxed(state.getBlock());
            if (waxed != null) {
                BlockState waxedState = waxed.withPropertiesOf(state);
                level.setBlock(waxingPos, waxedState, Block.UPDATE_ALL_IMMEDIATE);

                if (!event.getPlayer().getAbilities().instabuild) {
                    usedStack.shrink(1);
                }
                event.getPlayer().awardStat(Stats.ITEM_USED.get(usedStack.getItem()));
                if (event.getPlayer() instanceof ServerPlayer serverPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, waxingPos, usedStack);
                }
                level.gameEvent(event.getEntity(), GameEvent.BLOCK_CHANGE, waxingPos);
                level.levelEvent(event.getPlayer(), 3003, waxingPos, 0);
                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
        }
    }

    private void onAxeWaxOffUsed(final BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction().equals(ToolActions.AXE_WAX_OFF)) {
            BlockState state = event.getWorld().getBlockState(event.getContext().getClickedPos());
            Block unwaxed = WaxableCoralAPI.getUnwaxed(state.getBlock());
            if (unwaxed != null) {
                event.setFinalState(unwaxed.withPropertiesOf(state));
                event.getWorld().scheduleTick(event.getPos(), unwaxed, 60 + event.getWorld().getRandom().nextInt(40));
            }
        }
    }
}
