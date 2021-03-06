package qualifiers;

import dagger.Component;

@Component(modules = DevelopersModule.class)
public interface DevelopersComponent {

    @AndroidDev
    Employer getAndroidDeveloper();

    @IosDev
    Employer getIosDeveloper();
}
