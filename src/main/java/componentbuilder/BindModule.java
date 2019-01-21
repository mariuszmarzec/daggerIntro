package componentbuilder;

import dagger.Binds;
import dagger.Module;

@Module
public interface BindModule {
    Context bindContext(Application application);
}
