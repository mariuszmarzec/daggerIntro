package module.provide.binds;

import dagger.Module;
import dagger.Provides;

import javax.annotation.Nullable;

@Module
public class FamilyModule {

    private Pet pet;

    FamilyModule() {
    }

    FamilyModule(Dog pet) {
        this.pet = pet;
    }

    @Provides
    public Father provideFather() {
        return new Father();
    }

    @Provides
    public Mother provideMother() {
        return new Mother();
    }

    @Provides
    @Nullable
    public Pet providePet() {
        return pet;
    }

    @Provides
    public Family provideFamily(Father father, Mother mother, @Nullable Pet pet) {
        return new Family(father, mother, pet);
    }
}
