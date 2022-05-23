package florist.model;

import florist.connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product extends DatabaseConnection {
    
    DefaultTableModel tableModel = new DefaultTableModel();
    int id;
    String name;
    int category;
    int price;
    int stock;
    int productionDuration;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCategory(int category){
        this.category = category;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
        
    public void setProductionDuration(int production_duration){
        this.productionDuration = production_duration;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCategory(){
        return category;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getStock(){
        return stock;
    }
    
    public int getProductionDuration(){
        return productionDuration;
    }
    
    public ArrayList<String> getListCategory(){
        ArrayList<String> listCategory = new ArrayList<>();
        try{
            getDatabaseConnection();
            query = "SELECT * FROM tb_category";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                listCategory.add(result.getString("category"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Data Category Error");
            System.out.println(e.getMessage());
        }
        return listCategory;
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
                category = result.getInt("category");
                price = result.getInt("price");
                stock = result.getInt("stock");
                productionDuration = result.getInt("production_duration");
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
            tableModel.addColumn("ID");
            tableModel.addColumn("PRODUCT");
            tableModel.addColumn("CATEGORY");
            tableModel.addColumn("PRICE");
            tableModel.addColumn("STOCK");
            tableModel.addColumn("PRODUCTION(DAY)");
        }
        try{
            getDatabaseConnection();
            query = "SELECT tb_product.id,tb_product.name,tb_category.category,tb_product.price,tb_product.stock,tb_product.production_duration FROM tb_product\n" +
                    "INNER JOIN tb_category ON tb_product.category=tb_category.id\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("name"),
                    result.getString("category"),
                    result.getInt("price"),
                    result.getInt("stock"),
                    result.getInt("production_duration")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Data Product Error");
            System.out.println(e.getMessage());
        }
    }
    
        public void getAllDataProductByCategory(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        if (tableModel.getColumnCount() == 0){
            tableModel.addColumn("ID");
            tableModel.addColumn("PRODUCT");
            tableModel.addColumn("PRICE");
            tableModel.addColumn("STOCK");
            tableModel.addColumn("PRODUCTION DURATIONS(DAY)");
        }
        try{
            getDatabaseConnection();
            query = "SELECT tb_product.id,tb_product.name,tb_category.category,tb_product.price,tb_product.stock,tb_product.production_duration FROM tb_product\n" +
                    "INNER JOIN tb_category ON tb_product.category=tb_category.id\n" +
                    "WHERE tb_product.category=?\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, category);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("price"),
                    result.getInt("stock"),
                    result.getInt("production_duration")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Data Product Bouqet Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void addProduct(){
        try{
            getDatabaseConnection();
            query = "INSERT INTO tb_product (name, category, price, stock, production_duration)VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, category);
            statement.setInt(3, price);
            statement.setInt(4, stock);
            statement.setInt(5, productionDuration);
            statement.executeUpdate();
            connection.close();
            clean();
            JOptionPane.showMessageDialog(null, "Add Product Successfull");
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Add Product Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void updateProduct(){
        try{
            getDatabaseConnection();
            query = "UPDATE tb_product SET name=?,category=?,price=?,stock=?,production_duration=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, category);
            statement.setInt(3, price);
            statement.setInt(4, stock);
            statement.setInt(5, productionDuration);
            statement.setInt(6, id);
            statement.executeUpdate();
            connection.close();
            clean();
            JOptionPane.showMessageDialog(null, "Update Product Successfull");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Update Product Error");
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
        
    public void deleteProduct(){
        try{
            getDatabaseConnection();
            query = "DELETE FROM tb_product WHERE id=?;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.close();
            clean();
            JOptionPane.showMessageDialog(null, "Delete Product Successfull");
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Delete Product Error");
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
