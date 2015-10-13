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
public class VehicleCategory implements Serializable {

    private String vehicleCategoryId;
    private String description;

    public VehicleCategory() {
    }

    public VehicleCategory(String vehicleCategoryId, String description) {
        this.vehicleCategoryId = vehicleCategoryId;
        this.description = description;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
