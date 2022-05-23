package florist.view;

import florist.model.User;
import java.awt.Color;
import javax.swing.JOptionPane;

public class SignInView extends javax.swing.JFrame {

    User user = new User();
    
    public SignInView() {
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
        buttonSignIn = new javax.swing.JButton();
        buttonSignUp = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Florist");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Sign In");
        jLabel1.setToolTipText("");

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
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        buttonSignIn.setBackground(new java.awt.Color(255, 153, 153));
        buttonSignIn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonSignIn.setText("Sign In");
        buttonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignInActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(textUsername)
                    .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(buttonSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 190, 300, 330);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/florist/resource/background_login-01.png"))); // NOI18N
        background.setToolTipText("");
        getContentPane().add(background);
        background.setBounds(0, 0, 1280, 720);
        background.getAccessibleContext().setAccessibleName("background");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsernameActionPerformed

    private void buttonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignInActionPerformed

        String username = textUsername.getText();
        String password = textPassword.getText();
        
        if (username.isEmpty() || username.trim().toLowerCase().equals("username")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the username field");
            textUsername.requestFocus();
        } else if (password.isEmpty() || password.trim().toLowerCase().equals("password")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in the password field");
            textPassword.requestFocus();
        } else {
            user.setUsername(username);
            user.setPassword(password);
            user.signIn();
            int id = user.getId();
            if (id <= 0){
                JOptionPane.showMessageDialog(rootPane, "User not found! Make Sure your username and password is correct");
                textPassword.setText("");
                textUsername.requestFocus();
            } else {
                int role = user.getRole();
                if (role == 1){
                    DashboardAdminView dashboardAdmin = new DashboardAdminView();
                    dashboardAdmin.setVisible(true);
                    dispose();
                } else if (role == 2) {
                    DashboardView dashboard = new DashboardView(id);
                    dashboard.setVisible(true);
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_buttonSignInActionPerformed

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        SignUpView registerView = new SignUpView();
        registerView.setVisible(true);
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonSignIn;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
