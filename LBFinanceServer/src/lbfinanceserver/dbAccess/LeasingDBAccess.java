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
public class LeasingDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static ClientDBAccess clientDBAccess = new ClientDBAccess();

    public ArrayList<Leasing> searchLeasingNoByLesseeID(String lesseeID) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String query = "";
        ResultSet executeQuery = createStatement.executeQuery(query);

        ArrayList<Leasing> leasedList = new ArrayList<>();
        while (executeQuery.next()) {
            Leasing leasing = new Leasing();
            leasing.setLeasingNo(executeQuery.getString("leasingno"));
            leasing.setNoOfPayments(executeQuery.getInt("noofpayments"));
            leasing.setDueDate(executeQuery.getString("duedate"));
            leasing.setRentalFee(executeQuery.getDouble("rentalfee"));
            leasing.setDownPayment(executeQuery.getDouble("downpayment"));
            leasing.setCommenceDate(executeQuery.getString("commencedate "));
            leasing.setEndDate(executeQuery.getString("enddate"));
            leasing.setLeasingCapital(executeQuery.getDouble("totalleasedcost"));
            leasedList.add(leasing);
        }

        return leasedList;
    }

    public Client searchClientByLeasingNo(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String query = "SELECT * FROM LEASING WHERE leasingno = '"+searchText+"';";
        ResultSet executeQuery = createStatement.executeQuery(query);

        ArrayList<Leasing> leasingList = new ArrayList<>();
        while (executeQuery.next()) {
            Leasing leasing = new Leasing();
            leasing.setLeasingNo(executeQuery.getString("leasingno"));
            leasing.setNoOfPayments(executeQuery.getInt("noofpayments"));
            leasing.setDueDate(executeQuery.getString("duedate"));
            leasing.setRentalFee(executeQuery.getDouble("rentalfee"));
            leasing.setDownPayment(executeQuery.getDouble("downpayment"));
            leasing.setCommenceDate(executeQuery.getString("commencedate "));
            leasing.setEndDate(executeQuery.getString("enddate"));
            leasing.setLeasingCapital(executeQuery.getDouble("totalleasedcost"));
            leasingList.add(leasing);
        }

        Client client = clientDBAccess.searchClient(searchText);
        client.setLeasingList(leasingList);

        return client;
    }

    public boolean addNewLeasingDetails(Leasing leasing) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "INSERT INTO LEASING(leasingno,clientid,noofpayments,totalleasedcost,commencedate,enddate,downpayment,rentalfee,duedate) "
                + "VALUES('" + leasing.getLeasingNo() + "','" + leasing.getClientId() + "'," + leasing.getNoOfPayments() + "," + leasing.getLeasingCapital() + ",'" + leasing.getCommenceDate() + "',"
                + "'" + leasing.getEndDate() + "'," + leasing.getDownPayment() + "," + leasing.getRentalFee() + ",'" + leasing.getDueDate() + "');";
        int res = createStatement.executeUpdate(sql);
        if (res == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removeLeasingDetails(Leasing leasing) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "DELETE FROM LEASING WHERE leasingno = '"+leasing.getLeasingNo()+"';";
        int res = createStatement.executeUpdate(sql);
        if (res == 1) {
            return true;
        } else {
            return false;
        }
    }
}
