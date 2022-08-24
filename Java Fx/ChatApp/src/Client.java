// program to make a server-client based chatting app in java using Socket class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	static Socket socket = null;
	
	public static void main(String[] args) {
		try {
			System.out.println("Connecting on port 9999...");
			socket = new Socket(InetAddress.getLocalHost(), 9999);

			if(socket != null) {
				System.out.println("Connected on port 9999.");
				
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
				
				// creating threads for receiving and sending
				Thread tWrite = new Thread(new Runnable() {
					String lineKeyboard= "";
					boolean check = true;
					
					@Override
					public void run() {
						try {
							while(check && socket != null) {
								synchronized (this) {
									lineKeyboard = buf.readLine();
								}
								
								System.out.println(lineKeyboard);
								out.println(lineKeyboard);
								if(lineKeyboard.equalsIgnoreCase("bye"));
									check = false;
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				
				Thread tRead = new Thread(new Runnable() {
					String lineServer= "";
					boolean check = true;
					
					@Override
					public void run() {
						try {
							while (check && socket != null) {
								lineServer =  in.readLine();
								System.out.println("From server: " + lineServer);
								if (lineServer.equalsIgnoreCase("bye"))
									check = false;
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}); 
				
				tRead.start();
				tWrite.start();
				try {
					tWrite.join();
					tRead.join();
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
				socket.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
