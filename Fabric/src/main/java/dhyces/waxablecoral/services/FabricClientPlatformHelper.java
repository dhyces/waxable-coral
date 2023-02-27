package dhyces.waxablecoral.services;

import dhyces.waxablecoral.registration.RegistryObject;
import dhyces.waxablecoral.services.helpers.ClientPlatformHelper;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class FabricClientPlatformHelper implements ClientPlatformHelper {
    @Override
    public void setRenderType(RegistryObject<? extends Block> block, RenderType renderType) {
        BlockRenderLayerMap.INSTANCE.putBlock(block.get(), renderType);
    }
}
