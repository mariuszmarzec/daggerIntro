package singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

import javax.inject.Singleton;

@Module
public class VersionModule {

    @Provides
    @Singleton
    public Integer provideAppVersion() {
        return 129;
    }

    @Provides
    @Reusable
    public Double provideAppPrice() {
        return 3.50;
    }
}
