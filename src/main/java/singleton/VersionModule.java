package singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VersionModule {

    @Provides
    public Integer provideAppVersion() {
        return 129;
    }
}
