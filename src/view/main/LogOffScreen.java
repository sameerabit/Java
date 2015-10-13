/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.main;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hasitha
 */
public class LogOffScreen extends javax.swing.JFrame {

    /**
     * Creates new form LogOffScreen
     */
    public LogOffScreen() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        backgroundLabel.setSize(this.getSize());
        ImageIcon icon = new ImageIcon(new ImageIcon(".\\src\\lbfinance\\images\\LogOffBackground.png").getImage().getScaledInstance(backgroundLabel.getWidth(), backgroundLabel.getHeight(), Image.SCALE_SMOOTH));
        backgroundLabel.setIcon(icon);
        
        try {
            final URL url = new URL("file:///D:/Bit Bucket/lbfinance/LBFinance/src/lbfinance/images/109.png");
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().createImage("D:\\Bit Bucket\\lbfinance\\LBFinance\\src\\lbfinance\\images\\109.GIF"));
                    logOffLoadingLabel = new JLabel(icon);
                    
                }
            });
        } catch (MalformedURLException ex) {
            Logger.getLogger(LogOffScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        logOffLoadingLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        logOffLoadingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lbfinance/images/109.png"))); // NOI18N
        logOffLoadingLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logOffLoadingLabel.setBounds(530, 550, 210, 200);
        jLayeredPane1.add(logOffLoadingLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundLabel.setBounds(0, 0, 1366, 768);
        jLayeredPane1.add(backgroundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LogOffScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogOffScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogOffScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogOffScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogOffScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel logOffLoadingLabel;
    // End of variables declaration//GEN-END:variables
}
