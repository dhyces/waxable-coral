package dhyces.waxablecoral;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.util.MutableHashedLinkedMap;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(WaxableCoral.MODID)
public class NeoForgeWaxableCoral {

    public static final DeferredRegister.Blocks BLOCK_REGISTER = DeferredRegister.createBlocks(WaxableCoral.MODID);
    public static final DeferredRegister.Items ITEM_REGISTER = DeferredRegister.createItems(WaxableCoral.MODID);

    public static final TagKey<Item> WAXES_BLOCKS = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", "waxes_blocks"));

    public NeoForgeWaxableCoral(IEventBus modBus) {
        BLOCK_REGISTER.register(modBus);
        ITEM_REGISTER.register(modBus);

        WaxableCoral.init();

        modBus.addListener(this::onCommonLoad);
        modBus.addListener(this::addTabs);
        NeoForge.EVENT_BUS.addListener(this::onBlockRightClick);
        NeoForge.EVENT_BUS.addListener(this::onAxeWaxOffUsed);
    }

    private void onCommonLoad(final FMLCommonSetupEvent event) {
        event.enqueueWork(WaxableCoralAPI::fillWaxingMap);
    }

    private void addTabs(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_HORN_CORAL_FAN.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_FIRE_CORAL_FAN.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_BUBBLE_CORAL_FAN.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_BRAIN_CORAL_FAN.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_TUBE_CORAL_FAN.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_HORN_CORAL.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_FIRE_CORAL.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_BUBBLE_CORAL.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_BRAIN_CORAL.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_TUBE_CORAL.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_HORN_CORAL_BLOCK.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_FIRE_CORAL_BLOCK.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_BUBBLE_CORAL_BLOCK.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_BRAIN_CORAL_BLOCK.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DEAD_HORN_CORAL_FAN.getDefaultInstance(), Register.WAXED_TUBE_CORAL_BLOCK.value().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    private void onBlockRightClick(final PlayerInteractEvent.RightClickBlock event) {
        BlockPos waxingPos = event.getHitVec().getBlockPos();
        BlockState state = event.getLevel().getBlockState(waxingPos);
        ItemStack usedStack = event.getItemStack();
        Level level = event.getLevel();
        if (usedStack.is(WAXES_BLOCKS)) {
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
        if (event.getItemAbility().equals(ItemAbilities.AXE_WAX_OFF)) {
            BlockState state = event.getLevel().getBlockState(event.getContext().getClickedPos());
            Block unwaxed = WaxableCoralAPI.getUnwaxed(state.getBlock());
            if (unwaxed != null) {
                event.setFinalState(unwaxed.withPropertiesOf(state));
                event.getLevel().scheduleTick(event.getPos(), unwaxed, 60 + event.getLevel().getRandom().nextInt(40));
            }
        }
    }
}
