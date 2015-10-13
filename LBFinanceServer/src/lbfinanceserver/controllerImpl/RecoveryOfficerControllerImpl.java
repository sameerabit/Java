/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import lbfinancecommon.controller.RecoveryOfficerControler;
import lbfinancecommon.model.RecoveryOfficer;
import lbfinanceserver.dbAccess.DataBaseConnection;
import lbfinanceserver.dbAccess.RecoveryOfficerDBAccess;

/**
 *
 * @author Hasitha
 */
public class RecoveryOfficerControllerImpl extends UnicastRemoteObject implements RecoveryOfficerControler {

    private RecoveryOfficerDBAccess dBAccess = new RecoveryOfficerDBAccess();

    public RecoveryOfficerControllerImpl() throws RemoteException {
    }

    @Override
    public String getNextRecoveryOfficerToRecover() throws RemoteException, ClassNotFoundException, SQLException {
        return "RC0001";
    }

    @Override
    public boolean addRecoveryOfficer(RecoveryOfficer recoveryOfficer) throws RemoteException, ClassNotFoundException, SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "INSERT INTO RECOVERYOFFICER (recoveryofficerid,name,nic,address,telno) "
                + "VALUES ('" + recoveryOfficer.getRecoveryOfficerId() + "','" + recoveryOfficer.getName() + "','" + recoveryOfficer.getNic() + "','" + recoveryOfficer.getAddress() + "','" + recoveryOfficer.getTelNo() + "')";
        int res = createStatement.executeUpdate(sql);

        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }
}
