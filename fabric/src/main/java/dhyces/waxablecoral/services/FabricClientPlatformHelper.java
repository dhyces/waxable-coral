package dhyces.waxablecoral.services;

import dhyces.waxablecoral.services.helpers.ClientPlatformHelper;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;

public class FabricClientPlatformHelper implements ClientPlatformHelper {
    @Override
    public void setChunkSectionLayer(Holder<Block> block, ChunkSectionLayer renderType) {
        BlockRenderLayerMap.putBlock(block.value(), renderType);
    }
}
