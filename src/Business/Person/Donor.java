/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Organ.Organ;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vidyavathipuli
 */
public class Donor {
    int donorId;
    private String donorName;
    private String state;
    private String zipcode;
    private String SSN;
    private String lastName;
    private String middleName;
    private int age;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public ArrayList<Organ> getOrganDirectory() {
        return organDirectory;
    }

    public void setOrganDirectory(ArrayList<Organ> organDirectory) {
        this.organDirectory = organDirectory;
    }
    private String gender;
    private String bloodGroup;
    private String contactNum;
    private String address;
    private String city;
    private String sign;
    private String emailAdd;
    private String date;
    private String network;
    private String pocName;
    private String pocContact;
    private boolean isOrganAvaiNow;
    List<String> organs;
    private ArrayList<Organ> organDirectory = new ArrayList<Organ>();

     public boolean getIsOrganAvailableNow() {
        return isOrganAvaiNow;
    }

    public void setIsOrganAvailableNow(boolean isOrganAvaiNow) {
        this.isOrganAvaiNow = isOrganAvaiNow;
    }
    
    public List<String> getOrgans() {
        return organs;
    }

    public void setOrgans(List<String> organs) {
        this.organs = organs;
    }
    
    /**
     * @return the pocName
     */
    public String getPocName() {
        return pocName;
    }

    
    public void setPocName(String pocName) {
        this.pocName = pocName;
    }

     
    public String getPocContact() {
        return pocContact;
    }

    
    public int getDonorId() {
        return donorId;
    }

     
    public void setDonorId(int donorId) {    
        this.donorId = donorId;
    }

    public void setPocContact(String pocContact) {
        this.pocContact = pocContact;
    }
    
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    
    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the donorName
     */
    public String getDonorName() {
        return donorName;
    }

    /**
     * @param donorName the donorName to set
     */
    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }
 
    public int getAge() {
        return age;
    }

     
    public void setAge(int age) {
        this.age = age;
    }

     
    public String getGender() {
        return gender;
    }

     
    public void setGender(String gender) {
        this.gender = gender;
    }

     
    public String getBloodGroup() {
        return bloodGroup;
    }

      
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

     
    public String getContactNum() {
        return contactNum;
    }

     
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

     
    public String getAddress() {
        return address;
    }

     
    public void setAddress(String address) {
        this.address = address;
    }

     
    public String getSign() {
        return sign;
    }

     
    public void setSign(String sign) {
        this.sign = sign;
    }
    
    @Override
    public String toString() {
        return this.getDonorName();
    }
}
