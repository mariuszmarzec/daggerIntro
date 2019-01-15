package subcomponents;

import componentbuilder.AppComponent;
import dagger.Component;
import singleton.ActivityScope;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    String getWelcomeText();
}
