package reusable;

import componentbuilder.AppComponent;
import componentbuilder.Application;
import componentbuilder.DaggerAppComponent;
import org.junit.Test;
import subcomponents.ActivityComponent;
import subcomponents.DaggerActivityComponent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ReusableTest {

    @Test
    public void reusableTest() {
        AppComponent appComponent = DaggerAppComponent.builder().application(new Application()).build();
        ActivityComponent activityComponent1 = DaggerActivityComponent.builder()
                .appComponent(appComponent)
                .build();
        ActivityComponent activityComponent2 = DaggerActivityComponent.builder()
                .appComponent(appComponent)
                .build();
        assertSame(activityComponent1.getPrice(), activityComponent2.getPrice());

    }
}
