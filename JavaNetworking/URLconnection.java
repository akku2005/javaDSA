package JavaNetworking;

import java.io.*;
import java.net.*;

public class URLconnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
