
// demo of linked queue program
import java.util.Scanner;

public class LinkedQueueDemo {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add \n2. Remove \n3. Display Queue \n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to add: ");
                    queue.add(sc.nextInt());
                    break;
                case 2:
                    Integer data = queue.remove();
                    if (data != null)
                        System.out.println("Removed: " + data);
                    break;
                case 3:
                    queue.show();
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