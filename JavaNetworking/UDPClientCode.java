package JavaNetworking;

import java.io.IOException;
import java.net.*;

public class UDPClientCode {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            String message = "Hello server";
            byte[] buffer = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
            socket.send(packet);

            buffer = new byte[1024];
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            message = new String(packet.getData(), 0, packet.getLength());

            System.out.println("Server :" + message);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
