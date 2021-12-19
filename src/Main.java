import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String intrest;
        String city;
        System.out.println("Hello!!!!!");

        System.out.print("Enter your name: ");
        name= sc.nextLine();
        System.out.print("Enter your intrests: ");
        intrest= sc.nextLine();
        System.out.print("Enter your city: ");
        city= sc.nextLine();
        System.out.print("Enter your age: ");
        age= sc.nextInt();

        System.out.println("Data added..");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Intrest: "+intrest);
        System.out.println("City: "+city);


    }
}
