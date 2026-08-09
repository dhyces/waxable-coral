package dhyces.waxablecoral.services;

import dhyces.waxablecoral.services.helpers.PlatformHelper;

import java.util.ServiceLoader;

public final class Services {

    public static final PlatformHelper PLATFORM_HELPER = loadService(PlatformHelper.class);

    private static <T> T loadService(Class<T> clazz) {
        return ServiceLoader.load(clazz).findFirst().orElseThrow();
    }
}
