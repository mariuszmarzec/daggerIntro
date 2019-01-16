package reusable;

import componentbuilder.DaggerAppComponent;
import org.junit.Test;
import subcomponents.DaggerActivityComponent;
import static org.junit.Assert.assertSame;

public class ReusableTest {

    /**
     * Use reusable to fix test
     */
    @Test
    public void reusableTest() {
        ParentComponent parentComponent = DaggerParentComponent.create();
        ChildComponent childComponent = parentComponent.buildChildComponent();
        ChildComponent childComponent2 = parentComponent.buildChildComponent();

        assertSame(childComponent.getObject(), childComponent2.getObject());
    }
}
