package tn.esprit.gestionzoo.entite;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {

    }

    @Override
    public String toString() {
        return super.toString() + ", SwimSpeed: " + swimmingSpeed;
    }

    public void swim() {
        System.out.println("This dolphin is swimming");
    }
}
