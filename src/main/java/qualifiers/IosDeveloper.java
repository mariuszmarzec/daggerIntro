package qualifiers;

public class IosDeveloper implements Employer {
    @Override
    public String getPosition() {
        return IosDeveloper.class.getSimpleName();
    }
}
