// program to copy a file
import java.io.*;

public class FileCopy {
	public static void main(String[] args) {
		File inputFile = new File("src//URLDemo.java");
		File outputFile = new File("src//URLCopy.java");
		int ch;
		
		try {
			FileReader fr = new FileReader(inputFile);
			FileWriter fw = new FileWriter(outputFile);
			
			// reading inputFile character by character
			while((ch = fr.read()) != -1) {
				// writng each character to the outputFile
				fw.write(ch);
			}
			fr.close();
			fw.close();
			System.out.println("File copied successfully.");
		} catch(IOException e) {
			System.out.println("Exception occurred. Unable to open files.");
			e.printStackTrace();
		}
	}
}
