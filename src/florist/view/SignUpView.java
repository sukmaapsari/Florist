package florist.view;

import florist.model.User;
import java.awt.Color;
import javax.swing.JOptionPane;

public class SignUpView extends javax.swing.JFrame {

    User user = new User();
    
    public SignUpView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        buttonSignUp = new javax.swing.JButton();
        textConfirmPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAddress = new javax.swing.JTextArea();
        textPhoneNumber = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(450, 750));
        setPreferredSize(new java.awt.Dimension(450, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 750));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Username");

        textUsername.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textUsername.setForeground(new java.awt.Color(153, 153, 153));
        textUsername.setText("Username");
        textUsername.setToolTipText("");
        textUsername.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textUsernameFocusLost(evt);
            }
        });
        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        textPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textPassword.setForeground(new java.awt.Color(153, 153, 153));
        textPassword.setText("Password");
        textPassword.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textPassword.setName(""); // NOI18N
        textPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textPasswordFocusLost(evt);
            }
        });

        buttonSignUp.setBackground(new java.awt.Color(255, 153, 153));
        buttonSignUp.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonSignUp.setText("Sign Up");
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });

        textConfirmPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textConfirmPassword.setForeground(new java.awt.Color(153, 153, 153));
        textConfirmPassword.setText("Password");
        textConfirmPassword.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textConfirmPassword.setName(""); // NOI18N
        textConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textConfirmPasswordFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Confirm Password");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Name");

        textName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textName.setForeground(new java.awt.Color(153, 153, 153));
        textName.setText("Name");
        textName.setToolTipText("");
        textName.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNameFocusLost(evt);
            }
        });
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Phone Number");

        textAddress.setColumns(20);
        textAddress.setForeground(new java.awt.Color(153, 153, 153));
        textAddress.setRows(5);
        textAddress.setText("Address");
        textAddress.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textAddressFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(textAddress);

        textPhoneNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textPhoneNumber.setForeground(new java.awt.Color(153, 153, 153));
        textPhoneNumber.setText("Phone number");
        textPhoneNumber.setToolTipText("");
        textPhoneNumber.setMargin(new java.awt.Insets(8, 8, 8, 8));
        textPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textPhoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textPhoneNumberFocusLost(evt);
            }
        });
        textPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneNumberActionPerformed(evt);
            }
        });

        buttonCancel.setBackground(new java.awt.Color(255, 153, 153));
        buttonCancel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(textName)
                        .addComponent(jLabel3)
                        .addComponent(textUsername)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4)
                        .addComponent(textPassword)
                        .addComponent(jLabel5)
                        .addComponent(textConfirmPassword)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsernameActionPerformed

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        String name = textName.getText();
        String username = textUsername.getText();
        String phoneNumber = textPhoneNumber.getText();
        String address = textAddress.getText();
        String password = textPassword.getText();
        String confirmPassword = textConfirmPassword.getText();
        
        if (name.isEmpty() || name.trim().toLowerCase().equals("name")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the name field");
            textName.requestFocus();
        } else if (username.isEmpty() || username.trim().toLowerCase().equals("username")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the username field");
            textUsername.requestFocus();
        }else if (phoneNumber.isEmpty() || phoneNumber.trim().toLowerCase().equals("phone number")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the phone number field");
            textPhoneNumber.requestFocus();
        }else if (address.isEmpty() || address.trim().toLowerCase().equals("address")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the address field");
            textAddress.requestFocus();
        }else if (password.isEmpty() || password.trim().toLowerCase().equals("password")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the password field");
            textPassword.requestFocus();
        }else if (confirmPassword.isEmpty() || confirmPassword.trim().toLowerCase().equals("password")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the confirm password field");
            textConfirmPassword.requestFocus();
        }else if (!(confirmPassword.equals(password))){
            JOptionPane.showMessageDialog(rootPane, "Confirm password is different from password");
            textConfirmPassword.requestFocus();
        } else {
            user.setName(name);
            user.setUsername(username);
            user.setPhoneNumber(phoneNumber);
            user.setAddress(address);
            user.setPassword(password);
            user.signUp();
            dispose();
        }
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void textPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneNumberActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
       dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void textNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNameFocusGained
        if (textName.getText().trim().toLowerCase().equals("name")){
            textName.setText("");
            textName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textNameFocusGained

    private void textNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNameFocusLost
        if (textName.getText().isEmpty() || textName.getText().trim().toLowerCase().equals("name")){
            textName.setText("Name");
            textName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_textNameFocusLost

    private void textUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUsernameFocusGained
        if (textUsername.getText().trim().toLowerCase().equals("username")){
            textUsername.setText("");
            textUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textUsernameFocusGained

    private void textUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUsernameFocusLost
        if (textUsername.getText().isEmpty() || textUsername.getText().trim().toLowerCase().equals("username")){
            textUsername.setText("Username");
            textUsername.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_textUsernameFocusLost

    private void textPhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPhoneNumberFocusGained
        if (textPhoneNumber.getText().trim().toLowerCase().equals("phone number")){
            textPhoneNumber.setText("");
            textPhoneNumber.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textPhoneNumberFocusGained

    private void textPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPhoneNumberFocusLost
        if (textPhoneNumber.getText().isEmpty() || textPhoneNumber.getText().trim().toLowerCase().equals("phone number")){
            textPhoneNumber.setText("Phone Number");
            textPhoneNumber.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_textPhoneNumberFocusLost

    private void textAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAddressFocusGained
        if (textAddress.getText().trim().toLowerCase().equals("address")){
            textAddress.setText("");
            textAddress.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textAddressFocusGained

    private void textAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAddressFocusLost
        if (textAddress.getText().isEmpty() || textAddress.getText().trim().toLowerCase().equals("address")){
            textAddress.setText("Address");
            textAddress.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_textAddressFocusLost

    private void textPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPasswordFocusGained
        if (textPassword.getText().trim().toLowerCase().equals("password")){
            textPassword.setText("");
            textPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textPasswordFocusGained

    private void textPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPasswordFocusLost
        if (textPassword.getText().isEmpty() || textPassword.getText().trim().toLowerCase().equals("password")){
            textPassword.setText("Password");
            textPassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_textPasswordFocusLost

    private void textConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textConfirmPasswordFocusGained
        if (textConfirmPassword.getText().trim().toLowerCase().equals("password")){
            textConfirmPassword.setText("");
            textConfirmPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textConfirmPasswordFocusGained

    private void textConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textConfirmPasswordFocusLost
        if (textConfirmPassword.getText().isEmpty() || textConfirmPassword.getText().trim().toLowerCase().equals("password")){
            textConfirmPassword.setText("Password");
            textConfirmPassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_textConfirmPasswordFocusLost

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
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAddress;
    private javax.swing.JPasswordField textConfirmPassword;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textPhoneNumber;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
