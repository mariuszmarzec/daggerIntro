package multibindings;

import dagger.Module;

@Module
public class ChildModule {

    public Integer provideNumberOne() {
        return 1;
    }

    public Integer provideNumberTwo() {
        return 2;
    }
}
