import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    public String city;
    public String name;
    public int nbrCages=25;


    public  String displayZoo(){
        return
                " city='" + city + ' ' +
                ", name='" + name + ' ' +
                ", nbrCages=" + nbrCages
                ;
    }

    public Zoo( String city, String name, int nbrCages) {
        this.city = city;
        this.name = name;
        this.nbrCages = nbrCages;
        animals=new Animal[nbrCages];
    }


}
