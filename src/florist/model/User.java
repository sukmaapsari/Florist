package florist.model;

import florist.connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class User extends DatabaseConnection{
    int id;
    String name;
    String username;
    String password;
    String address;
    String phoneNumber;
    int role;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public int getRole(){
        return role;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void signIn(){
        try{
            getDatabaseConnection();
            query = "SELECT * FROM tb_user WHERE username=? AND password=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                id = result.getInt("id");
                name = result.getString("name");
                address = result.getString("address");
                phoneNumber = result.getString("phone_number");
                role = result.getInt("role");
                password = result.getString("password");
                username = result.getString("username");
            } else {
                System.out.println("User not Found");
            } 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Sign In Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void signUp() {
        try{
            getDatabaseConnection();
            query = "INSERT INTO tb_user (username, password, name, address, phone_number, role)VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, name);
            statement.setString(4, address);
            statement.setString(5, phoneNumber);
            statement.setInt(6, 2);
            statement.executeUpdate();
            connection.close();
            clean();
            JOptionPane.showMessageDialog(null, "Sign Up Successfull");
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Sign up Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getDataUserById(){
        try{
            getDatabaseConnection();
            query = "SELECT * FROM tb_user WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                name = result.getString("name");
                address = result.getString("address");
                phoneNumber = result.getString("phone_number");
            } else {
                System.out.println("User not Found");
            } 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Get Data User Error");
            System.out.println(e.getMessage());
        }
    }
    
    private void clean(){
        id = 0;
        name  = null;
        username = null;
        password = null;
        address = null;
        phoneNumber = null;
        role = 0;
    }
    
    
}
