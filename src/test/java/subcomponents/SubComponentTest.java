package subcomponents;

import componentbuilder.AppComponent;
import componentbuilder.Application;
import componentbuilder.DaggerAppComponent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SubComponentTest {

    /**
     * Use factory method
     */
    @Test
    public void subComponentByFactoryMethodTest() {
//        Object argument = new Object();
//        LittleFactoryComponent subcomponent = DaggerFactoryComponent.create()
//                .buildLittleFactoryComponent(new LittleFactoryModule(argument));
    }

    /**
     * Use subcomponents field in parent @Module
     */
    @Test
    public void subComponentByModuleAnnotation() {
//        BConsumer consumer = new BConsumer();
//        DaggerAComponent.builder().build().inject(consumer);
//        assertNotNull(consumer.bComponentbuilder);
    }

    /**
     * Use dependencies field in child Component
     */
    @Test
    public void componentByDependency() {
//        AppComponent appComponent = DaggerAppComponent.builder().application(new Application()).build();
//        ActivityComponent activityComponent = DaggerActivityComponent.builder()
//                .appComponent(appComponent)
//                .build();
//        assertEquals("Welcome in app: HelloWorldApp", activityComponent.getWelcomeText());
    }
}
