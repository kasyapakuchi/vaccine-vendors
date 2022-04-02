package com.vendor.service;

import java.util.ArrayList;
import java.util.List;

import com.vendor.model.VaccineVendors;

import org.springframework.stereotype.Service;

@Service
public class VendorService {

    public List<VaccineVendors> getVaccineVendors(String vendorId) {
        return new ArrayList<VaccineVendors>();
    }
    
}
