import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animal lion=new Animal("cats","lion",20,true);
        Zoo MyZoo=new Zoo("tunis","MyZoo",22);
        System.out.println(lion);
        System.out.println(MyZoo.displayZoo());
    }
}