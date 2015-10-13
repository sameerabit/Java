/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.leasing;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lbfinance.serverConnector.ServerConnector;
import lbfinancecommon.controller.RentalPaymentController;
import lbfinancecommon.model.RentalPayment;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
public class RentalPaymentForm extends javax.swing.JFrame {

    /**
     * Creates new form RentalPaymentForm1
     */
    public RentalPaymentForm() {
        initComponents();
        Calendar c = Calendar.getInstance();

        Date time = c.getTime();
        c.getActualMaximum(Calendar.DAY_OF_MONTH);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String date = dateFormat.format(time);
        String curtime = timeFormat.format(time);

        dateDisplayLabel.setText(date);
        timeDisplayLabel.setText(curtime);

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
        sundryOdLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leasingNoLabel = new javax.swing.JLabel();
        rentalArrearsLabel = new javax.swing.JLabel();
        receivedLabel = new javax.swing.JLabel();
        rentalOdLabel = new javax.swing.JLabel();
        lastPaymentDateLabel = new javax.swing.JLabel();
        rentalArrearsDisplayLabel = new javax.swing.JLabel();
        receivedDisplayLabel = new javax.swing.JLabel();
        rentalDisplayLabel = new javax.swing.JLabel();
        lastPaymentdateDisplayLabel = new javax.swing.JLabel();
        leasingNoTextField = new javax.swing.JTextField();
        totalToBePaidLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        leasedCostLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totallyReceivedLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalArrearsPaidLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        rentalPaymentLabel = new javax.swing.JLabel();
        rentalPaymentFormattedTextField = new javax.swing.JFormattedTextField();
        sundryOdFormattedTextField = new javax.swing.JFormattedTextField();
        payButton = new javax.swing.JButton();
        timeDisplayLabel = new javax.swing.JLabel();
        dateDisplayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sundryOdLabel.setText("Sundry OD % :");
        jLayeredPane1.add(sundryOdLabel);
        sundryOdLabel.setBounds(100, 370, 80, 14);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rental Details"));

        jLabel1.setText("Total payment to be paid:");

        leasingNoLabel.setText("Leasing No :");

        rentalArrearsLabel.setText("Rental Arrears :");

        receivedLabel.setText("Received % :");

        rentalOdLabel.setText("Rental OD % :");

        lastPaymentDateLabel.setText("Last Payment Date :");

        rentalArrearsDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rentalArrearsDisplayLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        receivedDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receivedDisplayLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rentalDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rentalDisplayLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lastPaymentdateDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastPaymentdateDisplayLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        leasingNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leasingNoTextFieldActionPerformed(evt);
            }
        });

        totalToBePaidLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setText("Leased Cost");

        leasedCostLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setText("Totally Received");

        totallyReceivedLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel5.setText("Total Arrears :");

        totalArrearsPaidLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalArrearsPaidLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastPaymentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receivedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentalArrearsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leasingNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentalOdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rentalDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receivedDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rentalArrearsDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastPaymentdateDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leasingNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalArrearsPaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totallyReceivedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(leasedCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalToBePaidLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(leasingNoLabel)
                    .addComponent(leasingNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rentalArrearsDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentalArrearsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receivedLabel)
                    .addComponent(receivedDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentalOdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentalDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastPaymentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastPaymentdateDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalArrearsPaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalToBePaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(leasedCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totallyReceivedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(10, 80, 610, 240);

        timeLabel.setText("Time :");
        jLayeredPane1.add(timeLabel);
        timeLabel.setBounds(20, 60, 40, 14);

        dateLabel.setText("Date :");
        jLayeredPane1.add(dateLabel);
        dateLabel.setBounds(340, 60, 40, 10);

        rentalPaymentLabel.setText("Today Rental Payment :");
        jLayeredPane1.add(rentalPaymentLabel);
        rentalPaymentLabel.setBounds(100, 410, 120, 14);

        rentalPaymentFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        rentalPaymentFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalPaymentFormattedTextFieldActionPerformed(evt);
            }
        });
        jLayeredPane1.add(rentalPaymentFormattedTextField);
        rentalPaymentFormattedTextField.setBounds(220, 400, 180, 30);

        sundryOdFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        sundryOdFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundryOdFormattedTextFieldActionPerformed(evt);
            }
        });
        sundryOdFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sundryOdFormattedTextFieldKeyReleased(evt);
            }
        });
        jLayeredPane1.add(sundryOdFormattedTextField);
        sundryOdFormattedTextField.setBounds(220, 360, 180, 30);

        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(payButton);
        payButton.setBounds(470, 400, 150, 40);
        jLayeredPane1.add(timeDisplayLabel);
        timeDisplayLabel.setBounds(70, 54, 110, 20);
        jLayeredPane1.add(dateDisplayLabel);
        dateDisplayLabel.setBounds(380, 54, 120, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        try {
            RentalPayment rentalPayment = new RentalPayment();
            double sundryOD = Double.parseDouble(sundryOdFormattedTextField.getText());
            double arrears = Double.parseDouble(totalArrearsPaidLabel.getText());
            double rentalArrears = Double.parseDouble(rentalArrearsDisplayLabel.getText());
            double totalArrears = sundryOD + arrears;
            double payment = Double.parseDouble(rentalPaymentFormattedTextField.getText());
            if (rentalArrears > payment) {
                rentalArrears = rentalArrears - payment;
            } else {
                rentalArrears = 0;
            }
            
            double lastTotalArrears = totalArrears - payment;
            
            System.out.println("lta" + lastTotalArrears);
            
            ServerConnector serverConnector;
            
            serverConnector = ServerConnector.getServerConnector();
            RentalPaymentController rentalPaymentController = serverConnector.getRentalPaymentController();

            rentalPayment.setLeasingNo(leasingNoTextField.getText());
            rentalPayment.setRentalArrears(rentalArrears);
            rentalPayment.setTotalArrears(lastTotalArrears);
            rentalPayment.setRentalOd(0);
            rentalPayment.setRentalFee(Double.parseDouble(rentalPaymentFormattedTextField.getText()));
            rentalPayment.setSundryOd(Double.parseDouble(sundryOdFormattedTextField.getText()));
            rentalPayment.setPercentOfRcvd(Double.parseDouble(receivedDisplayLabel.getText()));
            rentalPayment.setPaidDate(dateDisplayLabel.getText());
            rentalPayment.setPaidTime(timeDisplayLabel.getText());
            
            int success = rentalPaymentController.pay(rentalPayment);
            if (success > 0) {
                try {
                    JOptionPane.showMessageDialog(this, "Payment is successful");
                    String time = timeDisplayLabel.getText();
                    String date = dateDisplayLabel.getText();
                    String totalToBePaid = totalToBePaidLabel.getText();
                    String Paid = rentalPaymentFormattedTextField.getText();
                    
                    Map<String, Object> param = new HashMap<String, Object>();
                    param.put("time", time);
                    param.put("date", date);
                    param.put("totalToBePaid", totalToBePaid);
                    param.put("Paid", Paid);
                    
                    JasperReport jr = JasperCompileManager.compileReport(".\\src\\reports\\paymentREport.jrxml");
                    JasperPrint jp = JasperFillManager.fillReport(jr, param);
                    JasperViewer.viewReport(jp, false);
                } catch (JRException ex) {
                    Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "Payment is failed");
            }
        } catch (RemoteException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        }

            


    }//GEN-LAST:event_payButtonActionPerformed

    private void leasingNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leasingNoTextFieldActionPerformed
        String leaseNo = leasingNoTextField.getText();
        try {
            ServerConnector serverConnector = ServerConnector.getServerConnector();
            RentalPaymentController rentalPaymentController = serverConnector.getRentalPaymentController();

            try {

                RentalPayment rp = rentalPaymentController.getRentalPaymentDetails(leaseNo);

                double rentalFee = rp.getRentalFee();

                String paidDate = rp.getPaidDate();
                String paidTime = rp.getPaidTime();
                double percentOfRcvd = rp.getPercentOfRcvd();
                double rentalArrears = rp.getRentalArrears();
                double sundryOd = rp.getSundryOd();
                double rentalOd = rp.getRentalOd();
                double totalArrears = rp.getTotalArrears();

                rentalArrearsDisplayLabel.setText(rentalArrears + "");

                rentalDisplayLabel.setText(rentalOd + "");
                lastPaymentdateDisplayLabel.setText(paidDate);
                totalArrearsPaidLabel.setText(totalArrears + "");

                RentalPayment receivedPecentage = rentalPaymentController.getReceivedPecentage(leasingNoTextField.getText());
                double total = receivedPecentage.getTotal();
                double totalLeasedCost = receivedPecentage.getTotalLeasedCost();
                double receivedPercentage = (total / totalLeasedCost) * 100;
                receivedDisplayLabel.setText(receivedPercentage + "");
                leasedCostLabel.setText(totalLeasedCost + "");
                totallyReceivedLabel.setText(total + "");
                totalToBePaidLabel.setText(totalArrears + "");

            } catch (SQLException ex) {
                Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RentalPaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leasingNoTextFieldActionPerformed

    private void sundryOdFormattedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sundryOdFormattedTextFieldKeyReleased
        double totalArrears = Double.parseDouble(totalArrearsPaidLabel.getText());
        try {
            double sundry = Double.parseDouble(sundryOdFormattedTextField.getText());
            totalToBePaidLabel.setText(Double.toString(totalArrears + sundry));
        } catch (NumberFormatException e) {
            totalToBePaidLabel.setText(totalArrearsPaidLabel.getText());
        }
    }//GEN-LAST:event_sundryOdFormattedTextFieldKeyReleased

    private void rentalPaymentFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentalPaymentFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentalPaymentFormattedTextFieldActionPerformed

    private void sundryOdFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundryOdFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sundryOdFormattedTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RentalPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentalPaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateDisplayLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastPaymentDateLabel;
    private javax.swing.JLabel lastPaymentdateDisplayLabel;
    private javax.swing.JLabel leasedCostLabel;
    private javax.swing.JLabel leasingNoLabel;
    private javax.swing.JTextField leasingNoTextField;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel receivedDisplayLabel;
    private javax.swing.JLabel receivedLabel;
    private javax.swing.JLabel rentalArrearsDisplayLabel;
    private javax.swing.JLabel rentalArrearsLabel;
    private javax.swing.JLabel rentalDisplayLabel;
    private javax.swing.JLabel rentalOdLabel;
    private javax.swing.JFormattedTextField rentalPaymentFormattedTextField;
    private javax.swing.JLabel rentalPaymentLabel;
    private javax.swing.JFormattedTextField sundryOdFormattedTextField;
    private javax.swing.JLabel sundryOdLabel;
    private javax.swing.JLabel timeDisplayLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalArrearsPaidLabel;
    private javax.swing.JLabel totalToBePaidLabel;
    private javax.swing.JLabel totallyReceivedLabel;
    // End of variables declaration//GEN-END:variables
}
