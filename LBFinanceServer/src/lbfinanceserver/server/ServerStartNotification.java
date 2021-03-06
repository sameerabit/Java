/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.server;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.Timer;
import lbfinancecommon.controller.RemoteFactory;
import lbfinanceserver.controllerImpl.RemoteFactoryImpl;

/**
 *
 * @author Hasitha
 */
public class ServerStartNotification extends javax.swing.JFrame {

    RemoteFactory remoteFactory;
    JFrame frame;
    Timer timer1;
    Timer timer2;

    /**
     * Creates new form Notification
     */
    public ServerStartNotification() {
        initComponents();
        frame = this;
        //setLocation(1366 - 358, 768-123);
        setBackground(new Color(0.09f, 0.09f, 0.09f, 0.9f));
        serverStopButton.setBackground(new Color(0.09f, 0.09f, 0.09f, 0.9f));
        serverStopButton.setForeground(new Color(0.09f, 0.09f, 0.09f, 0.9f));
        systemTimeDisplayLabel.setForeground(Color.white);
        systemTimeLabel.setForeground(Color.white);
        serverStartedTimeDisplayLabel.setForeground(Color.white);
        serverStartedTimeLabel.setForeground(Color.white);
        serverUpTimeDisplayLabel.setForeground(Color.white);
        serverUpTimeLabel.setForeground(Color.white);
        notifyLabel.setForeground(Color.white);

        System.setProperty("java.rmi.server.hostname", "localhost");

        timer1 = new Timer(10, new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setLocation(1366 - 416, 768 - i);
                i++;
                if (i == 123) {
                    timer1.stop();
                    notifyLabel.setText("Server is running...");
                }
            }
        });
        timer1.start();

        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            remoteFactory = new RemoteFactoryImpl();
            registry.rebind("RemoteServer", remoteFactory);
            System.out.println(" Server start..........");
            notifyLabel.setText("Server is starting...");

            final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd   HH:mm:ss");
            final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            final Calendar c = Calendar.getInstance();
            final long miliFirst = c.getTimeInMillis();
            serverStartedTimeDisplayLabel.setText(dateFormat.format(c.getTime()));
            int interval = 1000; // 1000 ms
            new Timer(interval, new ActionListener() {
                int i = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    Calendar now = Calendar.getInstance();
                    systemTimeDisplayLabel.setText(dateFormat.format(now.getTime()));
                    long miliNow = now.getTimeInMillis();
                    c.setTimeInMillis(miliNow - miliFirst - 19800000);
                    String time = timeFormat.format(c.getTime());
                    serverUpTimeDisplayLabel.setText(time);
                }
            }).start();
        } catch (RemoteException rex) {
            System.out.println(rex);
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
        notifyLabel = new javax.swing.JLabel();
        systemTimeLabel = new javax.swing.JLabel();
        systemTimeDisplayLabel = new javax.swing.JLabel();
        serverStartedTimeLabel = new javax.swing.JLabel();
        serverStartedTimeDisplayLabel = new javax.swing.JLabel();
        serverUpTimeLabel = new javax.swing.JLabel();
        serverUpTimeDisplayLabel = new javax.swing.JLabel();
        serverStopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        notifyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notifyLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        notifyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        notifyLabel.setBounds(10, 0, 310, 20);
        jLayeredPane1.add(notifyLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        systemTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        systemTimeLabel.setText("System Time           :");
        systemTimeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        systemTimeLabel.setBounds(10, 30, 140, 17);
        jLayeredPane1.add(systemTimeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        systemTimeDisplayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        systemTimeDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        systemTimeDisplayLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        systemTimeDisplayLabel.setBounds(160, 30, 190, 20);
        jLayeredPane1.add(systemTimeDisplayLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        serverStartedTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serverStartedTimeLabel.setText("Server Started Time :");
        serverStartedTimeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        serverStartedTimeLabel.setBounds(10, 60, 140, 17);
        jLayeredPane1.add(serverStartedTimeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        serverStartedTimeDisplayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serverStartedTimeDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serverStartedTimeDisplayLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        serverStartedTimeDisplayLabel.setBounds(160, 60, 190, 20);
        jLayeredPane1.add(serverStartedTimeDisplayLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        serverUpTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serverUpTimeLabel.setText("Server Up Time        :");
        serverUpTimeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        serverUpTimeLabel.setBounds(10, 90, 140, 17);
        jLayeredPane1.add(serverUpTimeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        serverUpTimeDisplayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serverUpTimeDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serverUpTimeDisplayLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        serverUpTimeDisplayLabel.setBounds(160, 90, 190, 20);
        jLayeredPane1.add(serverUpTimeDisplayLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        serverStopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lbfinanceserver/images/arrow_down_double.png"))); // NOI18N
        serverStopButton.setToolTipText("Stop Server");
        serverStopButton.setOpaque(false);
        serverStopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverStopButtonActionPerformed(evt);
            }
        });
        serverStopButton.setBounds(363, 10, 50, 40);
        jLayeredPane1.add(serverStopButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serverStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverStopButtonActionPerformed
        timer2 = new Timer(10, new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                notifyLabel.setText("Server is stopped...");
                frame.setLocation(1366 - 416, 645 + i);
                i++;
                if (i == 123) {
                    timer2.stop();
                    WindowEvent we = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
                    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
                }
            }
        });
        timer2.start();

    }//GEN-LAST:event_serverStopButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ServerStartNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerStartNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerStartNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerStartNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerStartNotification().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel notifyLabel;
    private javax.swing.JLabel serverStartedTimeDisplayLabel;
    private javax.swing.JLabel serverStartedTimeLabel;
    private javax.swing.JButton serverStopButton;
    private javax.swing.JLabel serverUpTimeDisplayLabel;
    private javax.swing.JLabel serverUpTimeLabel;
    private javax.swing.JLabel systemTimeDisplayLabel;
    private javax.swing.JLabel systemTimeLabel;
    // End of variables declaration//GEN-END:variables
}
