package dhyces.waxablecoral.services.helpers;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;

public interface ClientPlatformHelper {
    void setRenderType(Holder<Block> block, ChunkSectionLayer renderType);
}
