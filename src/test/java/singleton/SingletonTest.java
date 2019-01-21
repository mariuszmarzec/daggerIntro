package singleton;

import componentbuilder.AppComponent;
import componentbuilder.Application;
import componentbuilder.DaggerAppComponent;
import org.junit.Test;
import subcomponents.ActivityComponent;
import subcomponents.DaggerActivityComponent;

import static org.junit.Assert.assertSame;

public class SingletonTest {

    @Test
    public void singletonTest() {
//        AppComponent appComponent = DaggerAppComponent.builder().application(new Application()).build();
//        ActivityComponent activityComponent = DaggerActivityComponent.builder()
//                .appComponent(appComponent)
//                .build();
//        assertSame(appComponent.getVersion(), appComponent.getVersion());
//        assertSame(activityComponent.getWelcomeText(), activityComponent.getWelcomeText());
    }
}
