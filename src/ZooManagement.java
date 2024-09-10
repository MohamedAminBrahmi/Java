import java.util.Scanner;

public class ZooManagement {
    public int nbrCages=20;
    public String zooName= "my zoo";

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of cages : ");
        ZooManagement zoo =new ZooManagement();
        zoo.nbrCages = sc.nextInt();
        System.out.println("enter the zoo name : ");
        sc.nextLine();
        zoo.zooName = sc.nextLine();
        System.out.println("number of cages : "+zoo.nbrCages);
        System.out.println("Zoo Name : "+zoo.zooName);




    }
}