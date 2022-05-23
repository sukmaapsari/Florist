package florist.model;

import florist.connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product extends DatabaseConnection {
    
    DefaultTableModel tableModel = new DefaultTableModel();
    int id;
    String name;
    int price;
    int stock;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getStock(){
        return stock;
    }
    
    public DefaultTableModel getTableModel(){
        return tableModel;
    }
    
    public void getProduct(){
        try{
            getDatabaseConnection();
            query = "SELECT * FROM tb_product WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                id = result.getInt("id");
                name = result.getString("name");
                price = result.getInt("price");
                stock = result.getInt("stock");   
            } else {
                System.out.println("Product not Found");
            } 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Get Product Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getProductByName(){
        try{
            getDatabaseConnection();
            query = "SELECT * FROM tb_product WHERE name=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                id = result.getInt("id");
                name = result.getString("name");
                price = result.getInt("price");
                stock = result.getInt("stock");   
            } else {
                System.out.println("Product not Found");
            } 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Get Product Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getAllDataProduct(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        if (tableModel.getColumnCount() == 0){
            tableModel.addColumn("ID PRODUCT");
            tableModel.addColumn("PRODUCT");
            tableModel.addColumn("PRICE");
            tableModel.addColumn("STOCK");
        }
        try{
            getDatabaseConnection();
            query = "SELECT * FROM tb_product";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("price"),
                    result.getString("stock")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Data Product Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void addProduct(){
        try{
            getDatabaseConnection();
            query = "INSERT INTO tb_product (name, price, stock)VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, price);
            statement.setInt(3, stock);
            statement.executeUpdate();
            connection.close();
            clean();
            JOptionPane.showMessageDialog(null, "Add Data Successfull");
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Add Data Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void updateProduct(){
        try{
            getDatabaseConnection();
            query = "UPDATE tb_product SET name=?,price=?,stock=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, price);
            statement.setInt(3, stock);
            statement.setInt(4, id);
            statement.executeUpdate();
            connection.close();
            clean();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Product Update Error");
            System.out.println(e.getMessage());
        }
    }
    
        public void updateStockProduct(){
        try{
            getDatabaseConnection();
            query = "UPDATE tb_product SET stock=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, stock);
            statement.setInt(2, id);
            statement.executeUpdate();
            connection.close();
            clean();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Product Update Error");
            System.out.println(e.getMessage());
        }
    }
    
    private void clean(){
        id = 0;
        name  = null;
        price = 0;
        stock = 0;
    }
}
