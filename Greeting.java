import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your full name: ");
        String name = sc.nextLine();
        System.out.print("Your age: ");
        int age = sc.nextInt();
        System.out.println("Hello, " + name + "! Next year you will be " + (age + 1) + ".");
    }
}