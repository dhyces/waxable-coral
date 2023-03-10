package dhyces.waxablecoral;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ForgeWaxableCoralClient {
    static void init(IEventBus modBus) {
        modBus.addListener(ForgeWaxableCoralClient::clientSetup);
    }

    private static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(WaxableCoralClient::init);
    }
}
