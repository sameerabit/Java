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
import lbfinancecommon.model.Client;
import lbfinancecommon.model.Leasing;

/**
 *
 * @author Hasitha
 */
public class ClientDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static LeasingDBAccess leasingDBAccess = new LeasingDBAccess();

    public Client searchClientDetailsByNIC(String nic) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "";
        ResultSet executeQuery = createStatement.executeQuery(sql);

        Client client = new Client();

        while (executeQuery.next()) {
            client.setClientId(executeQuery.getString("LesseeID"));
            client.setName(executeQuery.getString("Name"));
            client.setNic(executeQuery.getString("nic"));
            client.setPrivateAddress(executeQuery.getString("privateAddress"));
            client.setOfficialAddress(executeQuery.getString("officialAddress"));

        }

        return client;



    }

    public Client searchClientById(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "SELECT * FROM CLIENT WHERE clientid = (SELECT clientid FROM LEASING WHERE leasingno = '"+searchText+"');";
        ResultSet executeQuery = createStatement.executeQuery(sql);

        Client client = new Client();
        ArrayList<Leasing> leasingList = new ArrayList<>();

        while (executeQuery.next()) {
            client.setClientId(executeQuery.getString("LesseeID"));
            client.setName(executeQuery.getString("Name"));
            client.setNic(executeQuery.getString("nic"));
            client.setPrivateAddress(executeQuery.getString("privateAddress"));
            client.setOfficialAddress(executeQuery.getString("officialAddress"));

        }

        leasingList = leasingDBAccess.searchLeasingNoByLesseeID(executeQuery.getString("LesseeID"));
        client.setLeasingList(leasingList);
        return client;
    }

    public Client searchClientByName(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "";
        ResultSet executeQuery = createStatement.executeQuery(sql);

        Client client = new Client();
        ArrayList<Leasing> leasingList = new ArrayList<>();

        while (executeQuery.next()) {
            client.setClientId(executeQuery.getString("LesseeID"));
            client.setName(executeQuery.getString("Name"));
            client.setNic(executeQuery.getString("nic"));
            client.setPrivateAddress(executeQuery.getString("privateAddress"));
            client.setOfficialAddress(executeQuery.getString("officialAddress"));

        }

        leasingList = leasingDBAccess.searchLeasingNoByLesseeID(executeQuery.getString("LesseeID"));
        client.setLeasingList(leasingList);
        return client;
    }

    public Client searchClient(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "";
        ResultSet executeQuery = createStatement.executeQuery(sql);

        Client client = new Client();

        while (executeQuery.next()) {
            client.setClientId(executeQuery.getString("LesseeID"));
            client.setName(executeQuery.getString("Name"));
            client.setNic(executeQuery.getString("nic"));
            client.setPrivateAddress(executeQuery.getString("privateAddress"));
            client.setOfficialAddress(executeQuery.getString("officialAddress"));
            client.setContactNo(executeQuery.getString("telNo"));
        }

        return client;
    }

    public boolean addClient(Client client) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "INSERT INTO CLIENT(clientid,recoveryofficerid,marketingofficerid,clientname,nic,occupation,privateaddress,officialaddress,contactno,organizationtype,residentduration,statusinpvtaddress,citizenship,age,maritalstatus,incomesource,totalmonthlyincome) "
                + "VALUES ('"+client.getClientId()+"','"+client.getRecoveryOfficerId()+"','"+client.getMarketingOfficerId()+"','"+client.getName()+"','"+client.getNic()+"','"+client.getOccupation()+"','"+client.getPrivateAddress()+"','"+client.getOfficialAddress()+"','"+client.getContactNo()+"','"+client.getOrganizationType()+"','"+client.getResidentDuration()+"','"+client.getStatusInPvtAddress()+"','"+client.getCitizenship()+"',"+client.getAge()+",'"+client.getMaritalStatus()+"','"+client.getIncomeSource()+"',"+client.getTotalMonthlyIncome()+");";

        int res = createStatement.executeUpdate(sql);

        if (res == 1) {
            return true;
        } else {
            return false;
        }
    }
}
