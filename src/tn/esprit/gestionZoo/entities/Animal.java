package tn.esprit.gestionZoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private Boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()){
            throw new IllegalArgumentException("the name is a required field");
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("the age field must be positive");
        }
        this.age = age;
    }

    public Boolean getMammal() {
        return isMammal;
    }

    public void setMammal(Boolean mammal) {
        isMammal = mammal;
    }

    public Animal() {
    }

    Animal (String family, String name, int age, Boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;

    }


    @Override
    public String toString() {
        return "tn.esprit.gestionZoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
