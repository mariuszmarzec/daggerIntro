package module.provide.binds;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ModuleTest {

    /**
     * Create module which provide family(father, mother, animal)
     */
    @Test
    public void provideMethodTest() {
//        FamilyModule familyModule = new FamilyModule();
//        Father father = familyModule.provideFather();
//        Mother mother = familyModule.provideMother();
//        Family family = familyModule.provideFamily(father, mother, null);
//        assertNotNull(family.getFather());
//        assertNotNull(family.getMother());
//        assertNull(family.getPet());
//
//        family = DaggerFamilyComponent.create().getFamily();
//        assertNotNull(family.getFather());
//        assertNotNull(family.getMother());
//        assertNull(family.getPet());
    }

    /**
     * Provide Dog as Animal using module constructor and bind Father and bind dog as Pet with @Bind
     * annotation
     */
    @Test
    public void bindsMethodTest() {
//        Dog dog = new Dog();
//        FamilyWithPetComponent component = DaggerFamilyWithPetComponent
//                .builder()
//                .familyModule(new FamilyModule(dog))
//                .build();
//        Family family = component
//                .getFamily();
//        assertNotNull(family.getFather());
//        assertNotNull(family.getMother());
//        assertNotNull(family.getPet());
//
//        assertSame(dog, component.getAnimal());
    }
}
