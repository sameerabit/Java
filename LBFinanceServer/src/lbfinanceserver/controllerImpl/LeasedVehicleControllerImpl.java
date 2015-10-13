/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.io.FileNotFoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.LeasedVehicleController;
import lbfinancecommon.model.LeasedVehicle;
import lbfinancecommon.model.Leasing;
import lbfinanceserver.dbAccess.LeasedVehicleDBAccess;

/**
 *
 * @author Hasitha
 */
public class LeasedVehicleControllerImpl extends UnicastRemoteObject implements LeasedVehicleController {

    LeasedVehicleDBAccess leasedVehicleDBAccess=new LeasedVehicleDBAccess();
    
    public LeasedVehicleControllerImpl() throws RemoteException {
    }

    @Override
    public ArrayList<Leasing> searchLeasedVehicles(String text) throws RemoteException, ClassNotFoundException, SQLException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LeasedVehicle searchClientByRegistrationNo(String searchText) throws RemoteException, ClassNotFoundException, SQLException {
        return leasedVehicleDBAccess.searchClientAndLeasedVehicleByRegistrationNo(searchText);
    }

    @Override
    public LeasedVehicle searchClientByChassisNo(String searchText) throws RemoteException, ClassNotFoundException, SQLException {
        return leasedVehicleDBAccess.searchClientAndLeasedVehicleByChassisNo(searchText);
    }

    @Override
    public LeasedVehicle searchClientByEngineNo(String searchText) throws RemoteException, ClassNotFoundException, SQLException {
        return leasedVehicleDBAccess.searchClientAndLeasedVehicleByEngineNO(searchText);
    }

    @Override
    public boolean addLeasedVehicle(LeasedVehicle leasedVehicle) throws RemoteException, ClassNotFoundException, SQLException , FileNotFoundException{
        return leasedVehicleDBAccess.addLeasedVehicle(leasedVehicle);
    }

    @Override
    public LeasedVehicle searchLeasedVehicleForUpdate(String searchColumn, String searchKey) throws RemoteException, ClassNotFoundException, SQLException {
        return leasedVehicleDBAccess.searchLeasedVehicleForUpdate(searchColumn, searchKey);
    }

    @Override
    public ArrayList<LeasedVehicle> searchLeasedVehicleByLesseeId(String clientId) throws RemoteException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateLesaedVehicleWithSearch(String searchColumn, String searchKey) throws RemoteException, ClassNotFoundException, SQLException {
        return leasedVehicleDBAccess.updateLesaedVehicleWithSearch(searchColumn, searchKey);
    }
    
}
