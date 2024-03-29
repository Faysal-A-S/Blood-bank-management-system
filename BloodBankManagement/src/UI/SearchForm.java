/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BLL.DonorManager;
import DAL.DAO.Donor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SearchForm extends javax.swing.JFrame {
    
    DonorManager aDonorManager = new DonorManager();
    private Object scan;

    /**
     * Creates new form SearchForm
     */
    public SearchForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowDonorBox = new javax.swing.JTextArea();
        BloodCombobox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DivisionBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Blood-group");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(198, 93, 76, 23);

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton);
        SearchButton.setBounds(404, 93, 84, 23);

        ShowDonorBox.setColumns(20);
        ShowDonorBox.setRows(5);
        ShowDonorBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowDonorBoxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ShowDonorBox);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(199, 170, 289, 123);

        BloodCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood", "AB+", "A+", "A-", "B+", "B-" }));
        getContentPane().add(BloodCombobox);
        BloodCombobox.setBounds(301, 94, 93, 20);

        jLabel2.setText("Division");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(198, 127, 76, 25);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(404, 127, 84, 23);

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(429, 322, 59, 23);

        jLabel3.setText("Search Donor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(292, 37, 136, 27);

        DivisionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Khulna", "Barishal", "Rangpur", "Rajshahi", "Sylhet", "Mymensingh" }));
        DivisionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DivisionBox);
        DivisionBox.setBounds(301, 129, 93, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
       

        String bloodgroup;
         //int notFound = 0;
         Donor aDonor =  new Donor();
         
      /*   while(aDonor.getBloodGroup()!= null){
            if(aDonor.getBloodGroup() == bloodgroup ){
                List<Donor> aListOfDonor = new ArrayList<Donor>();
            aListOfDonor = aDonorManager.displayDonor();
            for(Donor showDonor:aListOfDonor){
               displayTextArea.append(showDonor.getName()+"\n");
               displayTextArea.append(showDonor.getBloodGroup()+"\n");
               displayTextArea.append(showDonor.getContactNo()+"\n");
               displayTextArea.append(showDonor.getAddress()+"\n");
            }
         }
        */
      ShowDonorBox.setText(null);
        int i;
        for(i=0;i<DonorManager.donorList.size();i++){
            if(BloodCombobox.getSelectedItem().equals(DonorManager.donorList.get(i).getBloodGroup())){
                ShowDonorBox.append("\nName : "+DonorManager.donorList.get(i).getName()+"\n");
                ShowDonorBox.append("Number : "+DonorManager.donorList.get(i).getContactNo()+"\n");
               ShowDonorBox.append("Address : "+DonorManager.donorList.get(i).getAddress()+"\n");
                ShowDonorBox.append("Division : "+DonorManager.donorList.get(i).getDivision()+"\n");
            }
            
            }
   

      
    
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     ShowDonorBox.setText(null);
        int i;
        for(i=0;i<DonorManager.donorList.size();i++){
            if(DivisionBox.getSelectedItem().equals(DonorManager.donorList.get(i).getDivision())){
                ShowDonorBox.append("\nName : "+DonorManager.donorList.get(i).getName()+"\n");
                ShowDonorBox.append("Number : "+DonorManager.donorList.get(i).getContactNo()+"\n");
                ShowDonorBox.append("Address : "+DonorManager.donorList.get(i).getAddress()+"\n");
                ShowDonorBox.append("Division : "+DonorManager.donorList.get(i).getBloodGroup()+"\n");
            }
            
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MenuForm().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ShowDonorBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowDonorBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowDonorBoxMouseClicked

    private void DivisionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DivisionBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BloodCombobox;
    private javax.swing.JComboBox<String> DivisionBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextArea ShowDonorBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
