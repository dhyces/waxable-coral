package dhyces.waxablecoral;

import dhyces.waxablecoral.services.Services;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class WaxableCoralClient {
    public static void init() {
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_TUBE_CORAL, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BRAIN_CORAL, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BUBBLE_CORAL, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_FIRE_CORAL, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_HORN_CORAL, ChunkSectionLayer.CUTOUT_MIPPED);

        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_TUBE_CORAL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BRAIN_CORAL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BUBBLE_CORAL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_FIRE_CORAL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_HORN_CORAL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);

        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_TUBE_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BRAIN_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_BUBBLE_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_FIRE_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
        Services.CLIENT_PLATFORM_HELPER.setRenderType(Register.WAXED_HORN_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT_MIPPED);
    }
}
