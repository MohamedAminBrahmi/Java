package tn.esprit.gestionZoo.entities;

import tn.esprit.gestionZoo.enums.Food;
import tn.esprit.gestionZoo.interfaces.Carnivore;

public class Aquatic extends Animal implements Carnivore<Food> {

    private String habitat;


    public Aquatic() {
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String habitat) {
        super();
        this.habitat = habitat;
    }

    public Aquatic(String family, String name, int age, Boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj instanceof Aquatic){
            Aquatic aquatic=(Aquatic) obj;
            return super.getName().equals(aquatic.getName()) && super.getAge() == aquatic.getAge() && habitat.equals(aquatic.habitat);
        }
        return false;
    }
    @Override
    public void eatMeat(Food meat){
        System.out.println("this animal eats meat");

    }

}
