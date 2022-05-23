package florist.model;

import florist.connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DetailTransaction extends DatabaseConnection {
    int id;
    String product;
    int qty;
    int price;
    String costumer;
    String phoneNumber;
    String address;
    int totalPayment;
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getProduct(){
        return product;
    }
    
    public String getCostumer(){
        return costumer;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public int getTotalPayment(){
        return totalPayment;
    }
    
    public String getAddress(){
        return address;
    }
    
    
    public void getDetailTransaction(){
        try{
            getDatabaseConnection();
            String query = "SELECT tb_product.name AS product,tb_transaction.qty,tb_product.price,tb_user.name AS costumer,tb_user.phone_number,tb_transaction.address,tb_transaction.total_payment FROM tb_transaction\n" +
                           "INNER JOIN tb_product ON tb_transaction.product=tb_product.id\n" +
                           "INNER JOIN tb_user ON tb_transaction.costumer=tb_user.id\n" +
                           "WHERE tb_transaction.id=?;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                product = result.getString("product");
                qty = result.getInt("qty");
                price = result.getInt("price");
                costumer = result.getString("costumer");
                address = result.getString("address");
                phoneNumber = result.getString("phone_number");
                totalPayment = result.getInt("total_payment");     
            } else {
                System.out.println("Transaction not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Detail Transaction Error");
            System.out.println(e.getMessage());
        }
    }
}
