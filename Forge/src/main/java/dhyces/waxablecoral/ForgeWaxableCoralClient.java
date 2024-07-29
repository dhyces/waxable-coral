package dhyces.waxablecoral;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ForgeWaxableCoralClient {
    static void init(IEventBus modBus) {
        modBus.addListener(ForgeWaxableCoralClient::clientSetup);
    }

    private static void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(WaxableCoralClient::init);
    }
}
