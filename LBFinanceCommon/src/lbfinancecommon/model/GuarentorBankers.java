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
public class GuarentorBankers implements Serializable {

    private String guarentorId;
    private String bankName;
    private String address;
    private String accountNo;

    public GuarentorBankers() {
    }

    public GuarentorBankers(String guarentorId, String bankName, String address, String accountNo) {
        this.guarentorId = guarentorId;
        this.bankName = bankName;
        this.address = address;
        this.accountNo = accountNo;
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
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
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
     * @return the accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
