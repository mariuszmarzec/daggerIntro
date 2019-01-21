package componentbuilder;

import dagger.BindsInstance;
import dagger.Component;
import singleton.VersionModule;

import javax.inject.Singleton;

@Component(modules = {BindModule.class, VersionModule.class})
public interface AppComponent {

    Integer getVersion();

    @Component.Builder
    interface Builder {
        AppComponent build();
    }

}
