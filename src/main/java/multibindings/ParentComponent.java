package multibindings;

import dagger.Component;

import java.util.Map;

@Component(modules = ParentModule.class)
public interface ParentComponent {

    Map<String, Integer> getMap();

    ChildComponent buildChildComponent();
}
