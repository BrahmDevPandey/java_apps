class A {
    public void show() {

    }
}

class B extends A {
    // private void show() { // gives error because we can't assign weaker access
    // privileges to a overriding
    // function

    // }
    public void show() { // compiles fine

    }
}

public class Visibility {
    public static void main(String[] args) {
        B b = new B();
    }
}
