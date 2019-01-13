package module.provide.binds;

import dagger.Binds;
import dagger.Module;

import javax.annotation.Nullable;

@Module(includes = FamilyModule.class)
public abstract class AnimalModule {

    @Binds
    @Nullable
    public abstract Animal bindAnimal(@Nullable Pet pet);
}
