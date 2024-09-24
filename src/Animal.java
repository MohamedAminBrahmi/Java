public class Animal {
    public String family;
    public String name;
    public int age;
    public Boolean isMammal;

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
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
