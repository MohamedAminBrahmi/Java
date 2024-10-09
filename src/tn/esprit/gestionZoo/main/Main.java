package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

public class Main {

    public static void main(String[] args) {
        //des erreurs au niveau des constructeurs par
        Penguin pingi1=new Penguin("aquatic","Pingo",12,false,"Ice",12);
        Dolphin dolphi1=new Dolphin("aquatic","Dolphi",15,false,"ocian",50);
        Terrestrial lion=new Terrestrial("terrestrial","leoni",15,true,4);


        System.out.println(pingi1.toString());
        pingi1.swim();
        System.out.println(dolphi1.toString());
        dolphi1.swim();
        System.out.println(lion.toString());


















    }
}