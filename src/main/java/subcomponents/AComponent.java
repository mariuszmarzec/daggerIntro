package subcomponents;

import dagger.Component;

@Component(modules = AModule.class)
public interface AComponent {

    void inject(BConsumer consumer);
}
