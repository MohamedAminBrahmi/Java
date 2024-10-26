package tn.esprit.gestionZoo.entities;

public class Zoo {
    Animal[] animals;
    private String city;
    private String name;
    private  final int NBRCAGES=3 ;
    private int nbrAnimals=0;
    private int nbrAquaticAnimals=0;
    Aquatic[] aquaticAnimals;
    private float maxDepth=0;
    int nbrPinguins=0;
    int nbrDolphins=0;

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public float getMaxDepth() {
        return maxDepth;
    }

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

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
        aquaticAnimals= new Aquatic [10];

    }

    public void addAnimal (Animal animal) throws ZooFullException {
            int search = searchAnimal(animal);

            if (search != -1) {
                System.out.println("Animal is already here!!!");
            }
            if (isZooFull()){
                throw new ZooFullException("the Zoo is full");
            }

                animals[nbrAnimals] = animal;
                nbrAnimals++;
                System.out.println("adding done !!");


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

        return NBRCAGES==nbrAnimals;
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
    public void addAquaticAnimal(Aquatic aquatic){

        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println(" adding done ");
        } else {
            System.out.println("Zoo is full.");
        }
    }
    public void afficherAquaticAnimals() {
        System.out.println("Aquatic Animals in the Zoo:");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] != null) {
                System.out.println(aquaticAnimals[i]);
            }
        }
    }


    public float maxPenguinSwimmingDepth() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin ) {
                Penguin penguin= (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth()> maxDepth) {
                    maxDepth=penguin.getSwimmingDepth();

                }
            }
        }



        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin ) {
                nbrPinguins=nbrPinguins+1;

                }
            if (aquaticAnimals[i] instanceof Dolphin ) {
                nbrDolphins=nbrDolphins+1;

            }
            }
        System.out.println("the number of Pinguins is  "+nbrPinguins+"  the number of Dolphins is  "+nbrDolphins);
        }

    }

