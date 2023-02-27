package dhyces.waxablecoral;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WaxableCoral {
    public static final String MODID = "waxablecoral";
    public static ResourceLocation id(String id) {
        return new ResourceLocation(MODID, id);
    }
    public static final Logger LOGGER = LogManager.getLogger(WaxableCoral.class);

    public static void init() {
        Register.init();
    }

    public static final TagKey<Block> WAXED_CORAL_BLOCKS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_coral_blocks"));
    public static final TagKey<Block> WAXED_CORAL_PLANTS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_coral_plants"));
    public static final TagKey<Block> WAXED_CORALS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_corals"));
    public static final TagKey<Block> WAXED_WALL_CORALS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_wall_corals"));
}
