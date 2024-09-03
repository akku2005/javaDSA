// TCP Server side code

package JavaNetworking.PracticeQuestion;

import java.io.*;
import java.net.*;

public class TCPserverSideCode {
    public static void main(String[] args) {
        try {
            ServerSocket Serversocket = new ServerSocket(5000);
            System.out.print("Server Started...Waiting for client connection:");

            Socket socket = Serversocket.accept();
            System.out.print("Client Connected...*_* ");

            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            String message = input.readUTF();

            System.out.print("Client : " + message);
            output.writeUTF("Hello Client.");

            input.close();
            output.close();
            Serversocket.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
