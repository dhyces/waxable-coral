package dhyces.waxablecoral;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WaxableCoral {
    public static final String MODID = "waxablecoral";
    public static Identifier id(String id) {
        return Identifier.fromNamespaceAndPath(MODID, id);
    }
    public static <T> ResourceKey<T> key(ResourceKey<? extends Registry<T>> registryKey, String id) {
        return ResourceKey.create(registryKey, id(id));
    }
    public static final Logger LOGGER = LogManager.getLogger(WaxableCoral.class);

    public static void init() {
        Register.init();
    }

    public static final TagKey<Block> WAXED_CORAL_BLOCKS = TagKey.create(Registries.BLOCK, id("waxed_coral_blocks"));
    public static final TagKey<Block> WAXED_CORAL_PLANTS = TagKey.create(Registries.BLOCK, id("waxed_coral_plants"));
    public static final TagKey<Block> WAXED_CORALS = TagKey.create(Registries.BLOCK, id("waxed_corals"));
    public static final TagKey<Block> WAXED_WALL_CORALS = TagKey.create(Registries.BLOCK, id("waxed_wall_corals"));
}
