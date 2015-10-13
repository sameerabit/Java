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
public class GuarentorVehicle implements Serializable {

    private String guarentorId;
    private String guarentorVehicleId;
    private String typeNameAndModel;
    private double purchasedPrice;
    private double marketPrice;
    private String mortgageStatus;

    public GuarentorVehicle() {
    }

    public GuarentorVehicle(String guarentorId, String guarentorVehicleId, String typeNameAndModel, double purchasedPrice, double marketPrice, String mortgageStatus) {
        this.guarentorId = guarentorId;
        this.guarentorVehicleId = guarentorVehicleId;
        this.typeNameAndModel = typeNameAndModel;
        this.purchasedPrice = purchasedPrice;
        this.marketPrice = marketPrice;
        this.mortgageStatus = mortgageStatus;
    }

    /**
     * @return the guarentorId
     */
    public String getGuarentorId() {
        return guarentorId;
    }

    /**
     * @param guarentorId the guarentorId to set
     */
    public void setGuarentorId(String guarentorId) {
        this.guarentorId = guarentorId;
    }

    /**
     * @return the guarentorVehicleId
     */
    public String getGuarentorVehicleId() {
        return guarentorVehicleId;
    }

    /**
     * @param guarentorVehicleId the guarentorVehicleId to set
     */
    public void setGuarentorVehicleId(String guarentorVehicleId) {
        this.guarentorVehicleId = guarentorVehicleId;
    }

    /**
     * @return the typeNameAndModel
     */
    public String getTypeNameAndModel() {
        return typeNameAndModel;
    }

    /**
     * @param typeNameAndModel the typeNameAndModel to set
     */
    public void setTypeNameAndModel(String typeNameAndModel) {
        this.typeNameAndModel = typeNameAndModel;
    }

    /**
     * @return the purchasedPrice
     */
    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    /**
     * @param purchasedPrice the purchasedPrice to set
     */
    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    /**
     * @return the marketPrice
     */
    public double getMarketPrice() {
        return marketPrice;
    }

    /**
     * @param marketPrice the marketPrice to set
     */
    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * @return the mortgageStatus
     */
    public String getMortgageStatus() {
        return mortgageStatus;
    }

    /**
     * @param mortgageStatus the mortgageStatus to set
     */
    public void setMortgageStatus(String mortgageStatus) {
        this.mortgageStatus = mortgageStatus;
    }
}
