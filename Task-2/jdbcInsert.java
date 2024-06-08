import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcInsert {

    
    private static final String url = "jdbc:mysql://localhost:3306/techm?useSSL=false";
    private static final String user = "root"; 
    private static final String password = "1234"; 
    
    private static Connection connection;

    public static void main(String[] args) {
        try {
            
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) 
            {
                System.out.println("Connected to the database!");
            }
            String sql = "INSERT INTO employee (empname, empid) VALUES (?, ?)";            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "hi");
            preparedStatement.setString(2, "12");
            preparedStatement.executeUpdate(); 
            preparedStatement.setString(1, "bye");
            preparedStatement.setString(2, "45");
            preparedStatement.executeUpdate();
            System.out.println("Records inserted successfully!");

        }
        catch (SQLException e) 
        {
           e.printStackTrace();
            }
        }
    }
