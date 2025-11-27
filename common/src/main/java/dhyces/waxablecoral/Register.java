package dhyces.waxablecoral;

import dhyces.waxablecoral.services.Services;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public class Register {
    public static void init() {}
    
    public static final Holder<Block> WAXED_TUBE_CORAL_BLOCK = registerBlock("waxed_tube_coral_block", Blocks.TUBE_CORAL_BLOCK, Block::new);
    public static final Holder<Block> WAXED_BRAIN_CORAL_BLOCK = registerBlock("waxed_brain_coral_block", Blocks.BRAIN_CORAL_BLOCK, Block::new);
    public static final Holder<Block> WAXED_BUBBLE_CORAL_BLOCK = registerBlock("waxed_bubble_coral_block", Blocks.BUBBLE_CORAL_BLOCK, Block::new);
    public static final Holder<Block> WAXED_FIRE_CORAL_BLOCK = registerBlock("waxed_fire_coral_block", Blocks.FIRE_CORAL_BLOCK, Block::new);
    public static final Holder<Block> WAXED_HORN_CORAL_BLOCK = registerBlock("waxed_horn_coral_block", Blocks.HORN_CORAL_BLOCK, Block::new);
    
    public static final Holder<Block> WAXED_TUBE_CORAL = registerBlock("waxed_tube_coral", Blocks.TUBE_CORAL, Services.PLATFORM_HELPER::createCoralPlantBlock);
    public static final Holder<Block> WAXED_BRAIN_CORAL = registerBlock("waxed_brain_coral", Blocks.BRAIN_CORAL, Services.PLATFORM_HELPER::createCoralPlantBlock);
    public static final Holder<Block> WAXED_BUBBLE_CORAL = registerBlock("waxed_bubble_coral", Blocks.BUBBLE_CORAL, Services.PLATFORM_HELPER::createCoralPlantBlock);
    public static final Holder<Block> WAXED_FIRE_CORAL = registerBlock("waxed_fire_coral", Blocks.FIRE_CORAL, Services.PLATFORM_HELPER::createCoralPlantBlock);
    public static final Holder<Block> WAXED_HORN_CORAL = registerBlock("waxed_horn_coral", Blocks.HORN_CORAL, Services.PLATFORM_HELPER::createCoralPlantBlock);

    public static final Holder<Block> WAXED_TUBE_CORAL_FAN = registerBlock("waxed_tube_coral_fan", Blocks.TUBE_CORAL_FAN, Services.PLATFORM_HELPER::createCoralFanBlock);
    public static final Holder<Block> WAXED_BRAIN_CORAL_FAN = registerBlock("waxed_brain_coral_fan", Blocks.BRAIN_CORAL_FAN, Services.PLATFORM_HELPER::createCoralFanBlock);
    public static final Holder<Block> WAXED_BUBBLE_CORAL_FAN = registerBlock("waxed_bubble_coral_fan", Blocks.BUBBLE_CORAL_FAN, Services.PLATFORM_HELPER::createCoralFanBlock);
    public static final Holder<Block> WAXED_FIRE_CORAL_FAN = registerBlock("waxed_fire_coral_fan", Blocks.FIRE_CORAL_FAN, Services.PLATFORM_HELPER::createCoralFanBlock);
    public static final Holder<Block> WAXED_HORN_CORAL_FAN = registerBlock("waxed_horn_coral_fan", Blocks.HORN_CORAL_FAN, Services.PLATFORM_HELPER::createCoralFanBlock);
    
    public static final Holder<Block> WAXED_TUBE_CORAL_WALL_FAN = registerBlock("waxed_tube_coral_wall_fan", Blocks.TUBE_CORAL_WALL_FAN, Services.PLATFORM_HELPER::createCoralWallFanBlock);
    public static final Holder<Block> WAXED_BRAIN_CORAL_WALL_FAN = registerBlock("waxed_brain_coral_wall_fan", Blocks.BRAIN_CORAL_WALL_FAN, Services.PLATFORM_HELPER::createCoralWallFanBlock);
    public static final Holder<Block> WAXED_BUBBLE_CORAL_WALL_FAN = registerBlock("waxed_bubble_coral_wall_fan", Blocks.BUBBLE_CORAL_WALL_FAN, Services.PLATFORM_HELPER::createCoralWallFanBlock);
    public static final Holder<Block> WAXED_FIRE_CORAL_WALL_FAN = registerBlock("waxed_fire_coral_wall_fan", Blocks.FIRE_CORAL_WALL_FAN, Services.PLATFORM_HELPER::createCoralWallFanBlock);
    public static final Holder<Block> WAXED_HORN_CORAL_WALL_FAN = registerBlock("waxed_horn_coral_wall_fan", Blocks.HORN_CORAL_WALL_FAN, Services.PLATFORM_HELPER::createCoralWallFanBlock);
    
    public static final Holder<Item> WAXED_TUBE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_TUBE_CORAL_BLOCK);
    public static final Holder<Item> WAXED_BRAIN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BRAIN_CORAL_BLOCK);
    public static final Holder<Item> WAXED_BUBBLE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL_BLOCK);
    public static final Holder<Item> WAXED_FIRE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_FIRE_CORAL_BLOCK);
    public static final Holder<Item> WAXED_HORN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_HORN_CORAL_BLOCK);
    
    public static final Holder<Item> WAXED_TUBE_CORAL_ITEM = registerBlockItem(WAXED_TUBE_CORAL);
    public static final Holder<Item> WAXED_BRAIN_CORAL_ITEM = registerBlockItem(WAXED_BRAIN_CORAL);
    public static final Holder<Item> WAXED_BUBBLE_CORAL_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL);
    public static final Holder<Item> WAXED_FIRE_CORAL_ITEM = registerBlockItem(WAXED_FIRE_CORAL);
    public static final Holder<Item> WAXED_HORN_CORAL_ITEM = registerBlockItem(WAXED_HORN_CORAL);
    
    public static final Holder<Item> WAXED_TUBE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_TUBE_CORAL_FAN, WAXED_TUBE_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_BRAIN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BRAIN_CORAL_FAN, WAXED_BRAIN_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_BUBBLE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BUBBLE_CORAL_FAN, WAXED_BUBBLE_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_FIRE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_FIRE_CORAL_FAN, WAXED_FIRE_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_HORN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_HORN_CORAL_FAN, WAXED_HORN_CORAL_WALL_FAN);

    private static Holder<Block> registerBlock(String id, Block copyPropertiesOf, Function<Block.Properties, Block> blockFunction) {
        return Services.PLATFORM_HELPER.registerBlock(id, copyPropertiesOf, blockFunction);
    }

    private static Holder<Item> registerItem(String id, Function<Item.Properties, Item> itemFunction) {
        return Services.PLATFORM_HELPER.registerItem(id, itemFunction);
    }

    private static Holder<Item> registerBlockItem(Holder<Block> block) {
        var id = block.unwrapKey().orElseThrow().location().getPath();
        return registerItem(id, props -> new BlockItem(block.value(), props.useBlockDescriptionPrefix()));
    }

    private static Holder<Item> registerStandingWallBlockItem(Holder<Block> standingBlock, Holder<Block> wallBlock) {
        var id = standingBlock.unwrapKey().orElseThrow().location().getPath();
        return registerItem(id, props -> new StandingAndWallBlockItem(standingBlock.value(), wallBlock.value(), Direction.DOWN, props.useBlockDescriptionPrefix()));
    }
}
