package dhyces.waxablecoral;

import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import dhyces.waxablecoral.services.Services;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

public class Register {
    protected Register() {}
    public static void init() {}

    public static final CommonRegistryObject<Block> WAXED_TUBE_CORAL_BLOCK = registerVanillaCoralBlock("waxed_tube_coral_block", DyeColor.BLUE);
    public static final CommonRegistryObject<Block> WAXED_BRAIN_CORAL_BLOCK = registerVanillaCoralBlock("waxed_brain_coral_block", DyeColor.PINK);
    public static final CommonRegistryObject<Block> WAXED_BUBBLE_CORAL_BLOCK = registerVanillaCoralBlock("waxed_bubble_coral_block", DyeColor.PURPLE);
    public static final CommonRegistryObject<Block> WAXED_FIRE_CORAL_BLOCK = registerVanillaCoralBlock("waxed_fire_coral_block", DyeColor.RED);
    public static final CommonRegistryObject<Block> WAXED_HORN_CORAL_BLOCK = registerVanillaCoralBlock("waxed_horn_coral_block", DyeColor.YELLOW);

    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_TUBE_CORAL = registerVanillaCoralPlantBlock("waxed_tube_coral", DyeColor.BLUE);
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_BRAIN_CORAL = registerVanillaCoralPlantBlock("waxed_brain_coral", DyeColor.PINK);
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_BUBBLE_CORAL = registerVanillaCoralPlantBlock("waxed_bubble_coral", DyeColor.PURPLE);
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_FIRE_CORAL = registerVanillaCoralPlantBlock("waxed_fire_coral", DyeColor.RED);
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_HORN_CORAL = registerVanillaCoralPlantBlock("waxed_horn_coral", DyeColor.YELLOW);

    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_TUBE_CORAL_FAN = registerVanillaCoralFanBlock("waxed_tube_coral_fan", DyeColor.BLUE);
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_BRAIN_CORAL_FAN = registerVanillaCoralFanBlock("waxed_brain_coral_fan", DyeColor.PINK);
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_BUBBLE_CORAL_FAN = registerVanillaCoralFanBlock("waxed_bubble_coral_fan", DyeColor.PURPLE);
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_FIRE_CORAL_FAN = registerVanillaCoralFanBlock("waxed_fire_coral_fan", DyeColor.RED);
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_HORN_CORAL_FAN = registerVanillaCoralFanBlock("waxed_horn_coral_fan", DyeColor.YELLOW);

    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_TUBE_CORAL_WALL_FAN = registerVanillaCoralWallFanBlock("waxed_tube_coral_wall_fan", DyeColor.BLUE);
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_BRAIN_CORAL_WALL_FAN = registerVanillaCoralWallFanBlock("waxed_brain_coral_wall_fan", DyeColor.PINK);
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_BUBBLE_CORAL_WALL_FAN = registerVanillaCoralWallFanBlock("waxed_bubble_coral_wall_fan", DyeColor.PURPLE);
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_FIRE_CORAL_WALL_FAN = registerVanillaCoralWallFanBlock("waxed_fire_coral_wall_fan", DyeColor.RED);
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_HORN_CORAL_WALL_FAN = registerVanillaCoralWallFanBlock("waxed_horn_coral_wall_fan", DyeColor.YELLOW);

    public static final CommonRegistryObject<BlockItem> WAXED_TUBE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_TUBE_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_BRAIN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BRAIN_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_BUBBLE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_FIRE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_FIRE_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_HORN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_HORN_CORAL_BLOCK);

    public static final CommonRegistryObject<BlockItem> WAXED_TUBE_CORAL_ITEM = registerPlantItem(WAXED_TUBE_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_BRAIN_CORAL_ITEM = registerPlantItem(WAXED_BRAIN_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_BUBBLE_CORAL_ITEM = registerPlantItem(WAXED_BUBBLE_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_FIRE_CORAL_ITEM = registerPlantItem(WAXED_FIRE_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_HORN_CORAL_ITEM = registerPlantItem(WAXED_HORN_CORAL);

    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_TUBE_CORAL_FAN_ITEM = registerFanItem(WAXED_TUBE_CORAL_FAN, WAXED_TUBE_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_BRAIN_CORAL_FAN_ITEM = registerFanItem(WAXED_BRAIN_CORAL_FAN, WAXED_BRAIN_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_BUBBLE_CORAL_FAN_ITEM = registerFanItem(WAXED_BUBBLE_CORAL_FAN, WAXED_BUBBLE_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_FIRE_CORAL_FAN_ITEM = registerFanItem(WAXED_FIRE_CORAL_FAN, WAXED_FIRE_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_HORN_CORAL_FAN_ITEM = registerFanItem(WAXED_HORN_CORAL_FAN, WAXED_HORN_CORAL_WALL_FAN);

    protected static CommonRegistryObject<Block> registerVanillaCoralBlock(String id, DyeColor color) {
        return registerCoralBlock(id, BlockBehaviour.Properties.of(Material.STONE, color).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK));
    }

    protected static CommonRegistryObject<BaseCoralPlantBlock> registerVanillaCoralPlantBlock(String id, DyeColor color) {
        return registerCoralPlantBlock(id, BlockBehaviour.Properties.of(Material.WATER_PLANT, color).noCollission().instabreak().sound(SoundType.WET_GRASS));
    }

    protected static CommonRegistryObject<BaseCoralFanBlock> registerVanillaCoralFanBlock(String id, DyeColor color) {
        return registerCoralFanBlock(id, BlockBehaviour.Properties.of(Material.WATER_PLANT, color).noCollission().instabreak().sound(SoundType.WET_GRASS));
    }

    protected static CommonRegistryObject<BaseCoralWallFanBlock> registerVanillaCoralWallFanBlock(String id, DyeColor color) {
        return registerCoralWallFanBlock(id, BlockBehaviour.Properties.of(Material.WATER_PLANT, color).noCollission().instabreak().sound(SoundType.WET_GRASS));
    }

    protected static BlockBehaviour.Properties coralBlockProperties(MaterialColor color, SoundType soundType) {
        return BlockBehaviour.Properties.of(Material.STONE, color).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(soundType);
    }

    protected static BlockBehaviour.Properties coralPlantBlockProperties(MaterialColor color, SoundType soundType) {
        return BlockBehaviour.Properties.of(Material.WATER_PLANT, color).noCollission().instabreak().sound(soundType);
    }

    protected static BlockBehaviour.Properties coralFanBlockProperties(MaterialColor color, SoundType soundType) {
        return BlockBehaviour.Properties.of(Material.WATER_PLANT, color).noCollission().instabreak().sound(soundType);
    }

    protected static BlockBehaviour.Properties coralWallFanBlockProperties(MaterialColor color, SoundType soundType) {
        return BlockBehaviour.Properties.of(Material.WATER_PLANT, color).noCollission().instabreak().sound(soundType);
    }

    protected static CommonRegistryObject<Block> registerCoralBlock(String id, BlockBehaviour.Properties properties) {
        return registerBlock(id, () -> new Block(properties));
    }

    protected static CommonRegistryObject<BaseCoralPlantBlock> registerCoralPlantBlock(String id, BlockBehaviour.Properties properties) {
        return registerBlock(id, () -> Services.PLATFORM_HELPER.createCoralPlantBlock(properties));
    }

    protected static CommonRegistryObject<BaseCoralFanBlock> registerCoralFanBlock(String id, BlockBehaviour.Properties properties) {
        return registerBlock(id, () -> Services.PLATFORM_HELPER.createCoralFanBlock(properties));
    }

    protected static CommonRegistryObject<BaseCoralWallFanBlock> registerCoralWallFanBlock(String id, BlockBehaviour.Properties properties) {
        return registerBlock(id, () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(properties));
    }

    protected static <T extends Block> CommonRegistryObject<BlockItem> registerBlockItem(CommonRegistryObject<T> block) {
        return registerItem(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    }

    protected static <T extends Block> CommonRegistryObject<BlockItem> registerPlantItem(CommonRegistryObject<T> block) {
        return registerItem(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    }

    protected static <T extends Block, E extends Block> CommonRegistryObject<StandingAndWallBlockItem> registerFanItem(CommonRegistryObject<T> standingBlock, CommonRegistryObject<E> wallBlock) {
        return registerItem(standingBlock.getId().getPath(), () -> new StandingAndWallBlockItem(standingBlock.get(), wallBlock.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    }

    protected static <T extends Block> CommonRegistryObject<T> registerBlock(String id, Supplier<T> objectSupplier) {
        return register(id, Registry.BLOCK_REGISTRY, objectSupplier);
    }

    protected static <T extends Item> CommonRegistryObject<T> registerItem(String id, Supplier<T> objectSupplier) {
        return register(id, Registry.ITEM_REGISTRY, objectSupplier);
    }

    protected static <T, E extends T> CommonRegistryObject<E> register(String id, ResourceKey<? extends Registry<T>> registryKey, Supplier<E> objectSupplier) {
        return Services.PLATFORM_HELPER.register(id, cast(registryKey), objectSupplier);
    }

    static <T> T cast(Object o) {
        return (T) o;
    }
}
