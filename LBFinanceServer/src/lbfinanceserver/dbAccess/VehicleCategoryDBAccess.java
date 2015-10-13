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
import lbfinancecommon.model.VehicleCategory;

/**
 *
 * @author Hasitha
 */
public class VehicleCategoryDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addVehicleCAtegory(VehicleCategory vehicleCategory) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "INSERT INTO VEHICLECATEGORY(vehiclecategoryid, description) values('" + vehicleCategory.getVehicleCategoryId() + "','" + vehicleCategory.getDescription() + "');";
        int res = createStatement.executeUpdate(sql);
        if (res == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> getAllCategoryIds() throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql= "SELECT vehiclecategoryid FROM VEHICLECATEGORY ORDER BY vehiclecategoryid;";
        ResultSet set = createStatement.executeQuery(sql);
        
        ArrayList<String> categories = new ArrayList<String>();
        while(set.next()){
            categories.add(set.getString("vehiclecategoryid"));
        }
        return categories;
    }

    public VehicleCategory searchCategory(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql= "SELECT description FROM VEHICLECATEGORY where vehiclecategoryid = '"+searchText+"';";
        ResultSet set = createStatement.executeQuery(sql);
        
        VehicleCategory category = new VehicleCategory();
        
        while(set.next()){
            category.setDescription(set.getString("description"));
        }
        return category;
    }
}
