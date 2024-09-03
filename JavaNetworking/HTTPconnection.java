package JavaNetworking;

import java.net.*;
import java.io.*;

public class HTTPconnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.facebook.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
