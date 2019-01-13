package component.module.inject;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleB {

    @Provides
    public B provideB() {
        return new B();
    }
}
