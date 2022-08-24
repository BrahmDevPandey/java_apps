
// program to demo use linkedlist
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter the number of elemets to be inserted: ");
        int n = sc.nextInt();

        System.out.printf("Enter %d elements: \n", n);
        for (int i = 1; i <= n; i++)
            list.add(sc.nextInt());

        System.out.println("The list is: ");
        list.showList();
        list.remove(0);
        list.showList();
        list.add(500);
        list.showList();
        System.out.println(list.get(2));
        list.set(4, 102);
        list.showList();
        sc.close();
    }
}
