package module.provide.binds;

import dagger.Component;

@Component(modules = FamilyModule.class)
public interface FamilyComponent {

    Family getFamily();
}
