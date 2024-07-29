package dhyces.waxablecoral.data;

import dhyces.waxablecoral.Register;
import dhyces.waxablecoral.integration.upgradeaquatic.UpgradeAquaticCompat;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        unwaxedVanilla(Register.WAXED_TUBE_CORAL_BLOCK);
        unwaxedVanilla(Register.WAXED_BRAIN_CORAL_BLOCK);
        unwaxedVanilla(Register.WAXED_BUBBLE_CORAL_BLOCK);
        unwaxedVanilla(Register.WAXED_FIRE_CORAL_BLOCK);
        unwaxedVanilla(Register.WAXED_HORN_CORAL_BLOCK);

        unwaxedVanilla(Register.WAXED_TUBE_CORAL);
        unwaxedVanilla(Register.WAXED_BRAIN_CORAL);
        unwaxedVanilla(Register.WAXED_BUBBLE_CORAL);
        unwaxedVanilla(Register.WAXED_FIRE_CORAL);
        unwaxedVanilla(Register.WAXED_HORN_CORAL);

        unwaxedVanilla(Register.WAXED_TUBE_CORAL_FAN);
        unwaxedVanilla(Register.WAXED_BRAIN_CORAL_FAN);
        unwaxedVanilla(Register.WAXED_BUBBLE_CORAL_FAN);
        unwaxedVanilla(Register.WAXED_FIRE_CORAL_FAN);
        unwaxedVanilla(Register.WAXED_HORN_CORAL_FAN);

        unwaxedVanillaWallFan(Register.WAXED_TUBE_CORAL_WALL_FAN);
        unwaxedVanillaWallFan(Register.WAXED_BRAIN_CORAL_WALL_FAN);
        unwaxedVanillaWallFan(Register.WAXED_BUBBLE_CORAL_WALL_FAN);
        unwaxedVanillaWallFan(Register.WAXED_FIRE_CORAL_WALL_FAN);
        unwaxedVanillaWallFan(Register.WAXED_HORN_CORAL_WALL_FAN);

        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_ACAN_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_FINGER_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_STAR_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_MOSS_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PETAL_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_ROCK_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_SILK_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_CHROME_CORAL_BLOCK);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_BLOCK);

        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_ACAN_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_FINGER_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_STAR_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_MOSS_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PETAL_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_BRANCH_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_ROCK_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PILLOW_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_SILK_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_CHROME_CORAL);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL);

        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_STAR_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_MOSS_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PETAL_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_ROCK_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_SILK_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_CHROME_CORAL_FAN);
        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_FAN);

        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_ACAN_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_FINGER_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_STAR_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_MOSS_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_PETAL_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_ROCK_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_SILK_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_CHROME_CORAL_WALL_FAN);
        unwaxedUpgradeAquaticWallFan(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_WALL_FAN);

        unwaxedUpgradeAquatic(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER);
    }

    private <T extends Block> void unwaxedVanilla(Supplier<T> block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block.get());
        ResourceLocation unwaxed = mcLoc(id.getPath().substring(id.getPath().indexOf('_')+1));
        simpleBlock(block.get(), getExistingModel(block(unwaxed)));
        itemModels().withExistingParent(id.getPath(), unwaxed);
    }

    private <T extends Block> void unwaxedVanillaWallFan(Supplier<T> block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block.get());
        ResourceLocation unwaxed = mcLoc(id.getPath().substring(id.getPath().indexOf('_')+1));
        horizontalBlock(block.get(), getExistingModel(block(unwaxed)));
    }

    private <T extends Block> void unwaxedUpgradeAquatic(Supplier<T> block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block.get());
        ResourceLocation unwaxed = new ResourceLocation("upgrade_aquatic", id.getPath().substring(id.getPath().indexOf('_')+1));
        simpleBlock(block.get(), getUncheckedModel(block(unwaxed)));
        itemModels().getBuilder(id.getPath()).parent(getUncheckedModel(item(unwaxed)));
    }

    private <T extends Block> void unwaxedUpgradeAquaticWallFan(Supplier<T> block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block.get());
        ResourceLocation unwaxed = new ResourceLocation("upgrade_aquatic", id.getPath().substring(id.getPath().indexOf('_')+1));
        horizontalBlock(block.get(), getUncheckedModel(block(unwaxed)));
    }

    private ResourceLocation block(ResourceLocation id) {
        return new ResourceLocation(id.getNamespace(), "block/" + id.getPath());
    }

    private ResourceLocation item(ResourceLocation id) {
        return new ResourceLocation(id.getNamespace(), "item/" + id.getPath());
    }

    private ModelFile.ExistingModelFile getExistingModel(ResourceLocation id) {
        return new ModelFile.ExistingModelFile(id, models().existingFileHelper);
    }

    private ModelFile.UncheckedModelFile getUncheckedModel(ResourceLocation id) {
        return new ModelFile.UncheckedModelFile(id);
    }
}
