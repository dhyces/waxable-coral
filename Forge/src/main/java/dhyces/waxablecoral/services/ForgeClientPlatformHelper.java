package dhyces.waxablecoral.services;

import dhyces.waxablecoral.registration.RegistryObject;
import dhyces.waxablecoral.services.helpers.ClientPlatformHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class ForgeClientPlatformHelper implements ClientPlatformHelper {
    @Override
    public void setRenderType(RegistryObject<? extends Block> block, RenderType renderType) {
        ItemBlockRenderTypes.setRenderLayer(block.get(), renderType);
    }
}
