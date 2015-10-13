/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lbfinancecommon.model.Guarentor;

/**
 *
 * @author Hasitha
 */
public class GuarentorDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addGuarentor(Guarentor guarentor) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "INSERT INTO GUARENTOR(leasingno,guarentorid,guarentorname,nic,occupation,privateaddress,officialaddress,contactno,organizationtype,residentduration,statusinpvtaddress,citizenship,age,maritalstatus,incomesource,totalmonthlyincome) "
                + "VALUES ('"+guarentor.getLeasingNo()+"','"+guarentor.getGuarentorId()+"','"+guarentor.getGuarentorName()+"','"+guarentor.getNic()+"','"+guarentor.getOccupation()+"','"+guarentor.getPrivateAddress()+"','"+guarentor.getOfficialAddress()+"','"+guarentor.getContactNo()+"','"+guarentor.getOrganizationType()+"','"+guarentor.getResidentDuration()+"','"+guarentor.getStatusInPvtAddress()+"','"+guarentor.getCitizenship()+"',"+guarentor.getAge()+",'"+guarentor.getMaritalStatus()+"','"+guarentor.getIncomeSource()+"',"+guarentor.getTotalMonthlyIncome()+");";

        int res = createStatement.executeUpdate(sql);

        if (res == 1) {
            return true;
        } else {
            return false;
        }
    }
}
