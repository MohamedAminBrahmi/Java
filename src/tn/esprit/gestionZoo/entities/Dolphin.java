package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;


    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String family, String name, int age, Boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }


    public void swim(){
        System.out.println("This dolphin is swimming.");
    }



    @Override
    public String toString() {
        return "Penguin{ family='" + super.getFamily() +
                ", name='" + super.getName() +
                ", age=" + super.getAge() +
                ", isMammal=" + super.getMammal() +
                ", habitat=" + super.getHabitat() +
                "swimmingDepth=" + swimmingSpeed +
                '}';
    }
}
