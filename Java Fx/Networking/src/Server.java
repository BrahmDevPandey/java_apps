// program to make a server-client based chatting app in java using Socket class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9999);
			socket = serverSocket.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Listening on port 9999...");
			
			if(socket != null) {
				System.out.println("Connected on port 9999.");
				
				String lineKeyboard= "";
				String lineClient = "";
				boolean check = true;
				
				while(check) {
					lineKeyboard = buf.readLine();
					out.println(lineKeyboard);
					if(lineKeyboard.equalsIgnoreCase("bye"))
						check = false;
					lineClient = in.readLine();
					System.out.println("From client: " + lineClient);
					if(lineClient.equalsIgnoreCase("bye"))
						check = false;
					out.println(lineClient);
				}
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		finally {
			try {
				serverSocket.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}