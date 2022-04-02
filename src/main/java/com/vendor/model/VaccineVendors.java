package com.vendor.model;

import javax.persistence.Entity;

public class VaccineVendors {

    private String vaccineId;
    private String vendorId;
    private String vaccineName;
    private String vendorName;
    private String location;
    private String city;
    private int availableCount;
    private String expiryDate;

    public String getVaccineId() {
        return vaccineId;
    }
    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }
    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    public int getAvailableCount() {
        return availableCount;
    }
    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    

    
}
