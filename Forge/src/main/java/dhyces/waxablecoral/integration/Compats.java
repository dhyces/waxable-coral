package dhyces.waxablecoral.integration;

import net.minecraftforge.fml.ModList;

public class Compats {
    public static boolean isUpgradeAquaticLoaded() {
        return ModList.get().isLoaded("upgrade_aquatic");
    }
}
