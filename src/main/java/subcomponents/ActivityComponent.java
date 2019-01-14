package subcomponents;

import componentbuilder.AppComponent;
import dagger.Component;

@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    String getWelcomeText();
}
