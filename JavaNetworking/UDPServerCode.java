package JavaNetworking;

import java.io.IOException;
import java.net.*;

public class UDPServerCode {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(5000);
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.print("Client :" + message);
            String response = "Hello client";

            buffer = response.getBytes();
            packet = new DatagramPacket(buffer, buffer.length, packet.getAddress(), packet.getPort());
            socket.send(packet);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
