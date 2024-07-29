package dhyces.waxablecoral.integration.upgradeaquatic;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public final class UpgradeAquaticCompatClient {
    private UpgradeAquaticCompatClient() {}

    static void init(IEventBus modBus) {
        modBus.addListener(UpgradeAquaticCompatClient::clientSetup);
    }

    private static void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_ACAN_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_FINGER_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_STAR_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_MOSS_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PETAL_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_BRANCH_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_ROCK_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PILLOW_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_SILK_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_CHROME_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL.get(), RenderType.cutoutMipped());

            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_STAR_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_MOSS_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PETAL_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_ROCK_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_SILK_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_CHROME_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_FAN.get(), RenderType.cutoutMipped());

            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_ACAN_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_FINGER_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_STAR_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_MOSS_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PETAL_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_ROCK_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_SILK_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_CHROME_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());

            ItemBlockRenderTypes.setRenderLayer(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER.get(), RenderType.cutoutMipped());
        });
    }
}
