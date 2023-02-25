package dhyces.waxablecoral;

import net.fabricmc.api.ClientModInitializer;

public class FabricWaxableCoralClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        WaxableCoralClient.init();
    }
}
