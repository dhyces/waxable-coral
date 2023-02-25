package dhyces.waxablecoral;

import net.fabricmc.api.ModInitializer;

public class FabricWaxableCoral implements ModInitializer {
    @Override
    public void onInitialize() {
        WaxableCoral.init();
        WaxableCoralAPI.fillWaxingMap();
    }
}
