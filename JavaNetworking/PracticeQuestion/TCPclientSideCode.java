// Client side code

package JavaNetworking.PracticeQuestion;

import java.io.*;
import java.net.*;

public class TCPclientSideCode {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            output.writeUTF("Hello Server:");
            String message = input.readUTF();
            System.out.print("Server : " + message);
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
