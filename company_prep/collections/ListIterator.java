package collections;

// program to demo the use of Lists in Java
import java.util.*;

public class ListIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        String item = null;

        System.out.println("Enter items one by one (\":q\" to exit): ");
        // input the list
        while (true) {
            item = sc.nextLine();
            if (item.equalsIgnoreCase(":q"))
                break;
            list.add(item);
        }

        System.out.println("%sThe list items are: ".formatted("\n"));
        // output the list using iterator
        for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }
}