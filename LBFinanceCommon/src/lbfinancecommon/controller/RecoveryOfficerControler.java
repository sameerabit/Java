/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import lbfinancecommon.model.RecoveryOfficer;

/**
 *
 * @author Hasitha
 */
public interface RecoveryOfficerControler extends Remote {

    public String getNextRecoveryOfficerToRecover() throws RemoteException, ClassNotFoundException, SQLException;

    public boolean addRecoveryOfficer(RecoveryOfficer recoveryOfficer) throws RemoteException, ClassNotFoundException, SQLException;
}
