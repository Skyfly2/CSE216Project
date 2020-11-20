import java.util.*;
import java.sql.*;

public class CSE216DBConnect {
    private static String host = "localhost:3306";
    private static String user = "root";
    private static String pass = "";

    public static Connection connect() {
        try {
            Connection connect = DriverManager.getConnection(host, user, pass);
            return connect;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
