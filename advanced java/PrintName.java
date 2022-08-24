import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        String firstName = "", lastName = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Your first name: ");
        firstName = sc.nextLine();
        System.out.print("Your last name: ");
        lastName = sc.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName);
        sc.close();
    }
}
