
// program to demo functionalities of LinkedList class
import java.util.Scanner;

public class LinkedListFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0, data, index, pos;
        LinkedList list = new LinkedList(); // create the list

        do {
            System.out.println("\n********MENU********");
            System.out.println("1. Add at begining");
            System.out.println("2. Add at end");
            System.out.println("3. Add at index");
            System.out.println("4. Add after a node");
            System.out.println("5. Delete from begining");
            System.out.println("6. Delete from end");
            System.out.println("7. Delete from index");
            System.out.println("8. Delete after a node");
            System.out.println("9. Find length");
            System.out.println("10. Print list");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to be inserted: ");
                    data = sc.nextInt();
                    list.insertAtBegining(data);
                    break;
                case 2:
                    System.out.print("Enter data to be inserted: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter index at which to insert: ");
                    index = sc.nextInt();
                    System.out.print("Enter data to be inserted: ");
                    data = sc.nextInt();
                    list.insertAtIndex(index, data);
                    break;
                case 4:
                    System.out.print("Enter node data after which to insert: ");
                    pos = sc.nextInt();
                    System.out.print("Enter data to be inserted: ");
                    data = sc.nextInt();
                    list.insertAfter(pos, data);
                    break;
                case 5:
                    System.out.println("Deleted: " + list.deleteFromBegining());
                    break;
                case 6:
                    System.out.println("Deleted: " + list.deleteFromEnd());
                    break;
                case 7:
                    System.out.print("Enter node data which to be deleted: ");
                    data = sc.nextInt();
                    System.out.println("Deleted: " + list.deleteNode(data));
                    break;
                case 8:
                    System.out.print("Enter index from which to delete: ");
                    index = sc.nextInt();
                    System.out.println("Deleted: " + list.deleteAtIndex(index));
                    break;
                case 9:
                    System.out.println("Lenght of list is: " + list.length());
                    break;
                case 10:
                    System.out.println("The list is: ");
                    list.printList();
                    break;
                case 11:
                    System.out.println("Thank You!!!");
                    break;
                default:
                    System.out.println("Invalid choice! Enter again...");
            }
        } while (choice != 11);

        sc.close();
    }
}