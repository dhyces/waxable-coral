package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import dhyces.waxablecoral.WaxableCoral;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class FabricPlatformHelper implements PlatformHelper {

    @Override
    public Holder<Block> registerBlock(String id, Block copyPropertiesOf, Function<Block.Properties, Block> blockFunction) {
        var key = WaxableCoral.key(Registries.BLOCK, id);
        var properties = BlockBehaviour.Properties.ofFullCopy(copyPropertiesOf).setId(key);
        return Registry.registerForHolder(BuiltInRegistries.BLOCK, key, blockFunction.apply(properties));
    }

    @Override
    public Holder<Block> registerBlock(String id, Function<Block.Properties, Block> blockFunction) {
        var key = WaxableCoral.key(Registries.BLOCK, id);
        var properties = BlockBehaviour.Properties.of().setId(key);
        return Registry.registerForHolder(BuiltInRegistries.BLOCK, key, blockFunction.apply(properties));
    }

    @Override
    public Holder<Item> registerItem(String id, Function<Item.Properties, Item> itemFunction) {
        var key = WaxableCoral.key(Registries.ITEM, id);
        var properties = new Item.Properties().setId(key);
        return Registry.registerForHolder(BuiltInRegistries.ITEM, key, itemFunction.apply(properties));
    }

    @Override
    public BaseCoralPlantBlock createCoralPlantBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralPlantBlock(properties);
    }

    @Override
    public BaseCoralFanBlock createCoralFanBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralFanBlock(properties);
    }

    @Override
    public BaseCoralWallFanBlock createCoralWallFanBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralWallFanBlock(properties);
    }

    @Override
    public BiMap<Block, Block> getWaxMap() {
        return HoneycombItem.WAXABLES.get();
    }
}
