package tn.esprit.gestionzoo.entite;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal() {
    }

    public String toString() {
        return "Famille: " + family + ", Nom: " + name + ", Age: " + age + ", Mammal: " + isMammal;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age ne peut pas etre négatif");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
