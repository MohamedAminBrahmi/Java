package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;


    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;

    }

    public Penguin(String family, String name, int age, Boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{ family='" + super.getFamily() +
                ", name='" + super.getName() +
                ", age=" + super.getAge() +
                ", isMammal=" + super.getMammal() +
                ", habitat=" + super.getHabitat() +
                ", swimmingDepth=" + swimmingDepth +
                '}';
    }

    public void swim(){
        System.out.println("This penguin is swimming.");
    }
}
