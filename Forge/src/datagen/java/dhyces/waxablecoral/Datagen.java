package dhyces.waxablecoral;

import dhyces.waxablecoral.data.ModBlockLootTableProvider;
import dhyces.waxablecoral.data.ModBlockStateProvider;
import dhyces.waxablecoral.data.ModClientTagProvider;
import dhyces.waxablecoral.data.ModLangProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WaxableCoral.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Datagen {

    @SubscribeEvent
    static void gatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        event.getGenerator().addProvider(event.includeClient(), new ModBlockStateProvider(output, WaxableCoral.MODID, event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModLangProvider(output, WaxableCoral.MODID, "en_us"));
        event.getGenerator().addProvider(event.includeClient(), new ModClientTagProvider(output, event.getLookupProvider(), event.getExistingFileHelper()));

        event.getGenerator().addProvider(event.includeServer(), new ModBlockLootTableProvider(output));
    }
}
