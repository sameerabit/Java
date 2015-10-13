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
import lbfinancecommon.model.ClientBankers;
import lbfinancecommon.model.GuarentorBankers;

/**
 *
 * @author Hasitha
 */
public class GuarentorBankersDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addBankers(ArrayList<GuarentorBankers> bankerList) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        int executeUpdate = 0;
        for (GuarentorBankers gb : bankerList) {
            String sql = "INSERT INTO GUARENTORBANKERS(guarentorid,bankname,address,accountno) values ('" + gb.getGuarentorId() + "','" + gb.getBankName() + "','" + gb.getAddress() + "','" + gb.getAccountNo() + "');";
            executeUpdate = executeUpdate + createStatement.executeUpdate(sql);
        }
        if (executeUpdate > 0) {
            return true;
        } else {
            return false;
        }
    }
}
