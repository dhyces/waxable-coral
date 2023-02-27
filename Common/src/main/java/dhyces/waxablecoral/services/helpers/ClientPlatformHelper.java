package dhyces.waxablecoral.services.helpers;

import dhyces.waxablecoral.registration.RegistryObject;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public interface ClientPlatformHelper {
    void setRenderType(RegistryObject<? extends Block> block, RenderType renderType);
}
