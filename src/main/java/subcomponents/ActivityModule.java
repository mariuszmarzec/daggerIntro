package subcomponents;

import componentbuilder.Application;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    String provideWelcomeText(Application application) {
        return "Welcome in app: " + application.getName();
    }
}
