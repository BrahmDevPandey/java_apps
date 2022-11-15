import java.util.Scanner;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println("The arguments passed to the program are:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}

import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int myarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = scanner.nextInt();
        }
    }
}
