package florist.model;

import florist.connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Report extends DatabaseConnection{
    
    DefaultTableModel tableModel = new DefaultTableModel();
    int id;
    String product;
    int qty;
    int price;
    String costumer;
    String phoneNumber;
    String address;
    int totalPayment;
    int incomeReport;
    int cancelTransactionReport;
    int orderTransactionReport;
    int deliveryTransactionReport;
    int successTransactionReport;
    
    
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
    
    public DefaultTableModel getTableModel(){
        return tableModel;
    }
    
    public int getIncomeReport(){
        return incomeReport;
    }
    
    public int getCancelTransactionReport(){
        return cancelTransactionReport;
    }
    
    public int getSuccessTransactionReport(){
        return successTransactionReport;
    }
    
    public int getDeliveryTransactionReport(){
        return deliveryTransactionReport;
    }
    
    public int getOrderTransactionReport(){
        return orderTransactionReport;
    }
    
    public void setIncome(){
        try{
            getDatabaseConnection();
            query = "SELECT SUM(total_payment) AS income FROM tb_transaction WHERE tb_transaction.status='SUCCESS';";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                incomeReport = result.getInt("income");   
            } else {
                System.out.println("Income not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Income Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void setSuccessTransactionReport(){
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_success FROM tb_transaction WHERE tb_transaction.status='SUCCESS';";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                successTransactionReport = result.getInt("transaction_success");   
            } else {
                System.out.println("Transaction Success not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Success Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void setCancelTransactionReport(){
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_cancel FROM tb_transaction WHERE tb_transaction.status='CANCEL';";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                cancelTransactionReport = result.getInt("transaction_cancel");   
            } else {
                System.out.println("Transaction Cancel not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Cancel Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void setDeliveryTransactionReport(){
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_delivery FROM tb_transaction WHERE tb_transaction.status='DELIVERY';";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                deliveryTransactionReport = result.getInt("transaction_delivery");   
            } else {
                System.out.println("Transaction Delivery not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Delivery Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void setOrderTransactionReport(){
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_order FROM tb_transaction WHERE tb_transaction.status='ORDERED';";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                orderTransactionReport = result.getInt("transaction_order");   
            } else {
                System.out.println("Transaction Order not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Order Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getAllDataTransaction(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        System.out.println("test");
        if (tableModel.getColumnCount() == 0){
            tableModel.addColumn("ID ORDER");
            tableModel.addColumn("DATE");
            tableModel.addColumn("TOTAL");
            tableModel.addColumn("STATUS");
        }
        try{
            getDatabaseConnection();
            query = "SELECT * FROM tb_transaction\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("date"),
                    result.getInt("total_payment"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Data Transaction Error");
            System.out.println(e.getMessage());
        }
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
