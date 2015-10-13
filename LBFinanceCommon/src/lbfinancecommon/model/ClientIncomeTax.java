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
public class ClientIncomeTax implements Serializable {

    private String clientId;
    private int year;
    private double taxableIncome;
    private double taxPaid;

    public ClientIncomeTax() {
    }

    public ClientIncomeTax(String clientId, int year, double taxableIncome, double taxPaid) {
        this.clientId = clientId;
        this.year = year;
        this.taxableIncome = taxableIncome;
        this.taxPaid = taxPaid;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the taxableIncome
     */
    public double getTaxableIncome() {
        return taxableIncome;
    }

    /**
     * @param taxableIncome the taxableIncome to set
     */
    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    /**
     * @return the taxPaid
     */
    public double getTaxPaid() {
        return taxPaid;
    }

    /**
     * @param taxPaid the taxPaid to set
     */
    public void setTaxPaid(double taxPaid) {
        this.taxPaid = taxPaid;
    }
}
