/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinance.important;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hasitha
 */
public class Validation {

    public static String validateLetters(String txt, KeyEvent evt) {
        char c = evt.getKeyChar();
        boolean b = Character.isLetter(c);
        boolean d = Character.isSpace(c);
        if (!b && !d) {
            txt = txt.replace(c + "", "");
        }
        return txt;
    }

    public static boolean validateDouble(String txt) {
        String regex = "^([0-3]){1}+([.])?([0-9]){4}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
        boolean b = matcher.find();
        return b;
    }

    public static boolean validateEmail(String txt) {
        String regex = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
        boolean b = matcher.find();
        return b;
    }

    public static boolean validateNameWithInitials(KeyEvent evt) {
        char c = evt.getKeyChar();
        boolean b = Character.isLetter(c);
        boolean d = Character.isWhitespace(c);
        if (!b && !d && c != 46 && c == KeyEvent.VK_SHIFT) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateDate(String txt) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            sdf.parse(txt);
        } catch (ParseException ex) {
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    public static boolean validateNic(String txt) {
        String regex = "^[0-9]{9}[vVxX]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt);
        boolean b = matcher.find();
        return b;
    }

    public static boolean validateTele(String txt) {
        String regex = "^0[1-9]{2}[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt);
        boolean b = matcher.find();
        return b;
    }
}
