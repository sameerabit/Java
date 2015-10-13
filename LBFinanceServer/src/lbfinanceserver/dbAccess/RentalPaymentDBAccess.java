/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lbfinancecommon.model.RentalPayment;

/**
 *
 * @author Hasitha
 */
public class RentalPaymentDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public RentalPayment getRentalPaymentDetails(String leaseNo) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement creatStatement = connection.createStatement();
        String sql = "select * from rentalpayment where leasingno='" + leaseNo + "' order by paiddate desc LIMIT 1";

        ResultSet executeQuery = creatStatement.executeQuery(sql);
        RentalPayment rp = new RentalPayment();
        while (executeQuery.next()) {
            rp.setPaidDate(executeQuery.getString("paiddate"));
            rp.setPaidTime(executeQuery.getString("paidtime"));
            rp.setPercentOfRcvd(executeQuery.getDouble("percentofreceived"));
            rp.setRentalArrears(executeQuery.getDouble("rentalarrears"));
            rp.setRentalOd(executeQuery.getDouble("rentalod"));
            rp.setSundryOd(executeQuery.getDouble("sundryod"));
            rp.setTotalArrears(executeQuery.getDouble("totalarrears"));

            rp.setRentalFee(getLeasingDetails(leaseNo));
            

        }

        return rp;
    }

    public Double getLeasingDetails(String leaseNo) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement creatStatement = connection.createStatement();
        String sql = "select rentalfee from leasing where leasingno='" + leaseNo + "';";

        ResultSet executeQuery = creatStatement.executeQuery(sql);

        if (executeQuery.next()) {
            return executeQuery.getDouble("rentalfee");

        } else {
            return 0.0;
        }

    }

    public RentalPayment getReceivedPecentage(String leaseNo) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement creatStatement = connection.createStatement();
        String sql = "SELECT \n"
                + "    sum(rp.payment) as total, l.totalleasedcost\n"
                + "from\n"
                + "    rentalpayment rp,\n"
                + "    leasing l\n"
                + "where\n"
                + "    l.leasingNo IN (select \n"
                + "            l.leasingNo\n"
                + "        from\n"
                + "            leasing\n"
                + "        where\n"
                + "            leasingNo = '"+leaseNo+"')\n"
                + "        and rp.leasingNo = l.leasingNo;";

        ResultSet executeQuery = creatStatement.executeQuery(sql);

        if (executeQuery.next()) {
            double total = executeQuery.getDouble("total");
            double totalLeasedCost = executeQuery.getDouble("totalleasedcost");
            RentalPayment payment=new RentalPayment();
            payment.setTotalLeasedCost(totalLeasedCost);
            payment.setTotal(total);
            return payment;
        } else {
            return null;
        }
    }

    public int pay(RentalPayment rentalPayment) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement creatStatement = connection.createStatement();
        String sql="insert into rentalpayment values ('"+rentalPayment.getLeasingNo()+"',"+rentalPayment.getRentalArrears()+","+rentalPayment.getPercentOfRcvd()+","+rentalPayment.getTotalArrears()+","+rentalPayment.getRentalOd()+","+rentalPayment.getSundryOd()+",'"+rentalPayment.getPaidDate()+"','"+rentalPayment.getPaidTime()+"',"+rentalPayment.getRentalFee()+") ";
        int executeUpdate = creatStatement.executeUpdate(sql);
        return executeUpdate;
    }

}
