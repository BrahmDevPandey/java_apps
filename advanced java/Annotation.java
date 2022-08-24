
// program to demo the creation of a custom annotation in java
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    public int printName();
}

public class Annotation {
    @MyAnnotation(printName = 10)
    public void printName() {
        System.out.println("My name is Aman Pandey");
    }

    public static void main(String args[]) throws Exception {
        Annotation a = new Annotation();
        a.printName();
        MyAnnotation ann = a.getClass().getMethod("printName").getAnnotation(MyAnnotation.class);
        System.out.println(ann.printName());
    }
}