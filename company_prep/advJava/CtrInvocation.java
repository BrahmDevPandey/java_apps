// program to demo the order of constructor invocation in java

// base class
class Person {
    // base class Constructor
    Person() {
        System.out.println("Base class Constructor called.");
    }
}

// derived class
class Man extends Person {
    // derived class Constructor
    Man() {
        System.out.println("Derived class Constructor called.");
    }
}

// driver class
public class CtrInvocation {
    public static void main(String[] args) {
        System.out.println("Creating object of Derived class...");
        Man obj = new Man();
    }
}

/**
 * 
 * Output:
 * Creating object of Derived class...
 * Base class Constructor called.
 * Derived class Constructor called.
 * 
 **/