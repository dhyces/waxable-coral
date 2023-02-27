package dhyces.waxablecoral;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class FabricWaxableCoralClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        WaxableCoralClient.init();

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_FAN.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_FAN.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_FAN.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_FAN.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_FAN.get());

            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL.get());

            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_BLOCK.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_BLOCK.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_BLOCK.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_BLOCK.get());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_BLOCK.get());
        });
    }
}
