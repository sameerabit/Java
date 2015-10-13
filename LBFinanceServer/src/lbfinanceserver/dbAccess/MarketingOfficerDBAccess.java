/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lbfinancecommon.model.MarketingOfficer;

/**
 *
 * @author Hasitha
 */
public class MarketingOfficerDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addMarketingOfficer(MarketingOfficer marketingOfficer) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "INSERT INTO MARKETINGOFFICER (marketingofficerid,name,nic,address,telno) "
                + "VALUES ('" + marketingOfficer.getMarketingOfficerId() + "','" + marketingOfficer.getName() + "','" + marketingOfficer.getNic() + "','" + marketingOfficer.getAddress() + "','" + marketingOfficer.getTelNo() + "')";
        int res = createStatement.executeUpdate(sql);

        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public MarketingOfficer searchMarketingOfficer(String marketingOfficer) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "select * from marketingofficer where marketingofficerid='"+marketingOfficer+"'";
        System.out.println(sql);
        ResultSet executeQuery = createStatement.executeQuery(sql);
        MarketingOfficer mo = new MarketingOfficer();
        while (executeQuery.next()) {
            mo.setName(executeQuery.getString("name"));
            mo.setNic(executeQuery.getString("nic"));
            mo.setAddress(executeQuery.getString("address"));
            mo.setTelNo(executeQuery.getString("telNo"));
            
        }
        return mo;

    }

    public ArrayList<String> getMarketingOfficerIds() throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "select marketingofficerid from marketingofficer";
        
        ResultSet executeQuery = createStatement.executeQuery(sql);
        ArrayList<String> moi=new ArrayList<>();
        while (executeQuery.next()) {
           
            moi.add( executeQuery.getString("marketingofficerid"));
            
        }
        return moi;
    }
}
