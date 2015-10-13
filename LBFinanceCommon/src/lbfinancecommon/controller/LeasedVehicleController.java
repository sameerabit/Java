/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.io.FileNotFoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.LeasedVehicle;
import lbfinancecommon.model.Leasing;

/**
 *
 * @author Hasitha
 */
public interface LeasedVehicleController extends Remote {

    public ArrayList<Leasing> searchLeasedVehicles(String text) throws RemoteException, ClassNotFoundException, SQLException;

    public LeasedVehicle searchClientByRegistrationNo(String searchText) throws RemoteException, ClassNotFoundException, SQLException;

    public LeasedVehicle searchClientByChassisNo(String searchText) throws RemoteException, ClassNotFoundException, SQLException;

    public LeasedVehicle searchClientByEngineNo(String searchText) throws RemoteException, ClassNotFoundException, SQLException;

    public boolean addLeasedVehicle(LeasedVehicle leasedVehicle) throws RemoteException, ClassNotFoundException, SQLException, FileNotFoundException;

    public LeasedVehicle searchLeasedVehicleForUpdate(String searchColumn, String searchKey) throws RemoteException, ClassNotFoundException, SQLException;

    public ArrayList<LeasedVehicle> searchLeasedVehicleByLesseeId(String clientId) throws RemoteException, ClassNotFoundException, SQLException;

    public boolean updateLesaedVehicleWithSearch(String searchColumn, String searchKey) throws RemoteException, ClassNotFoundException, SQLException;
}
