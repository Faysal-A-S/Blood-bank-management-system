
package UI;
import UI.DonorForm;
import UI.LoginForm;

public class MenuForm extends javax.swing.JFrame {

    
    public MenuForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        donorRegisterButton = new javax.swing.JButton();
        searchDonorButton = new javax.swing.JButton();
        storageInfoButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(353, 128, 77, 25);

        donorRegisterButton.setText("Donor Register");
        donorRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorRegisterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(donorRegisterButton);
        donorRegisterButton.setBounds(353, 164, 138, 23);

        searchDonorButton.setText("Search Donor");
        searchDonorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDonorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchDonorButton);
        searchDonorButton.setBounds(353, 205, 138, 23);

        storageInfoButton.setText("Storage Info");
        storageInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(storageInfoButton);
        storageInfoButton.setBounds(353, 246, 138, 23);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton);
        logoutButton.setBounds(652, 11, 138, 23);

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void donorRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorRegisterButtonActionPerformed
        
        DonorForm Info = new DonorForm();
        Info.setVisible(true);
        dispose();
    }//GEN-LAST:event_donorRegisterButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        
        LoginForm Info = new LoginForm();
        Info.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void searchDonorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDonorButtonActionPerformed
        // TODO add your handling code here:
        new SearchForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_searchDonorButtonActionPerformed

    private void storageInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageInfoButtonActionPerformed
        // TODO add your handling code here:
        new DonorShowPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_storageInfoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donorRegisterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton searchDonorButton;
    private javax.swing.JButton storageInfoButton;
    // End of variables declaration//GEN-END:variables
}
