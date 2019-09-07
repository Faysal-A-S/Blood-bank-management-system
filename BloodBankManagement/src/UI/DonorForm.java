
package UI;

import BLL.DonorManager;
import DAL.DAO.Donor;
import java.util.ArrayList;
import java.util.List;
import UI.LoginForm;
import UI.MenuForm;


public class DonorForm extends javax.swing.JFrame {

    DonorManager aDonorManager = new DonorManager();
    
    public DonorForm() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        contactNoTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        divisionbox = new javax.swing.JComboBox<>();
        bloodGrouplTextField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donor Registration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 789, 25);

        jLabel2.setText("Name: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 57, 50, 14);

        jLabel3.setText("Blood Group");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 80, 80, 14);

        jLabel5.setText("Contact Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 110, 120, 14);

        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 160, 60, 20);
        getContentPane().add(nameTextField);
        nameTextField.setBounds(298, 44, 278, 30);
        getContentPane().add(contactNoTextField);
        contactNoTextField.setBounds(298, 105, 278, 30);
        getContentPane().add(addressTextField);
        addressTextField.setBounds(298, 143, 278, 55);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(250, 250, 70, 40);

        displayButton.setText("Display");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(displayButton);
        displayButton.setBounds(340, 250, 90, 40);

        displayTextArea.setColumns(20);
        displayTextArea.setRows(5);
        jScrollPane1.setViewportView(displayTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 300, 356, 96);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(0, 0, 110, 40);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton);
        logoutButton.setBounds(790, 0, 110, 50);

        jLabel4.setText("Division");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 200, 100, 26);

        divisionbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Khulna", "Barisal", "Rajshahi", "Rangpur", "Sylhet", "Mymensingh" }));
        getContentPane().add(divisionbox);
        divisionbox.setBounds(310, 210, 172, 20);

        bloodGrouplTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AB+", "A+", "A-", "B+", "B-" }));
        getContentPane().add(bloodGrouplTextField);
        bloodGrouplTextField.setBounds(298, 79, 102, 20);

        setSize(new java.awt.Dimension(916, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       Donor aDonor = new Donor();
       
         
       aDonor.setName(nameTextField.getText());
       aDonor.setBloodGroup(bloodGrouplTextField.getSelectedItem().toString());
       aDonor.setContactNo(contactNoTextField.getText());
       aDonor.setAddress(addressTextField.getText());
       aDonor.setDivision(divisionbox.getSelectedItem().toString());
       aDonorManager.saveDonor(aDonor);
         displayTextArea.setText(null);
       
            nameTextField.setText("");
            bloodGrouplTextField.setSelectedIndex(0);
            contactNoTextField.setText("");
            addressTextField.setText(""); 
            divisionbox.setSelectedIndex(0);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        List<Donor> aListOfDonor = new ArrayList<Donor>();
            aListOfDonor = aDonorManager.displayDonor();
         displayTextArea.setText(null);
            for(Donor showDonor:aListOfDonor){
               displayTextArea.append("Donor Name : "+showDonor.getName()+"\n");
               displayTextArea.append("Blood Group : " +showDonor.getBloodGroup()+"\n");
               displayTextArea.append("Contact No : "+showDonor.getContactNo()+"\n");
               displayTextArea.append("Address : "+showDonor.getAddress()+"\n");
                displayTextArea.append("Division : "+showDonor.getDivision()+"\n");
            }
        
    }//GEN-LAST:event_displayButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        
        LoginForm Info = new LoginForm();
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
        Info.setResizable(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        MenuForm Info = new MenuForm();
        Info.setVisible(true);
        dispose();
        Info.setLocationRelativeTo(null);
        Info.setResizable(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> bloodGrouplTextField;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JButton displayButton;
    private javax.swing.JTextArea displayTextArea;
    private javax.swing.JComboBox<String> divisionbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
