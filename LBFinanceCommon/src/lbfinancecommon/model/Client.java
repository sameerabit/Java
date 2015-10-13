/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hasitha
 */
public class Client implements Serializable {

    private String clientId;
    private String recoveryOfficerId;
    private String marketingOfficerId;
    private String name;
    private String nic;
    private String occupation;
    private String privateAddress;
    private String officialAddress;
    private String contactNo;
    private String organizationType;
    private String residentDuration;
    private String statusInPvtAddress;
    private String citizenship;
    public int age;
    private String maritalStatus;
    private String incomeSource;
    private double totalMonthlyIncome;
    private ArrayList<Leasing> leasings;
    private ArrayList<Guarentor> guarantors;

    public Client() {
    }

    public Client(String clientId, String recoveryOfficerId, String marketingOfficerId, String name, String nic, String occupation, String privateAddress, String officialAddress, String contactNo, String organizationType, String residentDuration, String statusInPvtAddress, String citizenship, int age, String maritalStatus, String incomeSource, double totalMonthlyIncome) {
        this.clientId = clientId;
        this.recoveryOfficerId = recoveryOfficerId;
        this.marketingOfficerId = marketingOfficerId;
        this.name = name;
        this.nic = nic;
        this.occupation = occupation;
        this.privateAddress = privateAddress;
        this.officialAddress = officialAddress;
        this.contactNo = contactNo;
        this.organizationType = organizationType;
        this.residentDuration = residentDuration;
        this.statusInPvtAddress = statusInPvtAddress;
        this.citizenship = citizenship;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.incomeSource = incomeSource;
        this.totalMonthlyIncome = totalMonthlyIncome;
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
     * @return the marketingOfficerId
     */
    public String getMarketingOfficerId() {
        return marketingOfficerId;
    }

    /**
     * @param marketingOfficerId the marketingOfficerId to set
     */
    public void setMarketingOfficerId(String marketingOfficerId) {
        this.marketingOfficerId = marketingOfficerId;
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
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the privateAddress
     */
    public String getPrivateAddress() {
        return privateAddress;
    }

    /**
     * @param privateAddress the privateAddress to set
     */
    public void setPrivateAddress(String privateAddress) {
        this.privateAddress = privateAddress;
    }

    /**
     * @return the officialAddress
     */
    public String getOfficialAddress() {
        return officialAddress;
    }

    /**
     * @param officialAddress the officialAddress to set
     */
    public void setOfficialAddress(String officialAddress) {
        this.officialAddress = officialAddress;
    }

    /**
     * @return the organizationType
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * @param organizationType the organizationType to set
     */
    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    /**
     * @return the residentDuration
     */
    public String getResidentDuration() {
        return residentDuration;
    }

    /**
     * @param residentDuration the residentDuration to set
     */
    public void setResidentDuration(String residentDuration) {
        this.residentDuration = residentDuration;
    }

    /**
     * @return the statusInPvtAddress
     */
    public String getStatusInPvtAddress() {
        return statusInPvtAddress;
    }

    /**
     * @param statusInPvtAddress the statusInPvtAddress to set
     */
    public void setStatusInPvtAddress(String statusInPvtAddress) {
        this.statusInPvtAddress = statusInPvtAddress;
    }

    /**
     * @return the citizenship
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * @param citizenship the citizenship to set
     */
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the incomeSource
     */
    public String getIncomeSource() {
        return incomeSource;
    }

    /**
     * @param incomeSource the incomeSource to set
     */
    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    /**
     * @return the totalMonthlyIncome
     */
    public double getTotalMonthlyIncome() {
        return totalMonthlyIncome;
    }

    /**
     * @param totalMonthlyIncome the totalMonthlyIncome to set
     */
    public void setTotalMonthlyIncome(double totalMonthlyIncome) {
        this.totalMonthlyIncome = totalMonthlyIncome;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public ArrayList<Leasing> getLeasingList() {
        return leasings;
    }
    
    public void setLeasingList(ArrayList<Leasing> leasings) {
        this.leasings = leasings;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
