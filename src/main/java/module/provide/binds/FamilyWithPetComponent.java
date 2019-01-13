package module.provide.binds;

import dagger.Component;

import javax.annotation.Nullable;

@Component(modules = {FamilyModule.class, AnimalModule.class})
public interface FamilyWithPetComponent extends FamilyComponent {

    @Nullable
    Animal getAnimal();
}
