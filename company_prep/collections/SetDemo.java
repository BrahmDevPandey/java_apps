import java.util.*;

class Values implements Comparable<Values> {
    int a;
    int b;

    public Values(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Values arg0) {
        return this.a - arg0.a;
    }
}

public class SetDemo {
    public static void main(String[] args) {
        int n;
        SortedSet<Values> set = new TreeSet<Values>();
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter number of values: ");
        n = sc.nextInt();

        System.out.println("Enter %d values: ".formatted(n));
        for (int i = 0; i < n; i++) {
            set.add(new Values(sc.nextInt(), sc.nextInt()));
        }

        // output
        System.out.println("The values are: ");
        for (Values v : set) {
            System.out.println(v.a + " " + v.b);
        }
        sc.close();
    }
}
