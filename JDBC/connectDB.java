package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class connectDB {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testDb";
        String username = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to db");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
