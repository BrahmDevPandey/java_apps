import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

// to demo the concept of overloading in java
interface C {
    default void Display() {
    }
}

class A implements C {
    int a;

    A() {
    }

    A(int a, int b) {
    }

    public void display() {
    }
}

class B extends A {
    int a;

    public void display() {
    }

    public void display(int a) {
    }
}

public class Overloading {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}