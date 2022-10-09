
// to test the LinkedStack created 
import java.util.Scanner;

public class LinkedStackDemo {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Push \n2. Pop \n3. Display Stack \n4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    Integer data = stack.pop();
                    if (data != null)
                        System.out.println("Popped: " + data);
                    break;
                case 3:
                    stack.show();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
