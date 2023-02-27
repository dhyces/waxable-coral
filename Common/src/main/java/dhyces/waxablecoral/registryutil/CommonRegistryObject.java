package dhyces.waxablecoral.registryutil;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public interface CommonRegistryObject<T> extends Supplier<T> {

    static <T> CommonRegistryObject<T> of(ResourceKey<T> registryKey, Supplier<T> supplier) {
        return new Impl<>(registryKey, supplier);
    }

    ResourceLocation getId();

    boolean isPresent();

    class Impl<T> implements CommonRegistryObject<T> {
        private final Supplier<T> supplier;
        private transient T stored;
        private final ResourceKey<T> key;

        Impl(ResourceKey<T> registryKey, Supplier<T> supplier) {
            this.key = registryKey;
            this.supplier = supplier;
        }


        @Override
        public T get() {
            synchronized (this) {
                if (stored == null) {
                    this.stored = supplier.get();
                }
            }
            return this.stored;
        }

        @Override
        public ResourceLocation getId() {
            return key.location();
        }

        @Override
        public boolean isPresent() {
            return key != null;
        }
    }
}
