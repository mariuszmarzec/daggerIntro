package componentbuilder;

import dagger.BindsInstance;
import dagger.Component;
import singleton.VersionModule;

import javax.inject.Singleton;

@Component(modules = {BindModule.class, VersionModule.class})
@Singleton
public interface AppComponent {

    Integer getVersion();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    Application getApplication();

    Context getContext();
}
