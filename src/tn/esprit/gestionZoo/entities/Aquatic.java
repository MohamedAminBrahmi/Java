package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal{

    private String habitat;



    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family, String name, int age, Boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
