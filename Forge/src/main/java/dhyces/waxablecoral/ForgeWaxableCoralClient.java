package dhyces.waxablecoral;

import dhyces.waxablecoral.integration.Compats;
import dhyces.waxablecoral.integration.ua.UpgradeAquaticCompat;
import dhyces.waxablecoral.services.Services;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ForgeWaxableCoralClient {
    static void init(IEventBus modBus) {
        modBus.addListener(ForgeWaxableCoralClient::clientSetup);
    }

    private static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            WaxableCoralClient.init();
            if (Compats.isUpgradeAquaticLoaded()) {
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_ACAN_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_ACAN_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_FINGER_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_FINGER_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_STAR_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_STAR_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_STAR_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_MOSS_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_MOSS_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_MOSS_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PETAL_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PETAL_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PETAL_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_BRANCH_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_ROCK_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_ROCK_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_ROCK_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PILLOW_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_SILK_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_SILK_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_SILK_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_CHROME_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_CHROME_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_CHROME_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_FAN, RenderType.cutoutMipped());
                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_WALL_FAN, RenderType.cutoutMipped());

                Services.CLIENT_PLATFORM_HELPER.setRenderType(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER, RenderType.cutoutMipped());
            }
        });
    }
}
