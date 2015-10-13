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

/**
 *
 * @author Hasitha
 */
public class ClientBankersDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addBankers(ArrayList<ClientBankers> bankerList) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        int executeUpdate = 0;
        for (ClientBankers cb : bankerList) {
            String sql = "INSERT INTO CLIENTBANKERS(clientid,bankname,address,accountno) values ('" + cb.getClientId() + "','" + cb.getBankName() + "','" + cb.getAddress() + "','" + cb.getAccountNo() + "');";
            executeUpdate = executeUpdate + createStatement.executeUpdate(sql);
        }
        if (executeUpdate > 0) {
            return true;
        } else {
            return false;
        }
    }
}
