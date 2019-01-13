package component.module.inject;

import dagger.Component;

@Component(modules = ModuleB.class)
public interface ComponentAlphabet {

    void inject(Alphabet alphabet);
}
