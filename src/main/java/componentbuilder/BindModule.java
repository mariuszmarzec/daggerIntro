package componentbuilder;

import dagger.Binds;
import dagger.Module;

@Module
public interface BindModule {
    @Binds
    Context bindContext(Application application);
}
