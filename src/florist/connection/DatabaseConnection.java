package florist.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    public Connection connection;
    public String query;
    
    public void getDatabaseConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_florist", "root", "");
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Database Connection Failed");
            System.out.println(e.getMessage());
        }
    }
}
