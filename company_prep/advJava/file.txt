
// program to demo the reading and writing Java objects to a data file
import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;
    private char gender;

    public Person() {
        name = "";
        age = 0;
        gender = '\0';
    }

    public Person(String name, int age, char gender) {
        this.name = new String(name);
        this.age = age;
        this.gender = gender;
    }

    public void inputDetails() throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter person details: ");
        System.out.print("\tName: ");
        this.name = buf.readLine();
        System.out.print("\tAge: ");
        this.age = Integer.parseInt(buf.readLine());
        System.out.print("\tGender (M/F): ");
        this.gender = buf.readLine().charAt(0);
    }

    public void outputDetails() {
        System.out.println("Person details are: ");
        System.out.println("\tName: " + this.name);
        System.out.println("\tAge: " + this.age);
        System.out.println("\tGender: " + (this.gender == 'M' ? "Male" : "Female"));
    }
}

public class ObjectIO {
    public static void main(String args[]) {
        File file = new File("people.dat");
        try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);

            byte count = 2;
            Person p;

            do {
                // reading person details
                p = new Person();
                p.inputDetails();
                // writing details to file
                o.writeObject(p);
                count--;
            } while (count > 0);

            o.close();
            f.close();

            // reading details from the file
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream oi = new ObjectInputStream(fi);

            System.out.println("All objects in the file are: ");
            while (true) {
                try {
                    p = (Person) oi.readObject();
                    p.outputDetails();
                } catch (EOFException e) {
                    break;
                }
            }

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException Occurred");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error converting read data to object.");
            e.printStackTrace();
        }
    }
}