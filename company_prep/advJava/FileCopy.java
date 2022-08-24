
// program to copy a file data to another using byte streams
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        // creating file objects for input and output file
        File in = new File("file.txt");
        File out = new File("file_copy.txt");

        try {
            // creating file input and output streams
            FileInputStream fin = new FileInputStream(in);
            FileOutputStream fout = new FileOutputStream(out);
            int data;

            // reading data from the input file
            while ((data = fin.read()) != -1) {
                // writing data to the output copy file
                fout.write(data);
            }

            // close the objects
            fin.close();
            fout.close();

            System.out.println("File Copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to find the input file to copy.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
