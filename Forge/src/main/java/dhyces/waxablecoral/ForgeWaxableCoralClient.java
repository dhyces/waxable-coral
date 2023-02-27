package dhyces.waxablecoral;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ForgeWaxableCoralClient {
    static void init(IEventBus modBus) {
        modBus.addListener(ForgeWaxableCoralClient::clientSetup);
        modBus.addListener(ForgeWaxableCoralClient::addTabs);
    }

    private static void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(WaxableCoralClient::init);
    }

    private static void addTabs(final CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(Register.WAXED_TUBE_CORAL_BLOCK);
            event.accept(Register.WAXED_BRAIN_CORAL_BLOCK);
            event.accept(Register.WAXED_BUBBLE_CORAL_BLOCK);
            event.accept(Register.WAXED_FIRE_CORAL_BLOCK);
            event.accept(Register.WAXED_HORN_CORAL_BLOCK);

            event.accept(Register.WAXED_TUBE_CORAL);
            event.accept(Register.WAXED_BRAIN_CORAL);
            event.accept(Register.WAXED_BUBBLE_CORAL);
            event.accept(Register.WAXED_FIRE_CORAL);
            event.accept(Register.WAXED_HORN_CORAL);

            event.accept(Register.WAXED_TUBE_CORAL_FAN);
            event.accept(Register.WAXED_BRAIN_CORAL_FAN);
            event.accept(Register.WAXED_BUBBLE_CORAL_FAN);
            event.accept(Register.WAXED_FIRE_CORAL_FAN);
            event.accept(Register.WAXED_HORN_CORAL_FAN);
        }
    }
}
