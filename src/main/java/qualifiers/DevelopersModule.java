package qualifiers;

import dagger.Module;
import dagger.Provides;

@Module
public class DevelopersModule {

    @Provides
    @IosDev
    public Employer provideIosDeveloper() {
        return new IosDeveloper();
    }

    @Provides
    @AndroidDev
    public Employer provideAndroidDeveloper() {
        return new AndroidDeveloper();
    }
}
