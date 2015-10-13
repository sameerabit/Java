/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.model;

import java.io.Serializable;

/**
 *
 * @author Hasitha
 */
public class Insurance implements Serializable {

    private String insuranceNo;
    private String vehicleId;
    private double policyFee;
    private String dueDate;

    public Insurance() {
    }

    public Insurance(String insuranceNo, String vehicleId, double policyFee, String dueDate) {
        this.insuranceNo = insuranceNo;
        this.vehicleId = vehicleId;
        this.policyFee = policyFee;
        this.dueDate = dueDate;
    }

    /**
     * @return the insuranceNo
     */
    public String getInsuranceNo() {
        return insuranceNo;
    }

    /**
     * @param insuranceNo the insuranceNo to set
     */
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    /**
     * @return the vehicleId
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * @param vehicleId the vehicleId to set
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * @return the policyFee
     */
    public double getPolicyFee() {
        return policyFee;
    }

    /**
     * @param policyFee the policyFee to set
     */
    public void setPolicyFee(double policyFee) {
        this.policyFee = policyFee;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
