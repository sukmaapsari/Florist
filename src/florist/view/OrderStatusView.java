package florist.view;

import florist.model.DetailTransaction;
import florist.model.Transaction;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderStatusView extends javax.swing.JFrame {

    Transaction transaction = new Transaction();
    DetailTransaction detailTransaction = new DetailTransaction();
    DefaultTableModel tableModel = new DefaultTableModel();
    int currentUserId;
    
    public OrderStatusView(int id) {
        initComponents();
        currentUserId = id;
        getTableDataTransaction();
        buttonRecieved.setVisible(false);
    }

    private void getTableDataTransaction(){
        transaction.setCostumer(currentUserId);
        transaction.getDataTransactionByIdCostumer();
        tableModel = transaction.getTableModel();
        tableTransaction.setModel(tableModel);
        tableTransaction.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonRecieved = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textProductName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAddress = new javax.swing.JTextArea();
        textCostumerName = new javax.swing.JTextField();
        textQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textPhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textTotalPayment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransaction = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Order List");

        buttonRecieved.setBackground(new java.awt.Color(255, 153, 153));
        buttonRecieved.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonRecieved.setText("Recieved");
        buttonRecieved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRecievedActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Product Name");

        textProductName.setEditable(false);
        textProductName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textProductName.setText("Product Name");
        textProductName.setToolTipText("");
        textProductName.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProductNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Costumer Name");

        textAddress.setEditable(false);
        textAddress.setColumns(20);
        textAddress.setRows(5);
        textAddress.setText("Address");
        textAddress.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane2.setViewportView(textAddress);

        textCostumerName.setEditable(false);
        textCostumerName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textCostumerName.setText("Name");
        textCostumerName.setToolTipText("");
        textCostumerName.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textCostumerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCostumerNameActionPerformed(evt);
            }
        });

        textQty.setEditable(false);
        textQty.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textQty.setText("0");
        textQty.setToolTipText("");
        textQty.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQtyActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Qty");

        textPhoneNumber.setEditable(false);
        textPhoneNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textPhoneNumber.setText("Phone Number");
        textPhoneNumber.setToolTipText("");
        textPhoneNumber.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneNumberActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Costumer Phone Number");

        textTotalPayment.setEditable(false);
        textTotalPayment.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textTotalPayment.setText("0");
        textTotalPayment.setToolTipText("");
        textTotalPayment.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textTotalPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTotalPaymentActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL PAYMENT");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Price");

        textPrice.setEditable(false);
        textPrice.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textPrice.setText("Price");
        textPrice.setToolTipText("");
        textPrice.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPriceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Order Details");

        tableTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID ORDER", "DATE", "PRODUCT", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTransactionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTransaction);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(textPhoneNumber)
                            .addComponent(textCostumerName)
                            .addComponent(textPrice)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(textTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonRecieved, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2)
                    .addContainerGap(1123, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCostumerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))))
                .addGap(18, 18, 18)
                .addComponent(buttonRecieved, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel2)
                    .addContainerGap(649, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPriceActionPerformed

    private void textTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalPaymentActionPerformed

    private void textPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneNumberActionPerformed

    private void textQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtyActionPerformed

    private void textCostumerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCostumerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCostumerNameActionPerformed

    private void textProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductNameActionPerformed

    private void buttonRecievedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRecievedActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to order this product?", "Order Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.NO_OPTION){
            //Do nothing
        } else if (option == JOptionPane.YES_OPTION){
            int row = tableTransaction.getSelectedRow();
            int idTransaction = (int) tableModel.getValueAt(row, 0);
            transaction.setId(idTransaction);
            transaction.setStatus("SUCCESS");
            transaction.updateStatusTransaction();
            getTableDataTransaction();
            
            if (buttonRecieved.isVisible()){
                buttonRecieved.setVisible(false);
            }
        }  
    }//GEN-LAST:event_buttonRecievedActionPerformed

    private void tableTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTransactionMouseClicked
        int row = tableTransaction.getSelectedRow();
        int idTransaction = (int) tableModel.getValueAt(row, 0);
        detailTransaction.setId(idTransaction);
        detailTransaction.getDetailTransaction();
        
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
         
        String product = detailTransaction.getProduct();
        int qty = detailTransaction.getQty();
        String strQty = String.valueOf(qty);
        int price = detailTransaction.getPrice();
        String strPrice = currency.format(price);
        String costumer = detailTransaction.getCostumer();
        String phoneNumber = detailTransaction.getPhoneNumber();
        String address = detailTransaction.getAddress();
        int totalPayment = detailTransaction.getTotalPayment();
        String strTotalPayment = currency.format(totalPayment);
        
        textProductName.setText(product);
        textQty.setText(strQty);
        textPrice.setText(strPrice);
        textCostumerName.setText(costumer);
        textPhoneNumber.setText(phoneNumber);
        textAddress.setText(address);
        textTotalPayment.setText(strTotalPayment);
        
        String status = (String) tableModel.getValueAt(row, 3);
        
        switch (status) {
            case "ORDERED":
                buttonRecieved.setVisible(false);
                break;
            case "DELIVERY":
                buttonRecieved.setVisible(true);
                break;
            case "SUCCESS":
                buttonRecieved.setVisible(false);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_tableTransactionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderStatusView(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRecieved;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableTransaction;
    private javax.swing.JTextArea textAddress;
    private javax.swing.JTextField textCostumerName;
    private javax.swing.JTextField textPhoneNumber;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textProductName;
    private javax.swing.JTextField textQty;
    private javax.swing.JTextField textTotalPayment;
    // End of variables declaration//GEN-END:variables
}
