package dhyces.waxablecoral.services.helpers;

import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public interface ClientPlatformHelper {
    void setRenderType(CommonRegistryObject<? extends Block> block, RenderType renderType);
}
