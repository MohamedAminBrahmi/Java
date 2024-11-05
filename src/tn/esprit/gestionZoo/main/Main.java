package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;
import tn.esprit.gestionZoo.enums.Food;
import tn.esprit.gestionZoo.exceptions.InvalidAgeException;
import tn.esprit.gestionZoo.exceptions.ZooFullException;


public class Main{

    public static void main(String[] args) {

        Zoo myZoo= new Zoo("Tunis","My Zoo");
        Penguin pingi1=new Penguin("aquatic","Pingi",12,false,"Ice",12);
        Penguin pingi1sds=new Penguin("aquatic","Pingi",12,false,"Ice",12);
        Penguin pingo=new Penguin("aquatic","Pingo",12,false,"Ice",80);
        Penguin pingi_yellow=new Penguin("aquatic","Pingi Yellow",12,false,"Ice",60);
        Penguin pingalo=new Penguin("aquatic","Pingalo",12,false,"Ice",51);
        Dolphin dolphi1=new Dolphin("aquatic","Dolphi",15,false,"ocian",50);
        Terrestrial lion=new Terrestrial("terrestrial","leoni",15,true,4);


        System.out.println(pingi1.toString());
        pingi1.swim();
        System.out.println(dolphi1.toString());
        dolphi1.swim();
        System.out.println(lion.toString());

        myZoo.addAquaticAnimal(dolphi1);
        myZoo.addAquaticAnimal(pingi1);
        myZoo.addAquaticAnimal(pingo);
        myZoo.addAquaticAnimal(pingi_yellow);
        myZoo.addAquaticAnimal(pingalo);
        myZoo.addAquaticAnimal(pingi1sds);


        myZoo.afficherAquaticAnimals();

        //This aquatic animal is swimming in penguin case
        for (int i = 0; i < myZoo.getNbrAquaticAnimals(); i++) {
            myZoo.getAquaticAnimals()[i].swim();
        }

        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();

        System.out.println(pingi1.equals(pingi1sds));




        Zoo zoo = new Zoo("Ariana","Zoo");

        try {

            zoo.addAnimal(new Terrestrial("terrestrial","leon",15,true,4));


            zoo.addAnimal(new Terrestrial("terrestrial","Tigre",14,true,4));

            zoo.addAnimal(new Terrestrial("terrestrial","Ours",17,true,4));

            zoo.addAnimal(new Terrestrial("terrestrial","Éléphant",25,true,4));


        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + zoo.getNbrAnimals());

        try {
            lion.setAge(-1);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        Aquatic aqua=new Aquatic("aquatic","Pingi",12,false,"Ice");
        aqua.eatMeat(Food.MEAT);
        pingi1.eatMeat(Food.MEAT);
        lion.eatPlantAndMeet(Food.BOTH);



    }


















    }
