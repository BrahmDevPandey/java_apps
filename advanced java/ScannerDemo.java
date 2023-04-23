import java.util.Scanner;

public class ScannerDemo {
    public void fun1() {
        // open an instance of System.in in Scanner
        Scanner s1 = new Scanner(System.in);
        String s = s1.next();
        System.out.println("Read data in fun1: " + s);
        fun2();
        s1.close();
    }

    public void fun2() {
        // open another instance of System.in in Scanner
        Scanner s2 = new Scanner(System.in); // notice that the instance s1 is still open in fun1
        String s = s2.next();
        System.out.println("Read data fun2: " + s);
        s2.close();
    }

    public static void main(String[] args) {
        ScannerDemo obj = new ScannerDemo();
        obj.fun1();
    }
}