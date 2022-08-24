// program to make a server-client based chatting app in java using Socket class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static ServerSocket serverSocket = null;
	static Socket socket = null;
	
	public static void main(String[] args) {		
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("Listening on port 9999...");
			socket = serverSocket.accept();
			
			if(socket != null) {
				System.out.println("Connected on port 9999.");
	
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	
				// creating threads for receiving and sending
r				Thread tWrite = new Thread(new Runnable() {
					String lineKeyboard= "";
					boolean check = true;
					
					@Override
					public void run() {
						try {
							while(check && socket != null) {
								synchronized (this) {									
									lineKeyboard = buf.readLine();
								}
								out.println(lineKeyboard);
								if(lineKeyboard.equalsIgnoreCase("bye"))
									check = false;
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				
				Thread tRead = new Thread(new Runnable() {
					String lineClient = "";
					boolean check = true;
					
					@Override
					public void run() {
						try {
							while (check && socket != null) {
								lineClient = in.readLine();
								System.out.println("From client: " + lineClient);
								if(lineClient.equalsIgnoreCase("bye"))
									check = false;
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}); 

				tWrite.start();
				tRead.start();
				try {
					tRead.join();
					tWrite.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
