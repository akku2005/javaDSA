package JavaNetworking;

import java.io.*;
import java.net.*;

public class ClientSideCode {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String message = "";
            String response = "";

            // Keep the connection alive until 'exit' is typed
            while (!message.equals("exit")) {
                System.out.print("Client: ");
                response = reader.readLine();
                output.writeUTF(response);
                output.flush();

                if (response.equals("exit")) {
                    break;
                }

                message = input.readUTF();
                System.out.println("Server: " + message);
            }

            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
