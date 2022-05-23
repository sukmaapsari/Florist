package florist.view;

import florist.model.Product;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class DashboardView extends javax.swing.JFrame {

    Product product = new Product();
    int currentUserId;
    
    public DashboardView(int id) {
        initComponents();
        currentUserId = id;
        getProduct1();
        getProduct2();
        getProduct3();
    }
    
    private void getProduct1(){
        int id = 1;
        product.setId(id);
        product.getProduct();
        
        String productName = product.getName();
        String stock = String.valueOf(product.getStock());
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        String price = currency.format(product.getPrice());
        productName1.setText(productName);
        productPrice1.setText(price);
        productStock1.setText(stock);   
    }
    
    private void getProduct2(){
        int id = 2;
        product.setId(id);
        product.getProduct();
        
        String productName = product.getName();
        String stock = String.valueOf(product.getStock());
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        String price = currency.format(product.getPrice());
        productName2.setText(productName);
        productPrice2.setText(price);
        productStock2.setText(stock);
    }
    
    private void getProduct3(){
        int id = 3;
        product.setId(id);
        product.getProduct();
        
        String productName = product.getName();
        String stock = String.valueOf(product.getStock());
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        String price = currency.format(product.getPrice());
        productName3.setText(productName);
        productPrice3.setText(price);
        productStock3.setText(stock);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonSignOut = new javax.swing.JButton();
        buttonOrderStatus = new javax.swing.JButton();
        lilyPanel = new javax.swing.JPanel();
        productName3 = new javax.swing.JLabel();
        productPrice3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productStock3 = new javax.swing.JLabel();
        sunPanel = new javax.swing.JPanel();
        productName2 = new javax.swing.JLabel();
        productPrice2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        productStock2 = new javax.swing.JLabel();
        rosePanel = new javax.swing.JPanel();
        productName1 = new javax.swing.JLabel();
        productPrice1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productStock1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        buttonSignOut.setBackground(new java.awt.Color(255, 51, 51));
        buttonSignOut.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonSignOut.setText("Sign Out");
        buttonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignOutActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSignOut);
        buttonSignOut.setBounds(510, 500, 130, 30);

        buttonOrderStatus.setBackground(new java.awt.Color(51, 204, 0));
        buttonOrderStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonOrderStatus.setText("Order Status");
        buttonOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrderStatusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonOrderStatus);
        buttonOrderStatus.setBounds(650, 500, 130, 30);

        lilyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lilyPanelMouseClicked(evt);
            }
        });

        productName3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        productName3.setText("Name Bouqet");

        productPrice3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productPrice3.setText("Rp.99.999");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/florist/resource/liliy-01.png"))); // NOI18N

        productStock3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        productStock3.setText("stock");

        javax.swing.GroupLayout lilyPanelLayout = new javax.swing.GroupLayout(lilyPanel);
        lilyPanel.setLayout(lilyPanelLayout);
        lilyPanelLayout.setHorizontalGroup(
            lilyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lilyPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(lilyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productName3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGroup(lilyPanelLayout.createSequentialGroup()
                        .addComponent(productPrice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productStock3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lilyPanelLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        lilyPanelLayout.setVerticalGroup(
            lilyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lilyPanelLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lilyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productStock3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(lilyPanel);
        lilyPanel.setBounds(760, 180, 200, 280);

        sunPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sunPanelMouseClicked(evt);
            }
        });

        productName2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        productName2.setText("Name Bouqet");

        productPrice2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productPrice2.setText("Rp.99.999");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/florist/resource/sun-01-01-01-01.png"))); // NOI18N

        productStock2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        productStock2.setText("stock");

        javax.swing.GroupLayout sunPanelLayout = new javax.swing.GroupLayout(sunPanel);
        sunPanel.setLayout(sunPanelLayout);
        sunPanelLayout.setHorizontalGroup(
            sunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sunPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(sunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productName2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGroup(sunPanelLayout.createSequentialGroup()
                        .addComponent(productPrice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productStock2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sunPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sunPanelLayout.setVerticalGroup(
            sunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sunPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productStock2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(sunPanel);
        sunPanel.setBounds(540, 180, 200, 280);

        rosePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rosePanelMouseClicked(evt);
            }
        });

        productName1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        productName1.setText("Name Bouqet");

        productPrice1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productPrice1.setText("Rp.99.999");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/florist/resource/mawar-01.png"))); // NOI18N

        productStock1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        productStock1.setText("stock");

        javax.swing.GroupLayout rosePanelLayout = new javax.swing.GroupLayout(rosePanel);
        rosePanel.setLayout(rosePanelLayout);
        rosePanelLayout.setHorizontalGroup(
            rosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rosePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(rosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productName1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGroup(rosePanelLayout.createSequentialGroup()
                        .addComponent(productPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productStock1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rosePanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rosePanelLayout.setVerticalGroup(
            rosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rosePanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productStock1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(rosePanel);
        rosePanel.setBounds(320, 180, 200, 280);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel5.setText("FLORIST");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 80, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/florist/resource/backgrounddashboard.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Rose Bouqet");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 470, 202, 24);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("Rp.99.999");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(330, 490, 140, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignOutActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to sign out?", "Sign Out", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.NO_OPTION){
            //Do nothing
        } else if (option == JOptionPane.YES_OPTION){
            SignInView loginView = new SignInView();
            loginView.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_buttonSignOutActionPerformed

    private void buttonOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrderStatusActionPerformed
        OrderStatusView orderStatusView = new OrderStatusView(currentUserId);
        orderStatusView.setVisible(true);
    }//GEN-LAST:event_buttonOrderStatusActionPerformed

    private void rosePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rosePanelMouseClicked
        DetailPembelian detailPembelian = new DetailPembelian(currentUserId, 1);
        detailPembelian.setVisible(true);
    }//GEN-LAST:event_rosePanelMouseClicked

    private void sunPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunPanelMouseClicked
        DetailPembelian detailPembelian = new DetailPembelian(currentUserId, 2);
        detailPembelian.setVisible(true);
    }//GEN-LAST:event_sunPanelMouseClicked

    private void lilyPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lilyPanelMouseClicked
        DetailPembelian detailPembelian = new DetailPembelian(currentUserId, 3);
        detailPembelian.setVisible(true);
    }//GEN-LAST:event_lilyPanelMouseClicked

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
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOrderStatus;
    private javax.swing.JButton buttonSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lilyPanel;
    private javax.swing.JLabel productName1;
    private javax.swing.JLabel productName2;
    private javax.swing.JLabel productName3;
    private javax.swing.JLabel productPrice1;
    private javax.swing.JLabel productPrice2;
    private javax.swing.JLabel productPrice3;
    private javax.swing.JLabel productStock1;
    private javax.swing.JLabel productStock2;
    private javax.swing.JLabel productStock3;
    private javax.swing.JPanel rosePanel;
    private javax.swing.JPanel sunPanel;
    // End of variables declaration//GEN-END:variables
}
