package dhyces.waxablecoral;

import dhyces.waxablecoral.services.Services;
import net.minecraft.client.renderer.RenderType;

public class WaxableCoralClient {
    public static void init() {
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_TUBE_CORAL, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BRAIN_CORAL, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BUBBLE_CORAL, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_FIRE_CORAL, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_HORN_CORAL, RenderType.cutoutMipped());

        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_TUBE_CORAL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BRAIN_CORAL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BUBBLE_CORAL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_FIRE_CORAL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_HORN_CORAL_FAN, RenderType.cutoutMipped());

        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_TUBE_CORAL_WALL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BRAIN_CORAL_WALL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BUBBLE_CORAL_WALL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_FIRE_CORAL_WALL_FAN, RenderType.cutoutMipped());
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_HORN_CORAL_WALL_FAN, RenderType.cutoutMipped());
    }
}
