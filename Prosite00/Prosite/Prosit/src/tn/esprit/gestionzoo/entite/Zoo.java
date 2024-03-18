package tn.esprit.gestionzoo.entite;

public class Zoo {
    private Animal[] Animals;
    private String name;
    private String city;
    private static final int nbrCages = 25;
    private int nbrAnimales;

    public Zoo(String name, String city) {
        this.Animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public Zoo() {
    }

    public void displayZoo() {
        System.out.println("Nom: " + name + ", Cité: " + city + ", Nombre de cages: " + nbrCages);
    }

    public String toString() {
        return "Nom: " + name + ", Cité: " + city + ", N°Cages: " + nbrCages;
    }

    public boolean addAnimal(Animal A) {
        if (!isZooFull()) {
            if (searchAnimal(A) != -1) {
                System.out.println("L'Animal " + A.getName() + " existe déjà dans le zoo.");
                return false;
            } else {
                this.Animals[nbrAnimales] = A;
                nbrAnimales++;
                return true;
            }
        } else {
            System.out.println("Zoo full !");
            return false;
        }
    }

    public void displayAnimales() {
        int i = 0;
        while (i < nbrAnimales) {
            System.out.println(Animals[i]);
            i++;
        }
    }

    public int searchAnimal(Animal A) {
        int found = -1;
        int i = 0;
        while ((i < nbrAnimales) && (found == -1)) {
            if (Animals[i] != null && Animals[i].getName().equals(A.getName())) {
                found = i;
            }
            i++;
        }
        return found;
    }

    public boolean removeAnimal(Animal A) {
        int indice = searchAnimal(A);
        if (indice != -1) {
            for (int i = indice; i < nbrAnimales - 1; i++) {
                Animals[i] = Animals[i + 1];
            }
            Animals[nbrAnimales - 1] = null;
            nbrAnimales--;
            System.out.println("Suppression avec succès");
            return true;
        } else {
            System.out.println("Erreur: L'animal n'a pas été trouvé dans le zoo.");
            return false;
        }
    }

    public boolean isZooFull() {
        if (nbrAnimales >= nbrCages) {
            return true;
        } else {
            return false;
        }
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimales > z2.nbrAnimales) {
            return z1;
        } else {
            return z2;
        }
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        if (name.matches(".*[a-zA-Z].*")) {
            this.name = name;
        } else {
            System.out.println("Donner un nom valide");
        }
    }

    public void setCity(String city) {
        this.city = city;
    }
}
