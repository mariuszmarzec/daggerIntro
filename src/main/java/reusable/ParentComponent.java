package reusable;

import dagger.Component;

@Component(modules = ParentModule.class)
public interface ParentComponent {

    ChildComponent buildChildComponent();
}
