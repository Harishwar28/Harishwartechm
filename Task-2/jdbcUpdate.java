import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdate {

    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/techm?useSSL=false&requireSSL=false";
        String jdbcUsername = "root";  
        String jdbcPassword = "1234";
        String sql = "UPDATE employee SET empid=? WHERE empname = ?";

        // Establishing the connection
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Update record for 'John Doe'
            statement.setString(1, "5");
            statement.setString(2, "hari");
            int rowsAffected = statement.executeUpdate();
            System.out.println("updated sucessfully");

            
            statement.setString(1, "10");
            statement.setString(2, "murali");
            rowsAffected = statement.executeUpdate();
            System.out.println("updated sucessfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}