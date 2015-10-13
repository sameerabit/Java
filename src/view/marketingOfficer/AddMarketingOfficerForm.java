/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.marketingOfficer;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lbfinance.serverConnector.ServerConnector;
import lbfinancecommon.controller.MarketingOfficerController;
import lbfinancecommon.controller.RecoveryOfficerControler;
import lbfinancecommon.controller.UserController;
import lbfinancecommon.model.MarketingOfficer;
import lbfinancecommon.model.User;
import view.recoveryOfficer.*;

/**
 *
 * @author Sameera
 */
public class AddMarketingOfficerForm extends javax.swing.JDialog {

    /**
     * Creates new form AddRecoveryOfficerForm
     */
    public AddMarketingOfficerForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        officerIdTextField = new javax.swing.JTextField();
        telNoFormattedTextField = new javax.swing.JFormattedTextField();
        nicFormattedTextField = new javax.swing.JFormattedTextField();
        addressTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Address :");
        jLabel1.setBounds(20, 240, 50, 14);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Tel No :");
        jLabel2.setBounds(20, 200, 50, 14);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("NIC :");
        jLabel3.setBounds(20, 160, 50, 14);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Name :");
        jLabel4.setBounds(20, 120, 50, 14);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Officer ID :");
        jLabel5.setBounds(20, 80, 80, 14);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        nameTextField.setBounds(90, 120, 350, 20);
        jLayeredPane1.add(nameTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        officerIdTextField.setBounds(90, 80, 140, 20);
        jLayeredPane1.add(officerIdTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        try {
            telNoFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0##-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telNoFormattedTextField.setBounds(90, 200, 109, 20);
        jLayeredPane1.add(telNoFormattedTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        try {
            nicFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########v")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nicFormattedTextField.setBounds(90, 160, 140, 20);
        jLayeredPane1.add(nicFormattedTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        addressTextField.setBounds(90, 240, 350, 20);
        jLayeredPane1.add(addressTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        submitButton.setBounds(303, 280, 140, 23);
        jLayeredPane1.add(submitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            String officerId = officerIdTextField.getText();
            String name = nameTextField.getText();
            String nic = nicFormattedTextField.getText();
            String telNo = telNoFormattedTextField.getText();
            String address = addressTextField.getText();
            
            String userName = name;
            String password = nic;
            
            MarketingOfficer marketingOfficer = new MarketingOfficer(officerId, name, nic, address, telNo);
            User user = new User(userName, password, 2);
            
            ServerConnector serverConnector = ServerConnector.getServerConnector();
            MarketingOfficerController marketingOfficerController = serverConnector.getMarketingOfficerController();
            UserController userController = serverConnector.getUserController();
            
            boolean res = marketingOfficerController.addMarketingOfficer(marketingOfficer);
            
            if(res == true){
                JOptionPane.showMessageDialog(this, "Marketing Officer successfully added.");
                boolean rep = userController.addNewUser(user);
                if(rep == true){
                    JOptionPane.showMessageDialog(this, "Marketing officer added as a user.");
                }else{
                    JOptionPane.showMessageDialog(this, "Failed to add Marketing Officer as a user.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Failed to add Marketing Officer.");
            }
        } catch (NotBoundException | MalformedURLException | RemoteException |ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddRecoveryOfficerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddRecoveryOfficerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRecoveryOfficerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRecoveryOfficerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRecoveryOfficerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMarketingOfficerForm dialog = new AddMarketingOfficerForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JFormattedTextField nicFormattedTextField;
    private javax.swing.JTextField officerIdTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JFormattedTextField telNoFormattedTextField;
    // End of variables declaration//GEN-END:variables
}
