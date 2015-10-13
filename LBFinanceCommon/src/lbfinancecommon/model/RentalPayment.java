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
public class RentalPayment implements Serializable {

    private String leasingNo;
    private double rentalArrears;
    private double percentOfRcvd;
    private double totalArrears;
    private double rentalOd;
    private double sundryOd;
    private String paidDate;
    private String paidTime;
    private double rentalFee;
    private double totalLeasedCost;
    private double total;
    private double rentalOdInterest;

    public RentalPayment() {
    }

    public RentalPayment(String leasingNo, double rentalArrears, double percentOfRcvd, double totalArrears, double rentalOd, double sundryOd, String paidDate, String paidTime) {
        this.leasingNo = leasingNo;
        this.rentalArrears = rentalArrears;
        this.percentOfRcvd = percentOfRcvd;
        this.totalArrears = totalArrears;
        this.rentalOd = rentalOd;
        this.sundryOd = sundryOd;
        this.paidDate = paidDate;
        this.paidTime = paidTime;
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
     * @return the rentalArrears
     */
    public double getRentalArrears() {
        return rentalArrears;
    }

    /**
     * @param rentalArrears the rentalArrears to set
     */
    public void setRentalArrears(double rentalArrears) {
        this.rentalArrears = rentalArrears;
    }

    /**
     * @return the percentOfRcvd
     */
    public double getPercentOfRcvd() {
        return percentOfRcvd;
    }

    /**
     * @param percentOfRcvd the percentOfRcvd to set
     */
    public void setPercentOfRcvd(double percentOfRcvd) {
        this.percentOfRcvd = percentOfRcvd;
    }

    /**
     * @return the totalArrears
     */
    public double getTotalArrears() {
        return totalArrears;
    }

    /**
     * @param totalArrears the totalArrears to set
     */
    public void setTotalArrears(double totalArrears) {
        this.totalArrears = totalArrears;
    }

    /**
     * @return the rentalOd
     */
    public double getRentalOd() {
        return rentalOd;
    }

    /**
     * @param rentalOd the rentalOd to set
     */
    public void setRentalOd(double rentalOd) {
        this.rentalOd = rentalOd;
    }

    /**
     * @return the sundryOd
     */
    public double getSundryOd() {
        return sundryOd;
    }

    /**
     * @param sundryOd the sundryOd to set
     */
    public void setSundryOd(double sundryOd) {
        this.sundryOd = sundryOd;
    }

    /**
     * @return the paidDate
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * @param paidDate the paidDate to set
     */
    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    /**
     * @return the paidTime
     */
    public String getPaidTime() {
        return paidTime;
    }

    /**
     * @param paidTime the paidTime to set
     */
    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
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
     * @return the totalLeasedCost
     */
    public double getTotalLeasedCost() {
        return totalLeasedCost;
    }

    /**
     * @param totalLeasedCost the totalLeasedCost to set
     */
    public void setTotalLeasedCost(double totalLeasedCost) {
        this.totalLeasedCost = totalLeasedCost;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the rentalOdInterest
     */
    public double getRentalOdInterest() {
        return rentalOdInterest;
    }

    /**
     * @param rentalOdInterest the rentalOdInterest to set
     */
    public void setRentalOdInterest(double rentalOdInterest) {
        this.rentalOdInterest = rentalOdInterest;
    }
}
