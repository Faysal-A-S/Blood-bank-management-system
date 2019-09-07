
package UI;

import BLL.UserManager;
import DAL.DAO.User;
import java.util.ArrayList;
import java.util.List;
import UI.LoginForm;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {

    UserManager aUserManager = new UserManager();
    
    public RegistrationForm() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        contactNoTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        nationalityTextField = new javax.swing.JTextField();
        passportNoTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Regitration Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 25));

        jLabel2.setText("Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 60, 20));

        jLabel3.setText("E-mail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, 20));

        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 80, 20));

        jLabel5.setText("Contact Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 100, 20));

        jLabel6.setText("Address:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, 20));

        jLabel7.setText("Nationality: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 70, -1));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 300, 30));

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 300, 30));
        getContentPane().add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 300, 30));

        contactNoTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contactNoTextField.setDropMode(javax.swing.DropMode.INSERT);
        contactNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(contactNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 310, 30));
        getContentPane().add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 310, 40));
        getContentPane().add(nationalityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 310, 40));
        getContentPane().add(passportNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 310, 40));

        jLabel8.setText("Passport No:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 80, 20));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 90, 40));

        displayButton.setText("Display");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(displayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 90, 40));

        displayTextArea.setColumns(20);
        displayTextArea.setRows(5);
        jScrollPane1.setViewportView(displayTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 356, -1));

        jLabel9.setText("User Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 82, -1));
        getContentPane().add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 310, 40));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        setSize(new java.awt.Dimension(974, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       User aUser = new User();
      
   /*   UserManager.userList.add(new User(nameTextField.getText(),emailTextField.getText(),passwordTextField.getText(),contactNoTextField.getText(),addressTextField.getText(),nationalityTextField.getText(),passportNoTextField.getText(),userNameTextField.getText()));
//      
;*/
   
   
      // aUser.setName(nameTextField.getText());
       if(emailTextField.getText().contains("@")){
           aUser.setEmail(emailTextField.getText());
       aUser.setName(nameTextField.getText());
       aUser.setPassword(passwordTextField.getText());
       aUser.setContactNo(contactNoTextField.getText());
       aUser.setAddress(addressTextField.getText());
       aUser.setNationality(nationalityTextField.getText());
       aUser.setPassportNo(passportNoTextField.getText());
       aUser.setUserName(userNameTextField.getText());
      
       aUserManager.saveUser(aUser);
       }else{
           JOptionPane.showMessageDialog(null,"Please enter Email correctly");
       }
       
       nameTextField.setText("");
        emailTextField.setText("");
        passwordTextField.setText("");
        contactNoTextField.setText("");
        addressTextField.setText("");
        nationalityTextField.setText("");
        passportNoTextField.setText("");
        userNameTextField.setText("");
       
    }//GEN-LAST:event_saveButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        
        List<User> aListOfUser = new ArrayList<User>();
            aListOfUser = aUserManager.displayUser();
            
            displayTextArea.setText(null);
            for(User showUser:aListOfUser){
                
               displayTextArea.append("Name : "+showUser.getName()+"\n");
               
               displayTextArea.append("Email : "+showUser.getEmail()+"\n");
               displayTextArea.append("ContactNo : "+showUser.getContactNo()+"\n");
               displayTextArea.append("Address : "+showUser.getAddress()+"\n");
               displayTextArea.append("Nationality : "+showUser.getNationality()+"\n");
               displayTextArea.append("PassportNo : "+showUser.getPassportNo()+"\n");
               displayTextArea.append("UserName : "+showUser.getUserName()+"\n");
               displayTextArea.append("Password : "+"******");
               
            }
        
    }//GEN-LAST:event_displayButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        LoginForm Info = new LoginForm();
        Info.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void contactNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JButton displayButton;
    private javax.swing.JTextArea displayTextArea;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nationalityTextField;
    private javax.swing.JTextField passportNoTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
