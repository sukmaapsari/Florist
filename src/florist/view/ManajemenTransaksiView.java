package florist.view;

import florist.model.DetailTransaction;
import florist.model.Product;
import florist.model.Transaction;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManajemenTransaksiView extends javax.swing.JFrame {

    Transaction transaction = new Transaction();
    Product product = new Product();
    DetailTransaction detailTransaction = new DetailTransaction();
    DefaultTableModel tableModel = new DefaultTableModel();
    String evidence;
    public ManajemenTransaksiView() {
        initComponents();
        getAllDataTransaction();
        clean();
    }

    
    private void getAllDataTransaction(){
        transaction.getAllDataTransaction();
        tableModel = transaction.getTableModel();
        tableTransaction.setModel(tableModel);
        tableTransaction.setDefaultEditor(Object.class, null);
    }
    
    private void getAllDataTransactionByStatus(String status){
        transaction.setStatus(status);
        transaction.getAllDataTransactionByStatus();
        tableModel = transaction.getTableModel();
        tableTransaction.setModel(tableModel);
        tableTransaction.setDefaultEditor(Object.class, null);
    }
    
    private void clean(){
        textProductName.setText("-");
        textQty.setText("0");
        textPrice.setText("0");
        textCostumerName.setText("-");
        textGreetings.setText("-");
        textProductionDuration.setText("-");
        textPhoneNumber.setText("-");
        textAddress.setText("-");
        textTotalPayment.setText("0");
        textPaymentMethod.setText("-");
        textPaymentInstruction.setText("-");
        textStatus.setText("-");
        textNote.setText("-");
       
        buttonDeliver.setVisible(false);
        buttonCancel.setVisible(false);
        buttonDeliver.setVisible(false);
        buttonViewEvidence.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonProceced = new javax.swing.JButton();
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
        buttonCancel = new javax.swing.JButton();
        textTotalPayment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textProductionDuration = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransaction = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textNote = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textStatus = new javax.swing.JLabel();
        textPaymentMethod = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textPaymentInstruction = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        textGreetings = new javax.swing.JTextArea();
        buttonDeliver = new javax.swing.JButton();
        comboBoxStatus = new javax.swing.JComboBox<>();
        buttonSearch = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        buttonViewEvidence = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Transaction List");

        buttonProceced.setBackground(new java.awt.Color(255, 153, 153));
        buttonProceced.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonProceced.setText("Process");
        buttonProceced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcecedActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Product Name");

        textProductName.setEditable(false);
        textProductName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textProductName.setText("-");
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
        jLabel8.setText("Customer Name");

        textAddress.setEditable(false);
        textAddress.setColumns(20);
        textAddress.setRows(5);
        textAddress.setText("-");
        textAddress.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane2.setViewportView(textAddress);

        textCostumerName.setEditable(false);
        textCostumerName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textCostumerName.setText("-");
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
        textPhoneNumber.setText("-");
        textPhoneNumber.setToolTipText("");
        textPhoneNumber.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneNumberActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Customer Phone Number");

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
        textPrice.setText("0");
        textPrice.setToolTipText("");
        textPrice.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPriceActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Greetings Card");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setText("Production Duration");

        textProductionDuration.setEditable(false);
        textProductionDuration.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textProductionDuration.setText("-");
        textProductionDuration.setToolTipText("");
        textProductionDuration.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textProductionDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProductionDurationActionPerformed(evt);
            }
        });

        tableTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ORDER", "DATE", "PRODUCT", "QTY", "TOTAL PAYMENT", "PRODUCTION DURATION", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Details Transaction");

        textNote.setEditable(false);
        textNote.setColumns(20);
        textNote.setRows(5);
        textNote.setText("-");
        textNote.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane4.setViewportView(textNote);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Status Order:");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setText("Payment Method: ");

        textStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textStatus.setText("Status");

        textPaymentMethod.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textPaymentMethod.setText("Payment");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setText("Payment Instruction: ");

        textPaymentInstruction.setEditable(false);
        textPaymentInstruction.setColumns(20);
        textPaymentInstruction.setRows(5);
        textPaymentInstruction.setText("-");
        textPaymentInstruction.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane5.setViewportView(textPaymentInstruction);

        textGreetings.setEditable(false);
        textGreetings.setColumns(20);
        textGreetings.setRows(5);
        textGreetings.setText("-");
        textGreetings.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane6.setViewportView(textGreetings);

        buttonDeliver.setBackground(new java.awt.Color(255, 153, 153));
        buttonDeliver.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonDeliver.setText("Deliver");
        buttonDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeliverActionPerformed(evt);
            }
        });

        comboBoxStatus.setBackground(new java.awt.Color(255, 153, 153));
        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "ORDERED", "PROCECED", "DELIVERY", "SUCCESS", "CANCEL" }));

        buttonSearch.setBackground(new java.awt.Color(255, 153, 153));
        buttonSearch.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonSearch.setText("Serach");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setText("Cancel Reason:");

        buttonViewEvidence.setBackground(new java.awt.Color(255, 153, 153));
        buttonViewEvidence.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonViewEvidence.setText("View Evidence");
        buttonViewEvidence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewEvidenceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonProceced, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(textProductionDuration)
                            .addComponent(textPrice)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(jScrollPane6))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTotalPayment))
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2)
                            .addComponent(textPhoneNumber)
                            .addComponent(textCostumerName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addComponent(buttonViewEvidence)))
                    .addComponent(jScrollPane1))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxStatus)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(jLabel11)
                        .addGap(0, 201, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textProductionDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCostumerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(textPaymentMethod))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonViewEvidence, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(textStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonProceced, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProcecedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcecedActionPerformed

        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to proccess this product?", "Proccess Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.NO_OPTION){
            //Do nothing
        } else if (option == JOptionPane.YES_OPTION){
            int row = tableTransaction.getSelectedRow();
            int idTransaction = (int) tableModel.getValueAt(row, 0);
            String productName = String.valueOf(tableModel.getValueAt(row, 2));
            int qty= Integer.valueOf(textQty.getText());
            product.setName(productName);
            product.getProductByName();
            product.getProduct();
            int stock = product.getStock();
            int newStock = stock-qty;
            product.setStock(newStock);
            product.updateStockProduct();
            transaction.setId(idTransaction);
            transaction.setStatus("PROCECED");
            transaction.updateStatusTransaction();
            
            String status = String.valueOf(comboBoxStatus.getSelectedItem());
            switch (status) {
                case "ALL":
                    getAllDataTransaction();
                break;
                case "ORDERED":
                    getAllDataTransactionByStatus(status);
                break;
                case "PROCECED":
                    getAllDataTransactionByStatus(status);
                break;
                case "DELIVERY":
                    getAllDataTransactionByStatus(status);
                break;
                case "SUCCESS":
                    getAllDataTransactionByStatus(status);
                break;
                case "CANCEL":
                    getAllDataTransactionByStatus(status);
                break;
                default:
                break;
            }

            buttonDeliver.setVisible(false);
            buttonCancel.setVisible(false);
            textStatus.setText("PROCECED");
            clean();
        }
    }//GEN-LAST:event_buttonProcecedActionPerformed

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

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        int row = tableTransaction.getSelectedRow();
        int idTransaction = (int) tableModel.getValueAt(row, 0);
        AdminCancelOrderView cancelOrderView = new AdminCancelOrderView(idTransaction);
        cancelOrderView.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void textTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalPaymentActionPerformed

    private void textPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPriceActionPerformed

    private void textProductionDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductionDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductionDurationActionPerformed

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
        String greetings = detailTransaction.getGreetings();
        int productDuration = detailTransaction.getProductionDuration();
        String strProductDuration = String.valueOf(productDuration) + " Day";
        String costumer = detailTransaction.getCostumer();
        String phoneNumber = detailTransaction.getPhoneNumber();
        String address = detailTransaction.getAddress();
        int totalPayment = detailTransaction.getTotalPayment();
        String strTotalPayment = currency.format(totalPayment);
        String status = detailTransaction.getStatus();
        String note = detailTransaction.getNote();
        String paymentMethodCode = detailTransaction.getPaymentMethod();
        String paymentMethod;
        switch (paymentMethodCode) {
            case "TRF":
                evidence = detailTransaction.getEvidence();
                paymentMethod = "TRANSFER";
                switch (status) {
                    case "ORDERED":
                        if (evidence.equals("-")){
                            buttonProceced.setVisible(false);
                            buttonViewEvidence.setVisible(false);
                                textPaymentInstruction.setText("Transaction has been register.\n" +
                                    "To complate the transaction please Transfer To\n" +
                                    "Rek: 088888888 AN: NI KT CATUR ADI SUKMA APSARI\n" +
                                    "and upload evidence at button Upload Evidence below\n");
                        }else {
                            buttonProceced.setVisible(true);
                            buttonViewEvidence.setVisible(true);
                                textPaymentInstruction.setText("Transfer evidence has been uploaded.\n" +
                                    "Wait admin accept and proccess your order\n");
                        }
                        break;
                    case "CANCEL":
                        buttonViewEvidence.setVisible(false);
                        textPaymentInstruction.setText("TRANSACTION HAS BEEN CANCEL");
                        break;
                    default:
                        if (evidence.equals("-")){
                            buttonViewEvidence.setVisible(false);
                        }else {
                            buttonViewEvidence.setVisible(true);
                        }
                        textPaymentInstruction.setText("PAYMENT HAS BEEN COMPLETE");
                        break;
                }
            break;
            case "COD":
                paymentMethod = "CASH ON DELIVERY";
                switch (status) {
                    case "ORDERED":
                        buttonProceced.setVisible(true);
                        buttonViewEvidence.setVisible(false);
                        textPaymentInstruction.setText("Transaction has been register.\n" +
                            "To complate the transaction please preprare money when \n" +
                            "the courier arrives");
                        break;
                    case "SUCCESS":
                        buttonViewEvidence.setVisible(false);
                        textPaymentInstruction.setText("PAYMENT HAS BEEN COMPLETE");
                        break;
                    case "CANCEL":
                        buttonViewEvidence.setVisible(false);
                        textPaymentInstruction.setText("TRANSACTION HAS BEEN CANCEL");
                        break;
                    default:
                        buttonViewEvidence.setVisible(false);
                        textPaymentInstruction.setText("Transaction has been register.\n" +
                            "To complate the transaction please preprare money when \n" +
                            "the courier arrives");
                        break;
                }
            break;
            default:
            paymentMethod = "";
            break;
        }

        textProductName.setText(product);
        textQty.setText(strQty);
        textPrice.setText(strPrice);
        textGreetings.setText(greetings);
        textProductionDuration.setText(strProductDuration);
        textCostumerName.setText(costumer);
        textPhoneNumber.setText(phoneNumber);
        textAddress.setText(address);
        textTotalPayment.setText(strTotalPayment);
        textPaymentMethod.setText(paymentMethod);
        textStatus.setText(status);
        textNote.setText(note);

        switch (status) {
            case "ORDERED":
            buttonDeliver.setVisible(false);
            buttonCancel.setVisible(true);
            break;
            case "PROCECED":
            buttonProceced.setVisible(false);
            buttonDeliver.setVisible(true);
            buttonCancel.setVisible(false);
            break;
            case "DELIVERY":
            buttonProceced.setVisible(false);
            buttonDeliver.setVisible(false);
            buttonCancel.setVisible(false);
            break;
            case "SUCCESS":
            buttonProceced.setVisible(false);
            buttonDeliver.setVisible(false);
            buttonCancel.setVisible(false);
            break;
            case "CANCEL":
            buttonProceced.setVisible(false);
            buttonDeliver.setVisible(false);
            buttonCancel.setVisible(false);
            break;
            default:
            break;
        }
    }//GEN-LAST:event_tableTransactionMouseClicked

    private void buttonDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeliverActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to deliver this product?", "Deliver Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.NO_OPTION){
            //Do nothing
        } else if (option == JOptionPane.YES_OPTION){
            int row = tableTransaction.getSelectedRow();
            int idTransaction = (int) tableModel.getValueAt(row, 0);
            transaction.setId(idTransaction);
            transaction.setStatus("DELIVERY");
            transaction.updateStatusTransaction();
            
            String status = String.valueOf(comboBoxStatus.getSelectedItem());
            switch (status) {
                case "ALL":
                    getAllDataTransaction();
                break;
                case "ORDERED":
                    getAllDataTransactionByStatus(status);
                break;
                case "PROCECED":
                    getAllDataTransactionByStatus(status);
                break;
                case "DELIVERY":
                    getAllDataTransactionByStatus(status);
                break;
                case "SUCCESS":
                    getAllDataTransactionByStatus(status);
                break;
                case "CANCEL":
                    getAllDataTransactionByStatus(status);
                break;
                default:
                break;
            }

            buttonDeliver.setVisible(false);
            buttonCancel.setVisible(false);
            textStatus.setText("DELIVERY");
            clean();
        }
    }//GEN-LAST:event_buttonDeliverActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String status = String.valueOf(comboBoxStatus.getSelectedItem());
        clean();
        
        switch (status) {
            case "ALL":
                getAllDataTransaction();
            break;
            case "ORDERED":
                getAllDataTransactionByStatus(status);
            break;
            case "PROCECED":
                getAllDataTransactionByStatus(status);
            break;
            case "DELIVERY":
                getAllDataTransactionByStatus(status);
            break;
            case "SUCCESS":
                getAllDataTransactionByStatus(status);
            break;
            case "CANCEL":
                getAllDataTransactionByStatus(status);
            break;
            default:
            break;
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonViewEvidenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewEvidenceActionPerformed
        int row = tableTransaction.getSelectedRow();
        int idTransaction = (int) tableModel.getValueAt(row, 0);
        EvidenceTransferView evidenceTransferView = new EvidenceTransferView(idTransaction,evidence);
        evidenceTransferView.setVisible(true);
    }//GEN-LAST:event_buttonViewEvidenceActionPerformed

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
            java.util.logging.Logger.getLogger(ManajemenTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajemenTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajemenTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajemenTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajemenTransaksiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonDeliver;
    private javax.swing.JButton buttonProceced;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonViewEvidence;
    private javax.swing.JComboBox<String> comboBoxStatus;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tableTransaction;
    private javax.swing.JTextArea textAddress;
    private javax.swing.JTextField textCostumerName;
    private javax.swing.JTextArea textGreetings;
    private javax.swing.JTextArea textNote;
    private javax.swing.JTextArea textPaymentInstruction;
    private javax.swing.JLabel textPaymentMethod;
    private javax.swing.JTextField textPhoneNumber;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textProductName;
    private javax.swing.JTextField textProductionDuration;
    private javax.swing.JTextField textQty;
    private javax.swing.JLabel textStatus;
    private javax.swing.JTextField textTotalPayment;
    // End of variables declaration//GEN-END:variables
}
