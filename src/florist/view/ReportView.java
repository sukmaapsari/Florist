package florist.view;

import florist.model.Report;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class ReportView extends javax.swing.JFrame {

    Report report = new Report();
    DefaultTableModel tableModel = new DefaultTableModel();
    public ReportView() {
        initComponents();
        getTableDataTransaction();
        report.setSuccessTransactionReport();
        report.setCancelTransactionReport();
        report.setOrderTransactionReport();
        report.setDeliveryTransactionReport();
        report.setIncome();
        String successReport = String.valueOf(report.getSuccessTransactionReport());
        String cancelReport = String.valueOf(report.getCancelTransactionReport());
        String orderReport = String.valueOf(report.getOrderTransactionReport());
        String deliveryReport = String.valueOf(report.getDeliveryTransactionReport());
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        String incomeReport = currency.format(report.getIncomeReport());
        
        textSuccessReport.setText(successReport);
        textCancelReport.setText(cancelReport);
        textOrderReport.setText(orderReport);
        textDeliveryReport.setText(deliveryReport);
        textIncomeReport.setText(incomeReport);
    }

    private void getTableDataTransaction(){
        report.getAllDataTransaction();
        tableModel = report.getTableModel();
        tableTransaction.setModel(tableModel);
        tableTransaction.setDefaultEditor(Object.class, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        textIncomeReport = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textSuccessReport = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textDeliveryReport = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textOrderReport = new javax.swing.JTextField();
        textCancelReport = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Report List");

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
        jLabel2.setText("Transaction Details");

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

        textIncomeReport.setEditable(false);
        textIncomeReport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textIncomeReport.setText("0");
        textIncomeReport.setToolTipText("");
        textIncomeReport.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textIncomeReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIncomeReportActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("INCOME");

        textSuccessReport.setEditable(false);
        textSuccessReport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textSuccessReport.setText("0");
        textSuccessReport.setToolTipText("");
        textSuccessReport.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textSuccessReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSuccessReportActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("SUCCESS");

        textDeliveryReport.setEditable(false);
        textDeliveryReport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textDeliveryReport.setText("0");
        textDeliveryReport.setToolTipText("");
        textDeliveryReport.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textDeliveryReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDeliveryReportActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setText("ON DELIVERY");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setText("ON ORDER");

        textOrderReport.setEditable(false);
        textOrderReport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textOrderReport.setText("0");
        textOrderReport.setToolTipText("");
        textOrderReport.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textOrderReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOrderReportActionPerformed(evt);
            }
        });

        textCancelReport.setEditable(false);
        textCancelReport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textCancelReport.setText("0");
        textCancelReport.setToolTipText("");
        textCancelReport.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textCancelReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCancelReportActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setText("CANCEL");

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
                                    .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(textTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(388, 388, 388)
                                    .addComponent(jLabel14)
                                    .addGap(10, 10, 10)
                                    .addComponent(textIncomeReport, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textCancelReport)
                                    .addComponent(textOrderReport, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textSuccessReport, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(textDeliveryReport))))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(501, 501, 501))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(textDeliveryReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16)
                                            .addComponent(textOrderReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(textSuccessReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel15)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(textCancelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel18))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(textIncomeReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))))
                .addGap(122, 122, 122))
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

    private void textProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductNameActionPerformed

    private void textCostumerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCostumerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCostumerNameActionPerformed

    private void textQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtyActionPerformed

    private void textPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneNumberActionPerformed

    private void textTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalPaymentActionPerformed

    private void textPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPriceActionPerformed

    private void tableTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTransactionMouseClicked
        int row = tableTransaction.getSelectedRow();
        int idTransaction = (int) tableModel.getValueAt(row, 0);
        report.setId(idTransaction);
        report.getDetailTransaction();

        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

        String product = report.getProduct();
        int qty = report.getQty();
        String strQty = String.valueOf(qty);
        int price = report.getPrice();
        String strPrice = currency.format(price);
        String costumer = report.getCostumer();
        String phoneNumber = report.getPhoneNumber();
        String address = report.getAddress();
        int totalPayment = report.getTotalPayment();
        String strTotalPayment = currency.format(totalPayment);

        textProductName.setText(product);
        textQty.setText(strQty);
        textPrice.setText(strPrice);
        textCostumerName.setText(costumer);
        textPhoneNumber.setText(phoneNumber);
        textAddress.setText(address);
        textTotalPayment.setText(strTotalPayment);
    }//GEN-LAST:event_tableTransactionMouseClicked

    private void textIncomeReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIncomeReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIncomeReportActionPerformed

    private void textSuccessReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSuccessReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSuccessReportActionPerformed

    private void textDeliveryReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDeliveryReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDeliveryReportActionPerformed

    private void textOrderReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOrderReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textOrderReportActionPerformed

    private void textCancelReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCancelReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCancelReportActionPerformed

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
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField textCancelReport;
    private javax.swing.JTextField textCostumerName;
    private javax.swing.JTextField textDeliveryReport;
    private javax.swing.JTextField textIncomeReport;
    private javax.swing.JTextField textOrderReport;
    private javax.swing.JTextField textPhoneNumber;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textProductName;
    private javax.swing.JTextField textQty;
    private javax.swing.JTextField textSuccessReport;
    private javax.swing.JTextField textTotalPayment;
    // End of variables declaration//GEN-END:variables
}
