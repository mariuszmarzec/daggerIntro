package subcomponents;

import dagger.Component;

@Component(modules = FactoryModule.class)
public interface FactoryComponent {

    LittleFactoryComponent buildLittleFactoryComponent(LittleFactoryModule module);
}
