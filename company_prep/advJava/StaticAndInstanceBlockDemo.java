// program to demo static and instance blocks in java

class Student {
    // static block, will execute only once when the first object of the class is
    // created
    static {
        System.out.println("Static block of class Student executed.");
    }

    // instance block, will execute before constructor every time an object of the
    // class is created
    {
        System.out.println("Instance block of class Student executed.");
    }

    // constructor, will be executed for object creation
    Student() {
        System.out.println("Constructor of class Student called.");
    }
}

public class StaticAndInstanceBlockDemo {
    public static void main(String[] args) {
        System.out.println("Creating object of class Student.");
        Student s1 = new Student();
        Student s2 = new Student();
    }
}


 * Output:
 * 
 * Creating object of class Student.
 * Static block of class Student executed.
 * Instance block of class Student executed.
 * Constructor of class Student called.
 * Instance block of class Student executed.
 * Constructor of class Student called.
 * 
