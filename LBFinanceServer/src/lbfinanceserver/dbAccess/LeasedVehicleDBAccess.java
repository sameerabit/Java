/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lbfinancecommon.model.Client;
import lbfinancecommon.model.LeasedVehicle;

/**
 *
 * @author Hasitha
 */
public class LeasedVehicleDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static LeasingDBAccess leasingDBAccess = new LeasingDBAccess();

    public LeasedVehicle searchClientAndLeasedVehicleByRegistrationNo(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "";
        ResultSet executeQuery = createStatement.executeQuery(sql);

        LeasedVehicle leasedVehicle = new LeasedVehicle();

        while (executeQuery.next()) {
            leasedVehicle.setLeasingNo(executeQuery.getString("leasingNo"));
            leasedVehicle.setChassisNo(executeQuery.getString("chassisno"));
            leasedVehicle.setColour(executeQuery.getString("colour"));
            leasedVehicle.setCylinderCapacity(executeQuery.getDouble("cylindercapacity"));
            leasedVehicle.setEngineNo(executeQuery.getString("engineno"));
            leasedVehicle.setEstimatedPrice(executeQuery.getDouble("estimatedprice"));
            leasedVehicle.setFuelUsed(executeQuery.getDouble("fuelused"));
            leasedVehicle.setLicensedDate(executeQuery.getString("licenseddate"));
            leasedVehicle.setManufacturedYear(executeQuery.getInt("manufacturedyear"));
            leasedVehicle.setModelAndName(executeQuery.getString("modelandname"));
            leasedVehicle.setRegistrationNo(executeQuery.getString("registrationo"));
            leasedVehicle.setVehicleCategoryId(executeQuery.getString("vehiclecategoryid"));
            leasedVehicle.setWheelBase(executeQuery.getDouble("wheelbase"));
        }

        Client client = leasingDBAccess.searchClientByLeasingNo(leasedVehicle.getLeasingNo());
        leasedVehicle.setClientDetails(client);

        return leasedVehicle;
    }

    public LeasedVehicle searchClientAndLeasedVehicleByChassisNo(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "";
        ResultSet executeQuery = createStatement.executeQuery(sql);

        LeasedVehicle leasedVehicle = new LeasedVehicle();

        while (executeQuery.next()) {
            leasedVehicle.setLeasingNo(executeQuery.getString("leasingNo"));
            leasedVehicle.setChassisNo(executeQuery.getString("chassisno"));
            leasedVehicle.setColour(executeQuery.getString("colour"));
            leasedVehicle.setCylinderCapacity(executeQuery.getDouble("cylindercapacity"));
            leasedVehicle.setEngineNo(executeQuery.getString("engineno"));
            leasedVehicle.setEstimatedPrice(executeQuery.getDouble("estimatedprice"));
            leasedVehicle.setFuelUsed(executeQuery.getDouble("fuelused"));
            leasedVehicle.setLicensedDate(executeQuery.getString("licenseddate"));
            leasedVehicle.setManufacturedYear(executeQuery.getInt("manufacturedyear"));
            leasedVehicle.setModelAndName(executeQuery.getString("modelandname"));
            leasedVehicle.setRegistrationNo(executeQuery.getString("registrationo"));
            leasedVehicle.setVehicleCategoryId(executeQuery.getString("vehiclecategoryid"));
            leasedVehicle.setWheelBase(executeQuery.getDouble("wheelbase"));
        }

        Client client = leasingDBAccess.searchClientByLeasingNo(leasedVehicle.getLeasingNo());
        leasedVehicle.setClientDetails(client);

        return leasedVehicle;
    }

    public LeasedVehicle searchClientAndLeasedVehicleByEngineNO(String searchText) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "";
        ResultSet executeQuery = createStatement.executeQuery(sql);

        LeasedVehicle leasedVehicle = new LeasedVehicle();

        while (executeQuery.next()) {
            leasedVehicle.setLeasingNo(executeQuery.getString("leasingNo"));
            leasedVehicle.setChassisNo(executeQuery.getString("chassisno"));
            leasedVehicle.setColour(executeQuery.getString("colour"));
            leasedVehicle.setCylinderCapacity(executeQuery.getDouble("cylindercapacity"));
            leasedVehicle.setEngineNo(executeQuery.getString("engineno"));
            leasedVehicle.setEstimatedPrice(executeQuery.getDouble("estimatedprice"));
            leasedVehicle.setFuelUsed(executeQuery.getDouble("fuelused"));
            leasedVehicle.setLicensedDate(executeQuery.getString("licenseddate"));
            leasedVehicle.setManufacturedYear(executeQuery.getInt("manufacturedyear"));
            leasedVehicle.setModelAndName(executeQuery.getString("modelandname"));
            leasedVehicle.setRegistrationNo(executeQuery.getString("registrationo"));
            leasedVehicle.setVehicleCategoryId(executeQuery.getString("vehiclecategoryid"));
            leasedVehicle.setWheelBase(executeQuery.getDouble("wheelbase"));
        }

        Client client = leasingDBAccess.searchClientByLeasingNo(leasedVehicle.getLeasingNo());
        leasedVehicle.setClientDetails(client);

        return leasedVehicle;
    }

    public boolean addLeasedVehicle(LeasedVehicle leasedVehicle) throws SQLException, ClassNotFoundException, FileNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO LEASEDVEHICLE(leasingno,vehiclecategoryid,modelandname,chassisno,registrationno,engineno,manufacturedyear,estimatedprice,colour,fuelused,cylindercapacity,wheelbase,licenseddate,vehiclephoto) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        statement.setString(1, leasedVehicle.getLeasingNo());
        statement.setString(2, leasedVehicle.getVehicleCategoryId());
        statement.setString(3, leasedVehicle.getModelAndName());
        statement.setString(4, leasedVehicle.getChassisNo());
        statement.setString(5, leasedVehicle.getRegistrationNo());
        statement.setString(6, leasedVehicle.getEngineNo());
        statement.setInt(7, leasedVehicle.getManufacturedYear());
        statement.setDouble(8, leasedVehicle.getEstimatedPrice());
        statement.setString(9, leasedVehicle.getColour());
        statement.setDouble(10, leasedVehicle.getFuelUsed());
        statement.setDouble(11, leasedVehicle.getCylinderCapacity());
        statement.setDouble(12, leasedVehicle.getWheelBase());
        statement.setString(13, leasedVehicle.getLicensedDate());
        File f = leasedVehicle.getVehiclePhoto();
        FileInputStream fis = new FileInputStream(f);
        statement.setBinaryStream(14, (InputStream) fis, (int) (f.length()));
        
        int res = statement.executeUpdate();
        if(res == 1){
            return true;
        }else{
            return false;
        }
    }

    public LeasedVehicle searchLeasedVehicleForUpdate(String searchColumn, String searchKey) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement creatStatement = connection.createStatement();
        String sql = "";
        
        ResultSet executeQuery = creatStatement.executeQuery(sql);
        LeasedVehicle leasedVehicle = new LeasedVehicle();
        while(executeQuery.next()){
            leasedVehicle.setLeasingNo(executeQuery.getString("leasingNo"));
            leasedVehicle.setChassisNo(executeQuery.getString("chassisno"));
            leasedVehicle.setColour(executeQuery.getString("colour"));
            leasedVehicle.setCylinderCapacity(executeQuery.getDouble("cylindercapacity"));
            leasedVehicle.setEngineNo(executeQuery.getString("engineno"));
            leasedVehicle.setEstimatedPrice(executeQuery.getDouble("estimatedprice"));
            leasedVehicle.setFuelUsed(executeQuery.getDouble("fuelused"));
            leasedVehicle.setLicensedDate(executeQuery.getString("licenseddate"));
            leasedVehicle.setManufacturedYear(executeQuery.getInt("manufacturedyear"));
            leasedVehicle.setModelAndName(executeQuery.getString("modelandname"));
            leasedVehicle.setRegistrationNo(executeQuery.getString("registrationo"));
            leasedVehicle.setVehicleCategoryId(executeQuery.getString("vehiclecategoryid"));
            leasedVehicle.setWheelBase(executeQuery.getDouble("wheelbase"));
        }
        
        return leasedVehicle;
    }

    public boolean updateLesaedVehicleWithSearch(String searchColumn, String searchKey) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "";
        int res = createStatement.executeUpdate(sql);
        
        if(res == 1){
            return true;
        }else{
            return false;
        }
    }
}
