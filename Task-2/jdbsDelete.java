import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbsDelete {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/techm?useSSL=false&requireSSL=false";
        String jdbcUsername = "root";  
        String jdbcPassword = "1234";  
        String sql = "DELETE FROM employee WHERE empname = ?";
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "hi");
            int rowsAffected = statement.executeUpdate();
            System.out.println("sucessfully deleted");
            statement.setString(1, "bye");
            rowsAffected = statement.executeUpdate();
            System.out.println("sucessfully deleted");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}