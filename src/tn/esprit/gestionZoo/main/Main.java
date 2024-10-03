package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Animal;
import tn.esprit.gestionZoo.entities.Zoo;

public class Main {

    public static void main(String[] args) {

        Animal lion=new Animal("cats","lion",20,true);
        Zoo MyZoo=new Zoo("tunis","MyZoo");
        Zoo myZoo2=new Zoo("tunis","MyZoo22");
        System.out.println(lion);
        System.out.println(MyZoo.displayZoo());
        Animal  Bird =new Animal("Bird","Bird",1,true);
        Animal Duck =new Animal("Bird","Duck",2,true);
        Animal  Ostrich =new Animal("Bird","Ostrich",4,true);

        myZoo2.addAnimal(Bird);
        myZoo2.addAnimal(Duck);
        myZoo2.addAnimal(Ostrich);

        Animal  Cat =new Animal("cats","Cat",12,true);
        Animal  Tiger =new Animal("cats","Tiger",15,true);

        MyZoo.addAnimal(Cat);
        MyZoo.addAnimal(Cat);
        MyZoo.addAnimal(Tiger);


        int found=MyZoo.searchAnimal(Cat);
        if (found== -1){
            System.out.println("tn.esprit.gestionZoo.entities.Animal not found");
        }else {
            System.out.println("tn.esprit.gestionZoo.entities.Animal found in position : "+found);
        }
        MyZoo.afficher();
        MyZoo.removeAnimal(Tiger);
        myZoo2.afficher();


        Zoo zooWithMoreAnimals = MyZoo.comparerZoo(MyZoo, myZoo2);
        System.out.println("the zoo with more animals number is" + zooWithMoreAnimals);
    }
}