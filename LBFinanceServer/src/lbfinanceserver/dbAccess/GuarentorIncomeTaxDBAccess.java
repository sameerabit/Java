/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lbfinancecommon.model.GuarentorIncomeTax;

/**
 *
 * @author Hasitha
 */
public class GuarentorIncomeTaxDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addIncomeTax(ArrayList<GuarentorIncomeTax> taxList) throws SQLException, ClassNotFoundException {
        Connection connection=DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        int executeUpdate = 0;
        for(GuarentorIncomeTax git : taxList){
            String sql = "INSERT INTO GUARENTORINCOMETAX(guarentortid,year,taxableincome,taxpaid) VALUES ('"+git.getGuarentorId()+"',"+git.getYear()+","+git.getTaxableIncome()+","+git.getTaxPaid()+");";
            executeUpdate = executeUpdate + createStatement.executeUpdate(sql);
        }
        
        if (executeUpdate == 3) {
            return true;
        }else{
            return false;
        }
    }
}
