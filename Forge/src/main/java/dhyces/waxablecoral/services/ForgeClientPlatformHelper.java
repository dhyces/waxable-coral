package dhyces.waxablecoral.services;

import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import dhyces.waxablecoral.services.helpers.ClientPlatformHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class ForgeClientPlatformHelper implements ClientPlatformHelper {
    @Override
    public void setRenderType(CommonRegistryObject<? extends Block> block, RenderType renderType) {
        ItemBlockRenderTypes.setRenderLayer(block.get(), renderType);
    }
}
