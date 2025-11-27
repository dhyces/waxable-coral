package dhyces.waxablecoral;

import dhyces.waxablecoral.data.ModBlockLoot;
import dhyces.waxablecoral.data.ModModelProvider;
import dhyces.waxablecoral.data.ModLangProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = WaxableCoral.MODID)
public class Datagen {

    @SubscribeEvent
    static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModLangProvider::new);
        event.createProvider(
                (output, lookupProvider) -> new LootTableProvider(
                        output,
                        Set.of(),
                        List.of(new LootTableProvider.SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)),
                        lookupProvider)
        );
    }
}
