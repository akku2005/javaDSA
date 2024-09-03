package JavaNetworking;

import java.io.*;
import java.net.*;

public class ServerSideCode {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server Started...waiting for a client:");

            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");

            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String message = "";
            String response = "";

            // Keep the connection alive until 'exit' is typed
            while (!message.equals("exit")) {
                message = input.readUTF();
                System.out.println("Client: " + message);

                if (message.equals("exit")) {
                    break;
                }

                System.out.print("Server: ");
                response = reader.readLine();
                output.writeUTF(response);
                output.flush();
            }

            input.close();
            output.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
