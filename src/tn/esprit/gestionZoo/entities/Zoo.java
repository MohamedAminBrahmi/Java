package tn.esprit.gestionZoo.entities;

public class Zoo {
    Animal[] animals;
    private String city;
    private String name;
    private  final int NBRCAGES=25 ;
    int nbrAnimals=0;


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNBRCAGES() {
        return NBRCAGES;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo() {
    }

    public  String displayZoo(){
        return
                " city='" + city + ' ' +
                ", name='" + name + ' ' +
                ", nbrCages=" + NBRCAGES
                ;
    }

    public Zoo( String city, String name) {
        this.city = city;
        this.name = name;
        animals=new Animal[NBRCAGES];
    }

    public boolean addAnimal(Animal animal) {
        int search=searchAnimal(animal);
        if (search==-1 && !isZooFull()){
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("tn.esprit.gestionZoo.entities.Animal adding done !!");

            return true;

        }else {
            System.out.println("this tn.esprit.gestionZoo.entities.Animal is already here!!!");
            return false;
        }



        }




    public void afficher(){
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);


        }
    }
    public int searchAnimal(Animal animal){
        for (int i = 0; i < NBRCAGES; i++) {
            if(animals[i]==animal){
                return i;
            }


        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int search = searchAnimal(animal);
        if (search!=-1){
            for (int i = search; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }

            animals[nbrAnimals-1] = null;
            nbrAnimals--;
            System.out.println("removing done !!");

            return true;

        }else {
            System.out.println("tn.esprit.gestionZoo.entities.Animal not found to delete !!!");
            return false;
        }

    }
    public boolean isZooFull(){
        if(NBRCAGES<=nbrAnimals) {
            System.out.println("the tn.esprit.gestionZoo.entities.Zoo is full");
        }else {
            System.out.println("the tn.esprit.gestionZoo.entities.Zoo is not full");

        }
        return true;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2){
        int nbrAnimalsZoo1=0;
        int nbrAnimalsZoo2=0;
        do {
            if (z1.animals[nbrAnimalsZoo1]!=null){
                nbrAnimalsZoo1++;
            }else {
                break;
            }
        }while (nbrAnimalsZoo1<NBRCAGES);
    do {
        if (z1.animals[nbrAnimalsZoo2]!=null){
            nbrAnimalsZoo2++;
        }else {
            break;
        }
    }while(nbrAnimalsZoo2<NBRCAGES);
    if (nbrAnimalsZoo1>nbrAnimalsZoo2){
        return z1;
    }else {
        return z2;

    }
    }


}