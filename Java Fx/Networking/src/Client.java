// program to make a server-client based chatting app in java using Socket class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket(InetAddress.getLocalHost(), 9999);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Connecting on port 9999...");
			
			if(socket != null) {
				System.out.println("Connected on port 9999.");
				
				String lineKeyboard= "";
				String lineServer = "";
				boolean check = true;
				
				while(check) {
					lineKeyboard = buf.readLine();
					out.println(lineKeyboard);
					if(lineKeyboard.equalsIgnoreCase("bye"))
						check = false;
					lineServer = in.readLine();
					System.out.println("From server: " + lineServer);
					if(lineServer.equalsIgnoreCase("bye"))
						check = false;
				}
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}