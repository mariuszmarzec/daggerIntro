package qualifiers;

import dagger.Module;
import dagger.Provides;

@Module
public class DevelopersModule {

    public Employer provideIosDeveloper() {
        return new IosDeveloper();
    }

    public Employer provideAndroidDeveloper() {
        return new AndroidDeveloper();
    }
}
