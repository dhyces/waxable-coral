package dhyces.waxablecoral;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.Supplier;

public class ForgeWaxableCoralClient {
    static void init(IEventBus modBus) {
        modBus.addListener(ForgeWaxableCoralClient::clientSetup);
        modBus.addListener(ForgeWaxableCoralClient::addTabs);
    }

    private static void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(WaxableCoralClient::init);
    }

    private static void addTabs(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems = event.getEntries();

            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_FAN);

            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL);

            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_BLOCK);
        }
    }

    private static void putAfterFullVis(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems, Item item, Supplier<? extends Block> regObj) {
        tabItems.putAfter(item.getDefaultInstance(), regObj.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
