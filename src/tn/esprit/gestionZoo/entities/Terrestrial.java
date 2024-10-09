package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal{
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
}
