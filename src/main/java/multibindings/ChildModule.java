package multibindings;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class ChildModule {

    @Provides
    @IntoMap
    @StringKey("1")
    public Integer provideNumberOne() {
        return 1;
    }

    @Provides
    @IntoMap
    @StringKey("2")
    public Integer provideNumberTwo() {
        return 2;
    }
}
