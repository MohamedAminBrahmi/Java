package tn.esprit.gestionZoo.entities;

import tn.esprit.gestionZoo.enums.Food;
import tn.esprit.gestionZoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(String family, String name, int age, Boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Penguin{ family='" + super.getFamily() +
                ", name='" + super.getName() +
                ", age=" + super.getAge() +
                ", isMammal=" + super.getMammal() +
                ", nbrLegs=" + nbrLegs +
                '}';
    }

    public void eatPlantAndMeet(Food food){
        System.out.println("this animal eats plants and meat");

    }


}
