package collections;

// program to demo the conversion list to array in java
import java.util.*;
import java.util.stream.Collectors;

public class List2Arr {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter some numbers (-9999 to stop): ");
        while (true) {
            num = sc.nextInt();
            if (num != -9999)
                list.add(num);
            else
                break;
        }

        // converting list to array
        System.out.println("The array equivalent of list is: ");

        // for (Integer n : list) {
        // System.out.println(n);
        // }
        for (Object n : list.stream().map(s -> (Object) s).collect(Collectors.toList())) {
            System.out.println(n);
        }
    }
}
