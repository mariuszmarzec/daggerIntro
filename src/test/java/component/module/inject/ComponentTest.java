package component.module.inject;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ComponentTest {

    /**
     * Do without @Module annotation
     */
    @Test
    public void injectingTest() {
//        A ob = DaggerComponentA.create().getA();
    }

    /**
     * Provide B object with @Provides annotated method and module
     */
    @Test
    public void createModuleTest() {
//        B ob = DaggerComponentB.create().getB();
    }

    /**
     * Inject A and B instances to Alphabet class with inject method
     */
    @Test
    public void injectAnnotationTest() {
//        Alphabet alphabet = new Alphabet();
//        DaggerComponentAlphabet.create().inject(alphabet);
//        assertNotNull(alphabet.getA());
//        assertNotNull(alphabet.getB());
    }
}
