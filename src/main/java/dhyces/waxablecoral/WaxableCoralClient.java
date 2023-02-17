package dhyces.waxablecoral;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class WaxableCoralClient {
    static void init(IEventBus modBus) {
        modBus.addListener(WaxableCoralClient::clientSetup);
    }

    private static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_TUBE_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_BRAIN_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_BUBBLE_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_FIRE_CORAL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_HORN_CORAL.get(), RenderType.cutoutMipped());

            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_TUBE_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_BRAIN_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_BUBBLE_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_FIRE_CORAL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_HORN_CORAL_FAN.get(), RenderType.cutoutMipped());

            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_TUBE_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_BRAIN_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_BUBBLE_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_FIRE_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(WaxableCoral.WAXED_HORN_CORAL_WALL_FAN.get(), RenderType.cutoutMipped());
        });
    }
}
