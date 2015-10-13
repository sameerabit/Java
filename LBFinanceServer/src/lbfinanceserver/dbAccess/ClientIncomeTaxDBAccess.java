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
import lbfinancecommon.model.ClientIncomeTax;

/**
 *
 * @author Hasitha
 */
public class ClientIncomeTaxDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addIncomeTax(ArrayList<ClientIncomeTax> taxList) throws SQLException, ClassNotFoundException {
        Connection connection=DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        int executeUpdate = 0;
        for(ClientIncomeTax cit : taxList){
            String sql = "INSERT INTO CLIENTINCOMETAX(clientid,year,taxableincome,taxpaid) VALUES ('"+cit.getClientId()+"',"+cit.getYear()+","+cit.getTaxableIncome()+","+cit.getTaxPaid()+");";
            executeUpdate = executeUpdate + createStatement.executeUpdate(sql);
        }
        
        if (executeUpdate == 3) {
            return true;
        }else{
            return false;
        }
        
    }
}
