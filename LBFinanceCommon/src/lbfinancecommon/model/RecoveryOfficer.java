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
public class RecoveryOfficer implements Serializable{

    private String recoveryOfficerId;
    private String name;
    private String nic;
    private String address;
    private String telNo;

    public RecoveryOfficer() {
    }

    public RecoveryOfficer(String recoveryOfficerId, String name, String nic, String address, String telNo) {
        this.recoveryOfficerId = recoveryOfficerId;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.telNo = telNo;
    }

    /**
     * @return the recoveryOfficerId
     */
    public String getRecoveryOfficerId() {
        return recoveryOfficerId;
    }

    /**
     * @param recoveryOfficerId the recoveryOfficerId to set
     */
    public void setRecoveryOfficerId(String recoveryOfficerId) {
        this.recoveryOfficerId = recoveryOfficerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
