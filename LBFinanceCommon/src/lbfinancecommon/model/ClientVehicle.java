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
public class ClientVehicle implements Serializable {

    private String clientId;
    private String clientVehicleId;
    private String typeNameAndModel;
    private double purchasedPrice;
    private double marketValue;
    private String mortgageStatus;

    public ClientVehicle() {
    }

    public ClientVehicle(String clientId, String clientVehicleId, String typeNameAndModel, double purchasedPrice, double marketValue, String mortgageStatus) {
        this.clientId = clientId;
        this.clientVehicleId = clientVehicleId;
        this.typeNameAndModel = typeNameAndModel;
        this.purchasedPrice = purchasedPrice;
        this.marketValue = marketValue;
        this.mortgageStatus = mortgageStatus;
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
     * @return the clientVehicleId
     */
    public String getClientVehicleId() {
        return clientVehicleId;
    }

    /**
     * @param clientVehicleId the clientVehicleId to set
     */
    public void setClientVehicleId(String clientVehicleId) {
        this.clientVehicleId = clientVehicleId;
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
     * @return the marketValue
     */
    public double getMarketValue() {
        return marketValue;
    }

    /**
     * @param marketValue the marketValue to set
     */
    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
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
