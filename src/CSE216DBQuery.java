import java.util.*;
import java.sql.*;

public class CSE216DBQuery extends CSE216Facade {
    private static Connection con = CSE216DBConnect.connect();

    public void store(CState obj) {
        String query = "INSERT INTO objects (hostname, filename, filetype, message) VALUES (" + obj.getHostname() + ", "
                + obj.getFilename() + ", " + obj.getFiletype() + ", " + obj.getMessage() + ")";
        try (Statement statement = con.createStatement()) {
            ResultSet result = statement.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public CState retrieve(String user) {
        String query = "SELECT * FROM objects";
        try (Statement statement = con.createStatement()) {
            CState res = new CState();
            ResultSet result = statement.executeQuery(query);
            return res;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
