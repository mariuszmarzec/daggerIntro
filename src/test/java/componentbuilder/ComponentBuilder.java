package componentbuilder;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ComponentBuilder {

    @Test
    public void builderAndBindInstanceTest() {
        Application application = new Application();
        AppComponent component = DaggerAppComponent
                .builder()
                .application(application)
                .build();
        Context context = component.getContext();
        assertTrue(context instanceof Application);
        assertSame(application, context);
    }
}
