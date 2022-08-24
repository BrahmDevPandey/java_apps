import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        String line = null;
        String data = null;
        try {
            Socket s = new Socket("127.0.0.1", 9999);
            System.out.println("Conneting on port 9999...");
            if (s != null) {
                BufferedReader brkey = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                OutputStream os = s.getOutputStream();
                PrintWriter out = new PrintWriter(os, true);
                boolean check = true;
                while (check) {
                    data = brkey.readLine();
                    out.println(data);
                    line = br.readLine();
                    System.out.println("Server:" + line);
                    if (line.equalsIgnoreCase("bye")) {
                        check = false;
                    }
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
