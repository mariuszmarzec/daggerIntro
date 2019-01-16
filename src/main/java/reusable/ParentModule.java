package reusable;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class ParentModule {


    @Provides
    @Reusable
    public Object provideObject() {
        return new Object();
    }
}
