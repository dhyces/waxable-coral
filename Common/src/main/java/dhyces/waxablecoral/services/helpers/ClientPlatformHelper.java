package dhyces.waxablecoral.services.helpers;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface ClientPlatformHelper {
    void setRenderType(Supplier<? extends Block> block, RenderType renderType);
}
