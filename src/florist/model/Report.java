package florist.model;

import florist.connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    String greetings;
    String paymentMethod;
    int productionDuration;
    String status;
    String note;

    public void setId(int id){
        this.id = id;
    }
    
    public void setStatus(int id){
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
    
    public String getGreetings(){
        return greetings;
    }
    
    public String getPaymentMethod(){
        return paymentMethod;
    }
    
    public int getProductionDuration(){
        return productionDuration;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getNote(){
        return note;
    }
    public DefaultTableModel getTableModel(){
        return tableModel;
    }
    
    public int getIncomeReport(){
        int incomeReport = 0;
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
        return incomeReport;
    }
    
    public int getIncomeReportByMonth(int month){
        int incomeReport = 0;
        try{
            getDatabaseConnection();
            query = "SELECT SUM(total_payment) AS income FROM tb_transaction \n" +
                    "WHERE tb_transaction.status='SUCCESS' && MONTH(tb_transaction.date)=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, month);
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
        return incomeReport;
    }
    
    public int getIncomeReportByYear(int year){
        int incomeReport = 0;
        try{
            getDatabaseConnection();
            query = "SELECT SUM(total_payment) AS income FROM tb_transaction \n" +
                    "WHERE tb_transaction.status='SUCCESS' && YEAR(tb_transaction.date)=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, year);
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
        return incomeReport;
    }
    
    public int getIncomeReportByMonthAndYear(int month, int year){
        int incomeReport = 0;
        try{
            getDatabaseConnection();
            query = "SELECT SUM(total_payment) AS income FROM tb_transaction \n" +
                    "WHERE tb_transaction.status='SUCCESS' && MONTH(tb_transaction.date)=? && YEAR(tb_transaction.date)=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, month);
            statement.setInt(2, year);
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
        return incomeReport;
    }
    
    public int getTransactionReport(String status){
        int transactionReport = 0;
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_success FROM tb_transaction WHERE tb_transaction.status=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, status);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                transactionReport = result.getInt("transaction_success");   
            } else {
                System.out.println("Transaction Success not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Success Error");
            System.out.println(e.getMessage());
        }
        return transactionReport;
    }
    
    public int getTransactionReportByMonth(String status, int month){
        int transactionReport = 0;
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_success FROM tb_transaction\n" +
                    "WHERE tb_transaction.status=? && MONTH(tb_transaction.date)=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, status);
            statement.setInt(2, month);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                transactionReport = result.getInt("transaction_success");   
            } else {
                System.out.println("Transaction Success not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Success Error");
            System.out.println(e.getMessage());
        }
        return transactionReport;
    }
    
    public int getTransactionReportByYear(String status, int year){
        int transactionReport = 0;
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_success FROM tb_transaction\n" +
                    "WHERE tb_transaction.status=? && YEAR(tb_transaction.date)=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, status);
            statement.setInt(2, year);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                transactionReport = result.getInt("transaction_success");   
            } else {
                System.out.println("Transaction Success not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Success Error");
            System.out.println(e.getMessage());
        }
        return transactionReport;
    }
    
    public int getTransactionReportByMonthAndYear(String status, int month, int year){
        int transactionReport = 0;
        try{
            getDatabaseConnection();
            query = "SELECT COUNT(*) AS transaction_success FROM tb_transaction\n" +
                    "WHERE tb_transaction.status=? && MONTH(tb_transaction.date)=? && YEAR(tb_transaction.date)=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, status);
            statement.setInt(2, month);
            statement.setInt(3, year);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                transactionReport = result.getInt("transaction_success");   
            } else {
                System.out.println("Transaction Success not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Transaction Success Error");
            System.out.println(e.getMessage());
        }
        return transactionReport;
    }
    
    public ArrayList<Integer> getListYear(){
        ArrayList<Integer> listYear = new ArrayList<>();
        try{
            getDatabaseConnection();
            query = "SELECT YEAR(tb_transaction.date) AS data_year FROM tb_transaction\n"
                    + "GROUP BY YEAR(tb_transaction.date);";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                listYear.add(result.getInt("data_year"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Year Error");
            System.out.println(e.getMessage());
        }
        return listYear;
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
                    result.getInt("qty"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get All Data Transaction Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getAllDataTransactionByYear(int year){
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
                    "WHERE YEAR(tb_transaction.date)=?\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, year);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("date"),
                    result.getString("name"),
                    result.getInt("qty"),
                    result.getInt("total_payment"),
                    result.getInt("qty"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get All Data Transaction By Year Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getAllDataTransactionByMonth(int month){
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
                    "WHERE MONTH(tb_transaction.date)=?\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, month);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("date"),
                    result.getString("name"),
                    result.getInt("qty"),
                    result.getInt("total_payment"),
                    result.getInt("qty"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get All Data Transaction By MonthError");
            System.out.println(e.getMessage());
        }
    }
    
    public void getAllDataTransactionByMonthAndYear(int month, int year){
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
                    "WHERE YEAR(tb_transaction.date)=? && MONTH(tb_transaction.date)=?\n" +
                    "ORDER BY id ASC;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, year);
            statement.setInt(2, month);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                tableModel.addRow(new Object[]{
                    result.getInt("id"),
                    result.getString("date"),
                    result.getString("name"),
                    result.getInt("qty"),
                    result.getInt("total_payment"),
                    result.getInt("qty"),
                    result.getString("status")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get All Data Transaction By Month And Year Error");
            System.out.println(e.getMessage());
        }
    }
    
    public void getDetailTransaction(){
        try{
            getDatabaseConnection();
            String query = "SELECT tb_product.name AS product,tb_transaction.qty,tb_transaction.price,tb_transaction.greetings,tb_transaction.production_duration,tb_user.name AS costumer,tb_user.phone_number,tb_transaction.address,tb_transaction.total_payment,tb_transaction.payment_method,tb_transaction.status,tb_transaction.note FROM tb_transaction\n" +
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
                greetings = result.getString("greetings");
                productionDuration = result.getInt("production_duration");
                costumer = result.getString("costumer");
                address = result.getString("address");
                phoneNumber = result.getString("phone_number");
                totalPayment = result.getInt("total_payment");
                paymentMethod = result.getString("payment_method");
                status = result.getString("status");
                note = result.getString("note");
            } else {
                System.out.println("Transaction not Found");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Get Detail Transaction Error");
            System.out.println(e.getMessage());
        }
    }
}
