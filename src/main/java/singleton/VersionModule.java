package singleton;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class VersionModule {

    @Provides
    @Singleton
    public Integer provideAppVersion() {
        return 129;
    }
}
