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
public class Leasing implements Serializable {

    private String leasingNo;
    private String clientId;
    private int noOfPayments;
    private double leasingCapital;
    private String commenceDate;
    private String endDate;
    private double downPayment;
    private double rentalFee;
    private String dueDate;
    private LeasedVehicle leasedVehicle;

    public Leasing() {
    }

    public Leasing(String leasingNo, String clientId, int noOfPayments, double leasingCapital, String commenceDate, String endDate, double downPayment, double rentalFee, String dueDate) {
        this.leasingNo = leasingNo;
        this.clientId = clientId;
        this.noOfPayments = noOfPayments;
        this.leasingCapital = leasingCapital;
        this.commenceDate = commenceDate;
        this.endDate = endDate;
        this.downPayment = downPayment;
        this.rentalFee = rentalFee;
        this.dueDate = dueDate;
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
     * @return the clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * @return the noOfPayments
     */
    public int getNoOfPayments() {
        return noOfPayments;
    }

    /**
     * @param noOfPayments the noOfPayments to set
     */
    public void setNoOfPayments(int noOfPayments) {
        this.noOfPayments = noOfPayments;
    }

    /**
     * @return the leasingCapital
     */
    public double getLeasingCapital() {
        return leasingCapital;
    }

    /**
     * @param leasingCapital the leasingCapital to set
     */
    public void setLeasingCapital(double leasingCapital) {
        this.leasingCapital = leasingCapital;
    }

    /**
     * @return the commenceDate
     */
    public String getCommenceDate() {
        return commenceDate;
    }

    /**
     * @param commenceDate the commenceDate to set
     */
    public void setCommenceDate(String commenceDate) {
        this.commenceDate = commenceDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the downPayment
     */
    public double getDownPayment() {
        return downPayment;
    }

    /**
     * @param downPayment the downPayment to set
     */
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    /**
     * @return the rentalFee
     */
    public double getRentalFee() {
        return rentalFee;
    }

    /**
     * @param rentalFee the rentalFee to set
     */
    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
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

    /**
     * @return the leasedVehicle
     */
    public LeasedVehicle getLeasedVehicle() {
        return leasedVehicle;
    }

    /**
     * @param leasedVehicle the leasedVehicle to set
     */
    public void setLeasedVehicle(LeasedVehicle leasedVehicle) {
        this.leasedVehicle = leasedVehicle;
    }
}
