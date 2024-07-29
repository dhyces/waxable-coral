package dhyces.waxablecoral.integration;

import dhyces.waxablecoral.integration.upgradeaquatic.UpgradeAquaticCompat;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;

public class Compats {

    public static void init(IEventBus modBus) {
        if (isUpgradeAquaticLoaded()) {
            UpgradeAquaticCompat.init(modBus);
        }
    }

    public static boolean isUpgradeAquaticLoaded() {
        return ModList.get().isLoaded("upgrade_aquatic");
    }
}
