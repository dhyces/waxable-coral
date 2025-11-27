package dhyces.waxablecoral.services;

import dhyces.waxablecoral.services.helpers.ClientPlatformHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;

public class NeoForgeClientPlatformHelper implements ClientPlatformHelper {
    @Override
    public void setRenderType(Holder<Block> block, ChunkSectionLayer renderType) {
        ItemBlockRenderTypes.setRenderLayer(block.value(), renderType);
    }
}
