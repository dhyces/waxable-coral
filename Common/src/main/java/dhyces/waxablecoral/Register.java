package dhyces.waxablecoral;

import dhyces.waxablecoral.services.Services;
import net.minecraft.core.Direction;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class Register {
    public static void init() {}

    public static final Supplier<Block> WAXED_TUBE_CORAL_BLOCK = registerBlock("waxed_tube_coral_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Supplier<Block> WAXED_BRAIN_CORAL_BLOCK = registerBlock("waxed_brain_coral_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Supplier<Block> WAXED_BUBBLE_CORAL_BLOCK = registerBlock("waxed_bubble_coral_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Supplier<Block> WAXED_FIRE_CORAL_BLOCK = registerBlock("waxed_fire_coral_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Supplier<Block> WAXED_HORN_CORAL_BLOCK = registerBlock("waxed_horn_coral_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.HORN_CORAL_BLOCK)));
    
    public static final Supplier<BaseCoralPlantBlock> WAXED_TUBE_CORAL = registerBlock("waxed_tube_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(Blocks.TUBE_CORAL)));
    public static final Supplier<BaseCoralPlantBlock> WAXED_BRAIN_CORAL = registerBlock("waxed_brain_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL)));
    public static final Supplier<BaseCoralPlantBlock> WAXED_BUBBLE_CORAL = registerBlock("waxed_bubble_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL)));
    public static final Supplier<BaseCoralPlantBlock> WAXED_FIRE_CORAL = registerBlock("waxed_fire_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(Blocks.FIRE_CORAL)));
    public static final Supplier<BaseCoralPlantBlock> WAXED_HORN_CORAL = registerBlock("waxed_horn_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(Blocks.HORN_CORAL)));

    public static final Supplier<BaseCoralFanBlock> WAXED_TUBE_CORAL_FAN = registerBlock("waxed_tube_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(Blocks.TUBE_CORAL_FAN)));
    public static final Supplier<BaseCoralFanBlock> WAXED_BRAIN_CORAL_FAN = registerBlock("waxed_brain_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL_FAN)));
    public static final Supplier<BaseCoralFanBlock> WAXED_BUBBLE_CORAL_FAN = registerBlock("waxed_bubble_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_FAN)));
    public static final Supplier<BaseCoralFanBlock> WAXED_FIRE_CORAL_FAN = registerBlock("waxed_fire_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(Blocks.FIRE_CORAL_FAN)));
    public static final Supplier<BaseCoralFanBlock> WAXED_HORN_CORAL_FAN = registerBlock("waxed_horn_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(Blocks.HORN_CORAL_FAN)));
    
    public static final Supplier<BaseCoralWallFanBlock> WAXED_TUBE_CORAL_WALL_FAN = registerBlock("waxed_tube_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(Blocks.TUBE_CORAL_WALL_FAN)));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_BRAIN_CORAL_WALL_FAN = registerBlock("waxed_brain_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL_WALL_FAN)));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_BUBBLE_CORAL_WALL_FAN = registerBlock("waxed_bubble_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_WALL_FAN)));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_FIRE_CORAL_WALL_FAN = registerBlock("waxed_fire_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(Blocks.FIRE_CORAL_WALL_FAN)));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_HORN_CORAL_WALL_FAN = registerBlock("waxed_horn_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(Blocks.HORN_CORAL_WALL_FAN)));
    
    public static final Supplier<BlockItem> WAXED_TUBE_CORAL_BLOCK_ITEM = registerBlockItem("waxed_tube_coral_block", WAXED_TUBE_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_BRAIN_CORAL_BLOCK_ITEM = registerBlockItem("waxed_brain_coral_block", WAXED_BRAIN_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_BUBBLE_CORAL_BLOCK_ITEM = registerBlockItem("waxed_bubble_coral_block", WAXED_BUBBLE_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_FIRE_CORAL_BLOCK_ITEM = registerBlockItem("waxed_fire_coral_block", WAXED_FIRE_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_HORN_CORAL_BLOCK_ITEM = registerBlockItem("waxed_horn_coral_block", WAXED_HORN_CORAL_BLOCK);
    
    public static final Supplier<BlockItem> WAXED_TUBE_CORAL_ITEM = registerBlockItem("waxed_tube_coral", WAXED_TUBE_CORAL);
    public static final Supplier<BlockItem> WAXED_BRAIN_CORAL_ITEM = registerBlockItem("waxed_brain_coral", WAXED_BRAIN_CORAL);
    public static final Supplier<BlockItem> WAXED_BUBBLE_CORAL_ITEM = registerBlockItem("waxed_bubble_coral", WAXED_BUBBLE_CORAL);
    public static final Supplier<BlockItem> WAXED_FIRE_CORAL_ITEM = registerBlockItem("waxed_fire_coral", WAXED_FIRE_CORAL);
    public static final Supplier<BlockItem> WAXED_HORN_CORAL_ITEM = registerBlockItem("waxed_horn_coral", WAXED_HORN_CORAL);
    
    public static final Supplier<StandingAndWallBlockItem> WAXED_TUBE_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_tube_coral_fan", WAXED_TUBE_CORAL_FAN, WAXED_TUBE_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_BRAIN_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_brain_coral_fan", WAXED_BRAIN_CORAL_FAN, WAXED_BRAIN_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_BUBBLE_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_bubble_coral_fan", WAXED_BUBBLE_CORAL_FAN, WAXED_BUBBLE_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_FIRE_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_fire_coral_fan", WAXED_FIRE_CORAL_FAN, WAXED_FIRE_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_HORN_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_horn_coral_fan", WAXED_HORN_CORAL_FAN, WAXED_HORN_CORAL_WALL_FAN);

    protected static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> objectSupplier) {
        return Services.PLATFORM_HELPER.registerBlock(id, objectSupplier);
    }

    protected static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> objectSupplier) {
        return Services.PLATFORM_HELPER.registerItem(id, objectSupplier);
    }

    protected static <T extends Block> Supplier<BlockItem> registerBlockItem(String id, Supplier<T> block) {
        return registerItem(id, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    protected static <T extends Block, E extends Block> Supplier<StandingAndWallBlockItem> registerStandingWallBlockItem(String id, Supplier<T> standingBlock, Supplier<E> wallBlock) {
        return registerItem(id, () -> new StandingAndWallBlockItem(standingBlock.get(), wallBlock.get(), new Item.Properties(), Direction.DOWN));
    }
}
