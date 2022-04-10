package com.vendor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccines", schema="vaccinevendor")
public class Vaccines {

    @Id
    private String vaccine_id;
    private String vendor_id;
    private String vaccine_name;
    private int available_count;
    public String getVaccine_id() {
        return vaccine_id;
    }
    public void setVaccine_id(String vaccine_id) {
        this.vaccine_id = vaccine_id;
    }
    public String getVendor_id() {
        return vendor_id;
    }
    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }
    public String getVaccine_name() {
        return vaccine_name;
    }
    public void setVaccine_name(String vaccine_name) {
        this.vaccine_name = vaccine_name;
    }
    public int getAvailable_count() {
        return available_count;
    }
    public void setAvailable_count(int available_count) {
        this.available_count = available_count;
    }
    public Date getExp_date() {
        return exp_date;
    }
    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }
    private Date exp_date; 
    
    
    
}
