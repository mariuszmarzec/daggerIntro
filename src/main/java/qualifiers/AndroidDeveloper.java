package qualifiers;

public class AndroidDeveloper implements Employer {
    @Override
    public String getPosition() {
        return AndroidDeveloper.class.getSimpleName();
    }
}
