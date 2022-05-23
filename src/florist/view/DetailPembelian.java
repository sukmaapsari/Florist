package florist.view;

import florist.model.Product;
import florist.model.Transaction;
import florist.model.User;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;


public class DetailPembelian extends javax.swing.JFrame {

    User user = new User();
    Product product = new Product();
    Transaction transaction = new Transaction();
    
    int currentUserId;
    int productId;
    int price = 0;
    int qty = 0;
    int totalPayment = 0;
    int stock;
    
    public DetailPembelian(int currentUserId, int productId) {
        initComponents();
        this.currentUserId = currentUserId;
        this.productId = productId;
        
        getCurrentUserData();
        getProductData();
    }
    
    private void getCurrentUserData(){
        user.setId(currentUserId);
        user.getDataUserById();
        
        String name = user.getName();
        String address = user.getAddress();
        String phoneNumber = user.getPhoneNumber();
        
        textCostummerName.setText(name);
        textPhoneNumber.setText(phoneNumber);
        textAddress.setText(address);
    }
    
    private void getProductData(){
        product.setId(productId);
        product.getProduct();
        
        String name = product.getName();
        price = product.getPrice();
        stock = product.getStock();
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        String strPrice = currency.format(price);
        
        textProductName.setText(name);
        textPrice.setText(strPrice);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonBuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textProductName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAddress = new javax.swing.JTextArea();
        textCostummerName = new javax.swing.JTextField();
        textQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textPhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        textTotalPayment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        buttonPlus = new javax.swing.JButton();
        buttonMin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Payment Details");

        buttonBuy.setBackground(new java.awt.Color(255, 153, 153));
        buttonBuy.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonBuy.setText("Buy");
        buttonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Product Name");

        textProductName.setEditable(false);
        textProductName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textProductName.setText("Item Name");
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

        textCostummerName.setEditable(false);
        textCostummerName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textCostummerName.setText("Name");
        textCostummerName.setToolTipText("");
        textCostummerName.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textCostummerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCostummerNameActionPerformed(evt);
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

        buttonCancel.setBackground(new java.awt.Color(255, 153, 153));
        buttonCancel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

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

        buttonPlus.setBackground(new java.awt.Color(255, 153, 153));
        buttonPlus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonPlus.setText("+");
        buttonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlusActionPerformed(evt);
            }
        });

        buttonMin.setBackground(new java.awt.Color(255, 153, 153));
        buttonMin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonMin.setText("-");
        buttonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(textPrice)
                            .addComponent(textCostummerName)
                            .addComponent(textPhoneNumber)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(10, 10, 10)
                                        .addComponent(textTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCostummerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuyActionPerformed
        if (qty <= 0){
            JOptionPane.showMessageDialog(rootPane, "Minimal Order 1");
        } else {
            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to order this product?", "Order Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.NO_OPTION){
                //Do nothing
            } else if (option == JOptionPane.YES_OPTION){
                String address = textAddress.getText();
                transaction.setProduct(productId);
                transaction.setCostumer(currentUserId);
                transaction.setPrice(price);
                transaction.setQty(qty);
                transaction.setTotalPayment(totalPayment);
                transaction.setAddress(address);
                transaction.addDataTransaction();
                dispose(); 
            }
        }
        
    }//GEN-LAST:event_buttonBuyActionPerformed

    private void textProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductNameActionPerformed

    private void textCostummerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCostummerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCostummerNameActionPerformed

    private void textQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtyActionPerformed

    private void textPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneNumberActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void textTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalPaymentActionPerformed

    private void textPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPriceActionPerformed

    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        if (qty > 0){
            qty = qty-1;
            totalPayment = qty*price;
            String strQty = String.valueOf(qty);
            NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
            String strTotalPayment = currency.format(totalPayment);
        
            textQty.setText(strQty);
            textTotalPayment.setText(strTotalPayment);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Minimal Order 1");
        }
    }//GEN-LAST:event_buttonMinActionPerformed

    private void buttonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlusActionPerformed
        if (qty <= stock){
            qty = qty+1;
            totalPayment = qty*price;
            String strQty = String.valueOf(qty);
            NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
            String strTotalPayment = currency.format(totalPayment);
        
            textQty.setText(strQty);
            textTotalPayment.setText(strTotalPayment);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Out of stock");
        }
    }//GEN-LAST:event_buttonPlusActionPerformed

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
            java.util.logging.Logger.getLogger(DetailPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailPembelian(0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuy;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAddress;
    private javax.swing.JTextField textCostummerName;
    private javax.swing.JTextField textPhoneNumber;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textProductName;
    private javax.swing.JTextField textQty;
    private javax.swing.JTextField textTotalPayment;
    // End of variables declaration//GEN-END:variables
}
