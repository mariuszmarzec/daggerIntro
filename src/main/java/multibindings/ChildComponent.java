package multibindings;

import dagger.Subcomponent;

import java.util.Map;

@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {

    Map<String, Integer> getMap();
}
