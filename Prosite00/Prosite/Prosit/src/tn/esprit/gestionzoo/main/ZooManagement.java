package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.*;
import tn.esprit.gestionzoo.entite.Animal;
import tn.esprit.gestionzoo.entite.Aquatic;
import tn.esprit.gestionzoo.entite.Dolphin;
import tn.esprit.gestionzoo.entite.Penguin;
import tn.esprit.gestionzoo.entite.Terrestrial;
import tn.esprit.gestionzoo.entite.Zoo;

import java.util.Scanner;

public class ZooManagement {

    // PROSIT 1 *********************************************
    public static void main(String[] args) {

        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scan = new Scanner(System.in);
        /*
         * do {
         * System.out.println("Donner le nombre de cages (entier positif)");
         * if (scan.hasNextInt()) {
         * nbrCages = scan.nextInt();
         * if (nbrCages > 0) {
         * break;
         * }
         * } else {
         * System.out.println(" Assurez-vous que le nombre saisie est supérieur a 0");
         * }
         * } while (true);
         * do {
         * System.out.println("Donner le nom du zoo");
         * zooName = scan.next().trim();
         * if (zooName.matches(".*[a-zA-Z].*")) {
         * break;
         * } else {
         * System.out.println(" Le nom du zoo doit contenir au moin une lettre");
         * }
         * } while (true);
         * System.out.println(zooName + " comporte " + nbrCages + " cages");
         */
        // PROSIT 1 ****************************************************************
        // PROSIT 2 *****************************************************************
        Animal lion = new Animal();
        lion.setAge(4);
        lion.setName("Simba");
        lion.setFamily("Felidae");
        lion.setMammal(true);
        Zoo myZoo = new Zoo();
        myZoo.setCity("Tunis");
        myZoo.setName("Belvedere");
        Animal[] animals = new Animal[25];
        animals[0] = lion;
        Animal elephant = new Animal("Elephantidae", "Babar", 20, true);
        Animal girafe = new Animal("Giraffidae", "cute", 12, true);
        Zoo Belvedere = new Zoo("Belvedere", "Tunis");
        myZoo.displayZoo();
        System.out.println(myZoo);
        Belvedere.addAnimal(lion);
        Belvedere.addAnimal(elephant);
        Belvedere.addAnimal(elephant);
        Belvedere.addAnimal(girafe);
        Belvedere.displayAnimales();
        System.out.println(Belvedere.searchAnimal(elephant));
        System.out.println(Belvedere.searchAnimal(girafe));
        Belvedere.removeAnimal(lion);
        Belvedere.displayAnimales();
        System.out.println(Belvedere.isZooFull());
        System.out.println(Zoo.comparerZoo(myZoo, Belvedere));
        Aquatic aqua = new Aquatic();
        Terrestrial terre = new Terrestrial();
        Dolphin delph = new Dolphin();
        Penguin peng = new Penguin();
        System.out.println(aqua);
        System.out.println(terre);
        System.out.println(delph);
        System.out.println(peng);
        aqua.swim();
        delph.swim();
        peng.swim();
    }
}