import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface AnotherAnnotation {
    String value();
}

public class AnnotationDemo {
    @MyCustomAnnotation
    public static void main(String args[]) throws Exception {
        System.out.println("Hello from main");
        AnnotationDemo a = new AnnotationDemo();
        AnotherAnnotation ann = a.getClass().getMethod("method").getAnnotation(AnotherAnnotation.class);
        System.out.println("Annntation value " + ann.value());
    }

    @AnotherAnnotation(value = "Aman") // applying a parameterized annotation
    public void method() {
        return;
    }
}
