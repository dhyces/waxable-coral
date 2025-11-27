package dhyces.waxablecoral.data;

import dhyces.waxablecoral.Register;
import dhyces.waxablecoral.WaxableCoral;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, WaxableCoral.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        createCrossBlockWithDefaultItem(blockModels, Register.WAXED_TUBE_CORAL, Blocks.TUBE_CORAL);
        createCrossBlockWithDefaultItem(blockModels, Register.WAXED_BRAIN_CORAL, Blocks.BRAIN_CORAL);
        createCrossBlockWithDefaultItem(blockModels, Register.WAXED_BUBBLE_CORAL, Blocks.BUBBLE_CORAL);
        createCrossBlockWithDefaultItem(blockModels, Register.WAXED_FIRE_CORAL, Blocks.FIRE_CORAL);
        createCrossBlockWithDefaultItem(blockModels, Register.WAXED_HORN_CORAL, Blocks.HORN_CORAL);

        createTrivialBlock(blockModels, Register.WAXED_TUBE_CORAL_BLOCK, Blocks.TUBE_CORAL_BLOCK);
        createTrivialBlock(blockModels, Register.WAXED_BRAIN_CORAL_BLOCK, Blocks.BRAIN_CORAL_BLOCK);
        createTrivialBlock(blockModels, Register.WAXED_BUBBLE_CORAL_BLOCK, Blocks.BUBBLE_CORAL_BLOCK);
        createTrivialBlock(blockModels, Register.WAXED_FIRE_CORAL_BLOCK, Blocks.FIRE_CORAL_BLOCK);
        createTrivialBlock(blockModels, Register.WAXED_HORN_CORAL_BLOCK, Blocks.HORN_CORAL_BLOCK);

        createCoralFans(
                blockModels,
                Register.WAXED_TUBE_CORAL_FAN,
                Register.WAXED_TUBE_CORAL_WALL_FAN,
                Blocks.TUBE_CORAL_FAN,
                Blocks.TUBE_CORAL_WALL_FAN
        );
        createCoralFans(
                blockModels,
                Register.WAXED_BRAIN_CORAL_FAN,
                Register.WAXED_BRAIN_CORAL_WALL_FAN,
                Blocks.BRAIN_CORAL_FAN,
                Blocks.BRAIN_CORAL_WALL_FAN
        );
        createCoralFans(
                blockModels,
                Register.WAXED_BUBBLE_CORAL_FAN,
                Register.WAXED_BUBBLE_CORAL_WALL_FAN,
                Blocks.BUBBLE_CORAL_FAN,
                Blocks.BUBBLE_CORAL_WALL_FAN
        );
        createCoralFans(
                blockModels,
                Register.WAXED_FIRE_CORAL_FAN,
                Register.WAXED_FIRE_CORAL_WALL_FAN,
                Blocks.FIRE_CORAL_FAN,
                Blocks.FIRE_CORAL_WALL_FAN
        );
        createCoralFans(
                blockModels,
                Register.WAXED_HORN_CORAL_FAN,
                Register.WAXED_HORN_CORAL_WALL_FAN,
                Blocks.HORN_CORAL_FAN,
                Blocks.HORN_CORAL_WALL_FAN
        );
    }

    /** Modified from vanilla {@link BlockModelGenerators#createCoralFans(Block, Block)} */
    public void createCoralFans(
            BlockModelGenerators blockModels,
            Holder<Block> coralFanBlock,
            Holder<Block> coralWallFanBlock,
            Block vanillaCoralFanBlock,
            Block vanillaCoralWallFanBlock
    ) {
        var vanillaFanId = ModelLocationUtils.getModelLocation(vanillaCoralFanBlock);
        var vanillaWallFanId = ModelLocationUtils.getModelLocation(vanillaCoralWallFanBlock);
        MultiVariant fan = BlockModelGenerators.plainVariant(vanillaFanId);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(coralFanBlock.value(), fan));
        MultiVariant wallFan = BlockModelGenerators.plainVariant(vanillaWallFanId);
        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(coralWallFanBlock.value(), wallFan)
                        .with(BlockModelGenerators.ROTATION_HORIZONTAL_FACING)
        );
        blockModels.registerSimpleItemModel(coralFanBlock.value(), ModelLocationUtils.getModelLocation(vanillaCoralFanBlock.asItem()));
    }

    /** Modified from vanilla {@link BlockModelGenerators#createCrossBlockWithDefaultItem(Block, BlockModelGenerators.PlantType)} */
    public void createCrossBlockWithDefaultItem(
            BlockModelGenerators blockModels,
            Holder<Block> block,
            Block vanillaBlock
    ) {
        blockModels.registerSimpleItemModel(block.value().asItem(), ModelLocationUtils.getModelLocation(vanillaBlock.asItem()));
        MultiVariant multivariant = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(vanillaBlock));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.value(), multivariant));
    }

    public void createTrivialBlock(BlockModelGenerators blockModels, Holder<Block> block, Block vanillaBlock) {
        MultiVariant multiVariant = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(vanillaBlock));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block.value(), multiVariant));
        blockModels.registerSimpleItemModel(block.value(), ModelLocationUtils.getModelLocation(vanillaBlock));
    }
}
