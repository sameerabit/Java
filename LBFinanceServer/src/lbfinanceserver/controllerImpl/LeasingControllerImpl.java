/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.LeasingController;
import lbfinancecommon.model.Client;
import lbfinancecommon.model.Leasing;
import lbfinanceserver.dbAccess.LeasingDBAccess;

/**
 *
 * @author Hasitha
 */
public class LeasingControllerImpl extends UnicastRemoteObject implements LeasingController {

    LeasingDBAccess leasingDBAccess = new LeasingDBAccess();

    public LeasingControllerImpl() throws RemoteException {
    }

    @Override
    public ArrayList<Leasing> searchLeasing(String lesseID) throws RemoteException,SQLException, ClassNotFoundException {
        return leasingDBAccess.searchLeasingNoByLesseeID(lesseID);
    }

    @Override
    public Client searchClientByLeasingNo(String searchText) throws RemoteException,SQLException, ClassNotFoundException {
        return leasingDBAccess.searchClientByLeasingNo(searchText);
    }

    @Override
    public boolean addNewLeasingDetails(Leasing leasing) throws SQLException, ClassNotFoundException {
        return leasingDBAccess.addNewLeasingDetails(leasing);
    }

    @Override
    public boolean removeLeasingDetails(Leasing leasing) throws SQLException, ClassNotFoundException {
        return leasingDBAccess.removeLeasingDetails(leasing);
    }
}
