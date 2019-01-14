package subcomponents;

import dagger.Subcomponent;

@Subcomponent
public interface BComponent {

    @Subcomponent.Builder
    interface Builder {
        BComponent build();
    }
}
