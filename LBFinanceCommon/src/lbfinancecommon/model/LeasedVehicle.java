/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.model;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Hasitha
 */
public class LeasedVehicle implements Serializable {

    public String leasingNo;
    private String vehicleCategoryId;
    private String modelAndName;
    private String chassisNo;
    private String registrationNo;
    private String engineNo;
    private int manufacturedYear;
    private double estimatedPrice;
    private String colour;
    private double fuelUsed;
    private double cylinderCapacity;
    private double wheelBase;
    private String licensedDate;
    private Client clientDetails;
    private File vehiclePhoto;

    public LeasedVehicle() {
    }

    public LeasedVehicle(String leasingNo, String vehicleCategoryId, String modelAndName, String chassisNo, String registrationNo, String engineNo, int manufacturedYear, double estimatedPrice, String colour, double fuelUsed, double cylinderCapacity, double wheelBase, String licensedDate, File vehiclePhoto) {
        this.leasingNo = leasingNo;
        this.vehicleCategoryId = vehicleCategoryId;
        this.modelAndName = modelAndName;
        this.chassisNo = chassisNo;
        this.registrationNo = registrationNo;
        this.engineNo = engineNo;
        this.manufacturedYear = manufacturedYear;
        this.estimatedPrice = estimatedPrice;
        this.colour = colour;
        this.fuelUsed = fuelUsed;
        this.cylinderCapacity = cylinderCapacity;
        this.wheelBase = wheelBase;
        this.licensedDate = licensedDate;
        this.vehiclePhoto =vehiclePhoto;
    }

    /**
     * @return the leasingNo
     */
    public String getLeasingNo() {
        return leasingNo;
    }

    /**
     * @param leasingNo the leasingNo to set
     */
    public void setLeasingNo(String leasingNo) {
        this.leasingNo = leasingNo;
    }

    /**
     * @return the vehicleCategoryId
     */
    public String getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    /**
     * @param vehicleCategoryId the vehicleCategoryId to set
     */
    public void setVehicleCategoryId(String vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    /**
     * @return the modelAndName
     */
    public String getModelAndName() {
        return modelAndName;
    }

    /**
     * @param modelAndName the modelAndName to set
     */
    public void setModelAndName(String modelAndName) {
        this.modelAndName = modelAndName;
    }

    /**
     * @return the chassisNo
     */
    public String getChassisNo() {
        return chassisNo;
    }

    /**
     * @param chassisNo the chassisNo to set
     */
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    /**
     * @return the registrationNo
     */
    public String getRegistrationNo() {
        return registrationNo;
    }

    /**
     * @param registrationNo the registrationNo to set
     */
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    /**
     * @return the engineNo
     */
    public String getEngineNo() {
        return engineNo;
    }

    /**
     * @param engineNo the engineNo to set
     */
    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    /**
     * @return the manufacturedYear
     */
    public int getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * @param manufacturedYear the manufacturedYear to set
     */
    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    /**
     * @return the estimatedPrice
     */
    public double getEstimatedPrice() {
        return estimatedPrice;
    }

    /**
     * @param estimatedPrice the estimatedPrice to set
     */
    public void setEstimatedPrice(double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the fuelUsed
     */
    public double getFuelUsed() {
        return fuelUsed;
    }

    /**
     * @param fuelUsed the fuelUsed to set
     */
    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    /**
     * @return the cylinderCapacity
     */
    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * @return the wheelBase
     */
    public double getWheelBase() {
        return wheelBase;
    }

    /**
     * @param wheelBase the wheelBase to set
     */
    public void setWheelBase(double wheelBase) {
        this.wheelBase = wheelBase;
    }

    /**
     * @return the licensedDate
     */
    public String getLicensedDate() {
        return licensedDate;
    }

    /**
     * @param licensedDate the licensedDate to set
     */
    public void setLicensedDate(String licensedDate) {
        this.licensedDate = licensedDate;
    }

    public Client getClientDetails() {
        return clientDetails;
    }
    
    public void setClientDetails(Client clientDetails) {
        this.clientDetails = clientDetails;
    }

    /**
     * @return the vehiclePhoto
     */
    public File getVehiclePhoto() {
        return vehiclePhoto;
    }

    /**
     * @param vehiclePhoto the vehiclePhoto to set
     */
    public void setVehiclePhoto(File vehiclePhoto) {
        this.vehiclePhoto = vehiclePhoto;
    }
}
