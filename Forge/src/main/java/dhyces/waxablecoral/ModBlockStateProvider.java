package dhyces.waxablecoral;

import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
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
    }

    private <T extends Block> void unwaxedVanilla(CommonRegistryObject<T> block) {
        ResourceLocation unwaxed = mcLoc(block.getId().getPath().substring(block.getId().getPath().indexOf('_')+1));
        simpleBlock(block.get(), getUncheckedModel(block(unwaxed)));
        itemModels().withExistingParent(block.getId().getPath(), unwaxed);
    }

    private <T extends Block> void unwaxedVanillaWallFan(CommonRegistryObject<T> block) {
        ResourceLocation unwaxed = mcLoc(block.getId().getPath().substring(block.getId().getPath().indexOf('_')+1));
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
