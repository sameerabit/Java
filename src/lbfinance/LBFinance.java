/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinance;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.client.AddLesseeForm;

/**
 *
 * @author Sameera
 */
public class LBFinance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FastLookAndFeel());
            new AddLesseeForm().setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LBFinance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
