package reusable;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent
public interface ChildComponent {

    Object getObject();
}
