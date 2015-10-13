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
public class Guarentor implements Serializable {

    private String leasingNo;
    private String guarentorId;
    private String guarentorName;
    private String nic;
    private String occupation;
    private String privateAddress;
    private String officialAddress;
    private String contactNo;
    private String organizationType;
    private String residentDuration;
    private String statusInPvtAddress;
    private String citizenship;
    private String maritalStatus;
    private String incomeSource;
    private double totalMonthlyIncome;
    public int age;

    public Guarentor() {
    }

    public Guarentor(String leasingNo, String guarentorId, String guarentorName, String nic, String occupation, String privateAddress, String officialAddress, String contactNo, String organizationType, String residentDuration, String statusInPvtAddress, String citizenship, int age, String maritalStatus, String incomeSource, double totalMonthlyIncome) {
        this.leasingNo = leasingNo;
        this.guarentorId = guarentorId;
        this.guarentorName = guarentorName;
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
     * @return the guarentorName
     */
    public String getGuarentorName() {
        return guarentorName;
    }

    /**
     * @param guarentorName the guarentorName to set
     */
    public void setGuarentorName(String guarentorName) {
        this.guarentorName = guarentorName;
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
