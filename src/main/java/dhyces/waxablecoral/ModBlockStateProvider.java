package dhyces.waxablecoral;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        unwaxedVanilla(WaxableCoral.WAXED_TUBE_CORAL_BLOCK);
        unwaxedVanilla(WaxableCoral.WAXED_BRAIN_CORAL_BLOCK);
        unwaxedVanilla(WaxableCoral.WAXED_BUBBLE_CORAL_BLOCK);
        unwaxedVanilla(WaxableCoral.WAXED_FIRE_CORAL_BLOCK);
        unwaxedVanilla(WaxableCoral.WAXED_HORN_CORAL_BLOCK);

        unwaxedVanilla(WaxableCoral.WAXED_TUBE_CORAL);
        unwaxedVanilla(WaxableCoral.WAXED_BRAIN_CORAL);
        unwaxedVanilla(WaxableCoral.WAXED_BUBBLE_CORAL);
        unwaxedVanilla(WaxableCoral.WAXED_FIRE_CORAL);
        unwaxedVanilla(WaxableCoral.WAXED_HORN_CORAL);

        unwaxedVanilla(WaxableCoral.WAXED_TUBE_CORAL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_BRAIN_CORAL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_BUBBLE_CORAL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_FIRE_CORAL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_HORN_CORAL_FAN);

        unwaxedVanilla(WaxableCoral.WAXED_TUBE_CORAL_WALL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_BRAIN_CORAL_WALL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_BUBBLE_CORAL_WALL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_FIRE_CORAL_WALL_FAN);
        unwaxedVanilla(WaxableCoral.WAXED_HORN_CORAL_WALL_FAN);
    }

    private <T extends Block> void unwaxedVanilla(RegistryObject<T> block) {
        ResourceLocation unwaxed = mcLoc(block.getId().getPath().substring(block.getId().getPath().indexOf('_')+1));
        simpleBlock(block.get(), getExistingModel(block(unwaxed)));
        if (!(block.get() instanceof BaseCoralWallFanBlock)) {
            itemModels().withExistingParent(block.getId().getPath(), unwaxed);
        }
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
}
