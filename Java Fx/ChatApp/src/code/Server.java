import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String line = null;
        String data = null;

        try {
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("Lisening on port 9999...");
            Socket s = ss.accept();
            if (s != null) {
                System.out.println("Connected on port 9999");
                BufferedReader brkey = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                OutputStream os = s.getOutputStream();
                PrintWriter out = new PrintWriter(os, true);
                boolean check = true;
                while (check) {
                    data = brkey.readLine();
                    out.println(data);
                    line = br.readLine();
                    System.out.println("Client:" + line);
                    if (line.equalsIgnoreCase("bye")) {
                        check = false;
                    }
                    // out.println(line);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}