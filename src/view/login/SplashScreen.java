/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author Hasitha
 */
public class SplashScreen extends javax.swing.JFrame {

    private Timer t;
    public static JProgressBar bar;
    private int maxWidth;
    private final ArrayList<String> text = new ArrayList<String>();
    private FontMetrics fm;

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        bar = progressBar;
        setLocationRelativeTo(null);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.01f));
        backgroundLabel.setSize(new Dimension(683, 384));
        backgroundLabel.setOpaque(false);
        ImageIcon icon = new ImageIcon(new ImageIcon(".\\src\\lbfinance\\images\\LBFINANCE LOGO.png").getImage().getScaledInstance(backgroundLabel.getWidth(), backgroundLabel.getHeight(), Image.SCALE_SMOOTH));
        backgroundLabel.setIcon(icon);
        try {
            FileReader fr = new FileReader(".\\src\\view\\login\\loadingFile.txt");
            final BufferedReader br = new BufferedReader(fr);
            /*while (br.ready()) {
             String text = br.readLine();
             //jLabel1.setText(text);
             System.out.println(text);
             }*/
            t = new Timer(200, new ActionListener() {
                int i = 0, j = 0;
                String text = null;
                Random r = new Random();
                @Override
                public void actionPerformed(ActionEvent e) {
                    j = r.nextInt(100);
                    bar.setValue(j);
                    try {
                        text = br.readLine();
                        progressLabel.setText(text);
                        System.out.println(text);
                    } catch (IOException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                    if (i == 100) {
                        bar.setValue(100);
                        progressLabel.setText("Finished loading");
                        t.stop();
                    }
                }
            });
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
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
        progressBar = new javax.swing.JProgressBar();
        progressLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setBounds(10, 440, 650, 14);
        jLayeredPane1.add(progressBar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        progressLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        progressLabel.setBounds(10, 410, 650, 20);
        jLayeredPane1.add(progressLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backgroundLabel.setBounds(0, 0, 683, 384);
        jLayeredPane1.add(backgroundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    // End of variables declaration//GEN-END:variables
}
