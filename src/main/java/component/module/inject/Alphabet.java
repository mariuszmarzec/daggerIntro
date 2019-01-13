package component.module.inject;

import javax.inject.Inject;

public class Alphabet {

    private A a;
    private B b;

    public A getA() {
        return a;
    }

    @Inject
    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    @Inject
    public void setB(B b) {
        this.b = b;
    }
}
