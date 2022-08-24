// program to demo the URL class in java.net
import java.net.URL;
import java.net.MalformedURLException;

public class URLDemo {
	public static void main(String[] args) {
		String urlString = "https://www.kiet.edu:443/";
		try {
			URL url = new URL(urlString);
			System.out.println("Details of URL are:");
			System.out.println("Domain name: " + url.getHost());
			System.out.println("Port number: " + url.getPort());
			System.out.println("Default Port number: " + url.getDefaultPort());
			System.out.println("Protocol name: " + url.getProtocol());
			System.out.println("Path: " + url.getFile());
		} catch(MalformedURLException e) {
			System.out.println("Malformed URL Exception occurred in code.");
			e.printStackTrace();
		}
		
	}
}
