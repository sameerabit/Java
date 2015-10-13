/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.VehicleCategoryController;
import lbfinancecommon.model.VehicleCategory;
import lbfinanceserver.dbAccess.VehicleCategoryDBAccess;

/**
 *
 * @author Hasitha
 */
public class VehicleCategoryControllerImpl extends UnicastRemoteObject implements VehicleCategoryController {

    private VehicleCategoryDBAccess dBAccess = new VehicleCategoryDBAccess();

    public VehicleCategoryControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addVehicleCategory(VehicleCategory vehicleCategory)  throws RemoteException, SQLException, ClassNotFoundException{
        return dBAccess.addVehicleCAtegory(vehicleCategory);
    }

    @Override
    public ArrayList<String> getAllCategoryIds() throws RemoteException, SQLException, ClassNotFoundException {
        return dBAccess.getAllCategoryIds();
    }

    @Override
    public VehicleCategory searchCategory(String searchText) throws RemoteException, SQLException, ClassNotFoundException {
        return dBAccess.searchCategory(searchText);
    }
}
