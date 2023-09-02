package dhyces.waxablecoral.data;

import dhyces.trimmed.api.data.tags.ClientRegistryTagDataProvider;
import dhyces.trimmed.api.data.tags.appenders.ClientRegistryTagAppender;
import dhyces.trimmed.impl.client.tags.ClientRegistryTagKey;
import dhyces.waxablecoral.Register;
import dhyces.waxablecoral.WaxableCoral;
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

    ClientRegistryTagKey<Item> RENDER_WAX_ICON = ClientRegistryTagKey.of(Registries.ITEM, new ResourceLocation("waxedicons", "renders_waxed_icon"));

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        ClientRegistryTagAppender.RegistryAware<Item> appender = registryAwareTag(RENDER_WAX_ICON, provider);
        Register.ITEM.getEntries().forEach(appender::add);

    }
}
