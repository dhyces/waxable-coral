package dhyces.waxablecoral.integration.data;

import dhyces.waxablecoral.integration.ua.UpgradeAquaticCompat;
import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CompatBlockStateProvider extends BlockStateProvider {

    public CompatBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
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

    private <T extends Block> void unwaxedUpgradeAquatic(CommonRegistryObject<T> block) {
        ResourceLocation unwaxed = new ResourceLocation("upgrade_aquatic", block.getId().getPath().substring(block.getId().getPath().indexOf('_')+1));
        simpleBlock(block.get(), getUncheckedModel(block(unwaxed)));
        itemModels().getBuilder(block.getId().getPath()).parent(getUncheckedModel(item(unwaxed)));
    }

    private <T extends Block> void unwaxedUpgradeAquaticWallFan(CommonRegistryObject<T> block) {
        ResourceLocation unwaxed = new ResourceLocation("upgrade_aquatic", block.getId().getPath().substring(block.getId().getPath().indexOf('_')+1));
        horizontalBlock(block.get(), getUncheckedModel(block(unwaxed)));
    }

    private ResourceLocation block(ResourceLocation id) {
        return new ResourceLocation(id.getNamespace(), "block/" + id.getPath());
    }

    private ResourceLocation item(ResourceLocation id) {
        return new ResourceLocation(id.getNamespace(), "item/" + id.getPath());
    }

    private ModelFile.UncheckedModelFile getUncheckedModel(ResourceLocation id) {
        return new ModelFile.UncheckedModelFile(id);
    }
}
