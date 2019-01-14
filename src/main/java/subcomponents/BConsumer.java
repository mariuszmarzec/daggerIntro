package subcomponents;

import javax.inject.Inject;
import javax.inject.Provider;

public class BConsumer {
    @Inject
    Provider<BComponent.Builder> bComponentbuilder;
}
