package florist.model;

import florist.connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Transaction extends DatabaseConnection {
    int id;
    int product;
    int costumer;
    int price;
    int qty;
    int totalPayment;
    String address;
    String dateTime;
    String status;
    String greetings;
    String paymentMethod;
    String note;
    int productionDuration;
    String evidence;
    DefaultTableModel tableModel = new DefaultTableModel();
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setProduct(int product){
        this.product = product;
    }
    
    public void setCostumer(int costumer){
        this.costumer = costumer;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public void setTotalPayment(int totalPayment){
        this.totalPayment = totalPayment;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setNote(String note){
        this.note = note;
    }
    
    public void setGreetings(String greetings){
        this.greetings = greetings;
    }
    
    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    
    public void setProductionDuration(int productionDuration){
        this.productionDuration = productionDuration;
    }
    
    public void setEvidence(String evidence){
        this.evidence = evidence;
    }
    
    public DefaultTableModel getTableModel(){
        return tableModel;
    }
    
    public void addDataTransaction(){
        try{
            getDatabaseConnection();
            query = "INSERT INTO tb_transaction (product, costumer, price, qty, total_payment, address,  greetings, payment_method, production_duration)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, product);
            statement.setInt(2, costumer);
            statement.setInt(3, price);
            statement.setInt(4, qty);
            statement.setInt(5, totalPayment);
            statement.setString(6, address);
            statement.setString(7, greetings);
            statement.setString(8, paymentMethod);
            statement.setInt(9, productionDuration);
            statement.executeUpdate();
            connection.close();
            clean();
            JOptionPane.showMessageDialog(null, "Transaction Successfull");
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Transaction Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getDataTransactionByIdCostumer(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        if (tableModel.getColumnCount() == 0){
            tableModel.addColumn("ID ORDER");
            tableModel.addColumn("DATE");
            tableModel.addColumn("PRODUCT");
            tableModel.addColumn("QTY");
            tableModel.addColumn("TOTAL PAYMENT");
            tableModel.addColumn("PRODUCTION DURATION");
            tableModel.addColumn("STATUS");
        }
        try{
            getDatabaseConnection();
            query = "SELECT tb_transaction.id,tb_transaction.date,tb_product.name,tb_transaction.qty,tb_transaction.total_payment,tb_transaction.production_duration,tb_transaction.status FROM tb_transaction\n" +
                    "INNER JOIN tb_product ON tb_transaction.product=tb_product.id\n" +
                    "WHERE tb_transaction.costumer=?\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, costumer);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("date"),
                    result.getString("name"),
                    result.getInt("qty"),
                    result.getInt("total_payment"),
                    result.getInt("production_duration"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Data Transaction By Id Costumer Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getAllDataTransaction(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        if (tableModel.getColumnCount() == 0){
            tableModel.addColumn("ID ORDER");
            tableModel.addColumn("DATE");
            tableModel.addColumn("PRODUCT");
            tableModel.addColumn("QTY");
            tableModel.addColumn("TOTAL PAYMENT");
            tableModel.addColumn("PRODUCTION DURATION");
            tableModel.addColumn("STATUS");
        }
        try{
            getDatabaseConnection();
            query = "SELECT tb_transaction.id,tb_transaction.date,tb_product.name,tb_transaction.qty,tb_transaction.total_payment,tb_transaction.production_duration,tb_transaction.status FROM tb_transaction\n" +
                    "INNER JOIN tb_product ON tb_transaction.product=tb_product.id\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("date"),
                    result.getString("name"),
                    result.getInt("qty"),
                    result.getInt("total_payment"),
                    result.getInt("production_duration"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get All Data Transaction Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getAllDataTransactionByStatus(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        if (tableModel.getColumnCount() == 0){
            tableModel.addColumn("ID ORDER");
            tableModel.addColumn("DATE");
            tableModel.addColumn("PRODUCT");
            tableModel.addColumn("QTY");
            tableModel.addColumn("TOTAL PAYMENT");
            tableModel.addColumn("PRODUCTION DURATION");
            tableModel.addColumn("STATUS");
        }
        try{
            getDatabaseConnection();
            query = "SELECT tb_transaction.id,tb_transaction.date,tb_product.name,tb_transaction.qty,tb_transaction.total_payment,tb_transaction.production_duration,tb_transaction.status FROM tb_transaction\n" +
                    "INNER JOIN tb_product ON tb_transaction.product=tb_product.id\n" +
                    "WHERE tb_transaction.status=?\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, status);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("date"),
                    result.getString("name"),
                    result.getInt("qty"),
                    result.getInt("total_payment"),
                    result.getInt("production_duration"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get All Data Transaction By Status Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void updateStatusTransaction(){
        try{
            getDatabaseConnection();
            query = "UPDATE tb_transaction SET status=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, status);
            statement.setInt(2, id);
            statement.executeUpdate();
            connection.close();
            clean();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Status Update Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void updateNoteTransaction(){
        try{
            getDatabaseConnection();
            query = "UPDATE tb_transaction SET note=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, note);
            statement.setInt(2, id);
            statement.executeUpdate();
            connection.close();
            clean();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Note Update Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void updateEvidenceTransaction(){
        try{
            getDatabaseConnection();
            query = "UPDATE tb_transaction SET evidence=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, evidence);
            statement.setInt(2, id);
            statement.executeUpdate();
            connection.close();
            clean();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Evidence Update Error");
            System.out.println(e.getMessage());
        }
    }
    
    private void clean(){
        id = 0;
        product = 0;
        costumer = 0;
        price = 0;
        qty = 0;
        totalPayment = 0;
        address = null;
        dateTime = null;
        status = null;
    }
}
