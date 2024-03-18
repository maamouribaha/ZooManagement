package tn.esprit.gestionzoo.entite;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {
    }

    @Override
    public String toString() {
        return super.toString() + ", SwimDepth: " + swimmingDepth;
    }
}
