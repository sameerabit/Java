/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.VehicleCategory;

/**
 *
 * @author Hasitha
 */
public interface VehicleCategoryController extends Remote{

    public boolean addVehicleCategory(VehicleCategory vehicleCategory) throws RemoteException, SQLException, ClassNotFoundException;

    public ArrayList<String> getAllCategoryIds() throws RemoteException, SQLException, ClassNotFoundException;

    public VehicleCategory searchCategory(String searchText) throws RemoteException, SQLException, ClassNotFoundException;
    
}
