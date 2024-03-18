package tn.esprit.gestionzoo.entite;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial() {

    }

    @Override
    public String toString() {
        return super.toString() + ", Legs: " + nbrLegs;
    }
}
