package dhyces.waxablecoral.data;

import dhyces.trimmed.api.data.tags.ClientRegistryTagDataProvider;
import dhyces.trimmed.api.data.tags.appenders.ClientRegistryTagAppender;
import dhyces.trimmed.impl.client.tags.ClientRegistryTagKey;
import dhyces.waxablecoral.ForgeWaxableCoral;
import dhyces.waxablecoral.Register;
import dhyces.waxablecoral.WaxableCoral;
import dhyces.waxablecoral.integration.upgradeaquatic.UpgradeAquaticCompat;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModClientTagProvider extends ClientRegistryTagDataProvider<Item> {
    public ModClientTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProviderFuture, ExistingFileHelper existingFileHelper) {
        super(packOutput, WaxableCoral.MODID, lookupProviderFuture, Registries.ITEM, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        ClientRegistryTagAppender.RegistryAware<Item> appender = registryAwareTag(ClientRegistryTagKey.of(Registries.ITEM, new ResourceLocation("waxedicons", "renders_waxed_icon")), provider);
        
        appender.add(Register.WAXED_TUBE_CORAL_BLOCK_ITEM.get());
        appender.add(Register.WAXED_BRAIN_CORAL_BLOCK_ITEM.get());
        appender.add(Register.WAXED_BUBBLE_CORAL_BLOCK_ITEM.get());
        appender.add(Register.WAXED_FIRE_CORAL_BLOCK_ITEM.get());
        appender.add(Register.WAXED_HORN_CORAL_BLOCK_ITEM.get());
        
        appender.add(Register.WAXED_TUBE_CORAL_ITEM.get());
        appender.add(Register.WAXED_BRAIN_CORAL_ITEM.get());
        appender.add(Register.WAXED_BUBBLE_CORAL_ITEM.get());
        appender.add(Register.WAXED_FIRE_CORAL_ITEM.get());
        appender.add(Register.WAXED_HORN_CORAL_ITEM.get());
        
        appender.add(Register.WAXED_TUBE_CORAL_FAN_ITEM.get());
        appender.add(Register.WAXED_BRAIN_CORAL_FAN_ITEM.get());
        appender.add(Register.WAXED_BUBBLE_CORAL_FAN_ITEM.get());
        appender.add(Register.WAXED_FIRE_CORAL_FAN_ITEM.get());
        appender.add(Register.WAXED_HORN_CORAL_FAN_ITEM.get());
        
        appender.addOptional(UpgradeAquaticCompat.WAXED_ACAN_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_FINGER_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_STAR_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_MOSS_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PETAL_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_ROCK_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_SILK_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_CHROME_CORAL_BLOCK_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_BLOCK_ITEM.get());

        appender.addOptional(UpgradeAquaticCompat.WAXED_ACAN_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_FINGER_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_STAR_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_MOSS_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PETAL_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_ROCK_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_SILK_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_CHROME_CORAL_CORAL_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_CORAL_ITEM.get());

        appender.addOptional(UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_STAR_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_MOSS_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PETAL_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_ROCK_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_SILK_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_CHROME_CORAL_CORAL_FAN_ITEM.get());
        appender.addOptional(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_CORAL_FAN_ITEM.get());

        appender.addOptional(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER_ITEM.get());

        ForgeWaxableCoral.ITEM_REGISTER.getEntries().forEach(appender::add);

    }
}
