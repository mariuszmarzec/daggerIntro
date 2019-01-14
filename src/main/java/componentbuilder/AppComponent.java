package componentbuilder;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = BindModule.class)
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    Context getContext();
}
