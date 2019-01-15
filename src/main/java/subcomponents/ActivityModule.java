package subcomponents;

import componentbuilder.Application;
import dagger.Module;
import dagger.Provides;
import singleton.ActivityScope;

@Module
public class ActivityModule {

    @Provides
    @ActivityScope
    String provideWelcomeText(Application application) {
        return "Welcome in app: " + application.getName();
    }
}
