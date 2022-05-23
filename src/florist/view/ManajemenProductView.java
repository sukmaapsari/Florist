package florist.view;

import florist.model.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManajemenProductView extends javax.swing.JFrame {

    Product product = new Product();
    DefaultTableModel tableModel = new DefaultTableModel();
    
    public ManajemenProductView() {
        initComponents();
        getAllDataProduct();
        getAllDataCategory();
        clean();
    }

    private void getAllDataProduct(){
        product.getAllDataProduct();
        tableModel = product.getTableModel();
        tableProduct.setModel(tableModel);
        tableProduct.setDefaultEditor(Object.class, null);
    }
    
    private void getAllDataCategory(){
        ArrayList<String> listCategory = new ArrayList<>();
        listCategory = product.getListCategory();
        product.getListCategory();
        tableModel = product.getTableModel();
        tableProduct.setModel(tableModel);
        tableProduct.setDefaultEditor(Object.class, null);
        
        listCategory.forEach((category) ->
            comboBoxCategory.addItem(category)
        );
    }
    
    private void clean(){
        textProductName.setText("-");
        textStock.setText("0");
        textPrice.setText("0");
        textProductionDuration.setText("0");
        buttonUpdate.setVisible(false);
        buttonAddProduct.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textProductName = new javax.swing.JTextField();
        textStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        buttonUpdate = new javax.swing.JButton();
        buttonAddProduct = new javax.swing.JButton();
        comboBoxCategory = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        textProductionDuration = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Product List");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Product Name");

        textProductName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textProductName.setText("Product Name");
        textProductName.setToolTipText("");
        textProductName.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProductNameActionPerformed(evt);
            }
        });

        textStock.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textStock.setText("0");
        textStock.setToolTipText("");
        textStock.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStockActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Stock");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Price");

        textPrice.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textPrice.setText("0");
        textPrice.setToolTipText("");
        textPrice.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPriceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Product Details");

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCT", "CATEGORY", "PRICE", "STOCK", "PRODUCTION (DAY)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);
        if (tableProduct.getColumnModel().getColumnCount() > 0) {
            tableProduct.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableProduct.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableProduct.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        buttonUpdate.setBackground(new java.awt.Color(255, 153, 153));
        buttonUpdate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonUpdate.setText("Update Product");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonAddProduct.setBackground(new java.awt.Color(255, 153, 153));
        buttonAddProduct.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonAddProduct.setText("Add Product");
        buttonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddProductActionPerformed(evt);
            }
        });

        comboBoxCategory.setBackground(new java.awt.Color(255, 153, 153));
        comboBoxCategory.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        comboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Category");

        textProductionDuration.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textProductionDuration.setText("0");
        textProductionDuration.setToolTipText("");
        textProductionDuration.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textProductionDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProductionDurationActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Production Duration (Day) ");

        buttonDelete.setBackground(new java.awt.Color(255, 153, 153));
        buttonDelete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonDelete.setText("Delete Product");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonReset.setBackground(new java.awt.Color(255, 153, 153));
        buttonReset.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textPrice)
                                        .addComponent(textProductionDuration)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(buttonAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(buttonUpdate)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel15))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(82, 82, 82)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textProductionDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddProductActionPerformed

        if(textStock.getText().matches("[0-9]+") == false){
            JOptionPane.showMessageDialog(rootPane,"Stock must be number");
            textStock.requestFocus();
        } else if (textProductName.getText().equals("-")){
            JOptionPane.showMessageDialog(rootPane,"Product name must be filled");
            textPrice.requestFocus();
        }else if (textPrice.getText().matches("[0-9]+") == false){
            JOptionPane.showMessageDialog(rootPane,"Price must be number");
            textPrice.requestFocus();
        } else if (comboBoxCategory.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane,"Please Select Category");
            comboBoxCategory.requestFocus();
        }else if (comboBoxCategory.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane,"Please Select Category");
        }else {
            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to add this product?", "Add Product Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.NO_OPTION){
                //Do nothing
            } else if (option == JOptionPane.YES_OPTION){
                String name = textProductName.getText();
                int category = comboBoxCategory.getSelectedIndex();
                int price = Integer.valueOf(textPrice.getText());
                int stock = Integer.valueOf(textStock.getText());
                int production_duration = Integer.valueOf(textProductionDuration.getText());
                
                if (stock <= 0) {
                    JOptionPane.showMessageDialog(rootPane,"Please add stock");
                } else if (price <= 0) {
                    JOptionPane.showMessageDialog(rootPane,"Please add price");
                } else if (production_duration <= 0){
                    JOptionPane.showMessageDialog(rootPane,"Please add production duration");
                } else {
                    product.setName(name);
                    product.getProductByName();
                    int availableId = product.getId();
                    if(availableId <= 0) {
                        product.setName(name);
                        product.setCategory(category);
                        product.setPrice(price);
                        product.setStock(stock);
                        product.setProductionDuration(production_duration);
                        product.addProduct();
                        clean();
                        getAllDataProduct();
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"Product already exists");
                    }
                }   
            }
        }
    }//GEN-LAST:event_buttonAddProductActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        if(textStock.getText().matches("[0-9]+") == false){
            JOptionPane.showMessageDialog(rootPane,"Stock must be number");
            textStock.requestFocus();
        } else if (textPrice.getText().matches("[0-9]+") == false){
            JOptionPane.showMessageDialog(rootPane,"Price must be number");
            textPrice.requestFocus();
        } else if (comboBoxCategory.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane,"Please Select Category");
            comboBoxCategory.requestFocus();
        }else if (comboBoxCategory.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane,"Please Select Category");
        }else {
            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to update this product?", "Update Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.NO_OPTION){
                //Do nothing
            } else if (option == JOptionPane.YES_OPTION){
                int row = tableProduct.getSelectedRow();
                int idProduct = (int) tableModel.getValueAt(row, 0);
                String name = textProductName.getText();
                int category = comboBoxCategory.getSelectedIndex();
                int price = Integer.valueOf(textPrice.getText());
                int stock = Integer.valueOf(textStock.getText());
                int productionDuration = Integer.valueOf(textProductionDuration.getText());
                
                if (stock <= 0) {
                    JOptionPane.showMessageDialog(rootPane,"Please add stock");
                } else if (price <= 0) {
                    JOptionPane.showMessageDialog(rootPane,"Please add price");
                } else if (productionDuration <= 0){
                    JOptionPane.showMessageDialog(rootPane,"Please add production duration");
                } else {
                    product.setId(idProduct);
                    product.setName(name);
                    product.setCategory(category);
                    product.setPrice(price);
                    product.setStock(stock);
                    product.setProductionDuration(productionDuration);
                    product.updateProduct();
                    clean();
                    getAllDataProduct();
                }   
            }
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        int row = tableProduct.getSelectedRow();
        int idProduct = (int) tableModel.getValueAt(row, 0);
        String categoryProduct = (String) tableModel.getValueAt(row, 2);
        product.setId(idProduct);
        product.getProduct();

        String productName = product.getName();
        int stock = product.getStock();
        String strStock = String.valueOf(stock);
        int price = product.getPrice();
        String strPrice = String.valueOf(price);
        int productionDuration = product.getProductionDuration();
        String strProductionDuration = String.valueOf(productionDuration);

        textProductName.setText(productName);
        textStock.setText(strStock);
        textPrice.setText(strPrice);
        comboBoxCategory.setSelectedItem(categoryProduct);
        textProductionDuration.setText(strProductionDuration);
        buttonUpdate.setVisible(true);
        
        buttonAddProduct.setVisible(false);
    }//GEN-LAST:event_tableProductMouseClicked

    private void textPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPriceActionPerformed

    private void textStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStockActionPerformed

    private void textProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductNameActionPerformed

    private void textProductionDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductionDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductionDurationActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to delete this product?", "Delete Product Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.NO_OPTION){
            //Do nothing
        } else if (option == JOptionPane.YES_OPTION){
            int row = tableProduct.getSelectedRow();
            int idProduct = (int) tableModel.getValueAt(row, 0);
            product.setId(idProduct);
            product.deleteProduct();
            clean();
            getAllDataProduct();
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        clean();
    }//GEN-LAST:event_buttonResetActionPerformed

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
            java.util.logging.Logger.getLogger(ManajemenProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajemenProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajemenProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajemenProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajemenProductView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddProduct;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textProductName;
    private javax.swing.JTextField textProductionDuration;
    private javax.swing.JTextField textStock;
    // End of variables declaration//GEN-END:variables
}
