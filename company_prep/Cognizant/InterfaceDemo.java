//program to demo the use of interfaces in java

interface Vehicle {
    int modelNum = 0;

    public void run();
}

public class InterfaceDemo implements Vehicle {
    public void run() {
        System.out.println("The vehicle is running.");
    }

    public static void main(String[] args) {
        InterfaceDemo i = new InterfaceDemo();
        i.run();
    }
}