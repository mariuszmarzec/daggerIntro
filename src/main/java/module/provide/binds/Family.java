package module.provide.binds;

public class Family {

    private Father father;
    private Mother mother;
    private Pet Pet;

    public Family(Father father, Mother mother, Pet Pet) {
        this.father = father;
        this.mother = mother;
        this.Pet = Pet;
    }

    public Father getFather() {
        return father;
    }

    public Mother getMother() {
        return mother;
    }

    public Pet getPet() {
        return Pet;
    }
}
