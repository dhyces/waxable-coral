package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import dhyces.waxablecoral.ForgeWaxableCoral;
import dhyces.waxablecoral.WaxableCoral;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ForgePlatformHelper implements PlatformHelper {
    private static final BiMap<Block, Block> WAXING_BIMAP = HashBiMap.create();

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
    public <T extends Item> Supplier<T> registerItem(String id, Supplier<T> objectSupplier) {
        return ForgeWaxableCoral.ITEM_REGISTER.register(id, objectSupplier);
    }

    @Override
    public <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> objectSupplier) {
        return ForgeWaxableCoral.BLOCK_REGISTER.register(id, objectSupplier);
    }

    @Override
    public BiMap<Block, Block> getWaxMap() {
        return WAXING_BIMAP;
    }
}
