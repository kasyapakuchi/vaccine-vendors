package com.vendor.service;

import java.util.List;

import com.vendor.model.Vaccines;
import com.vendor.repository.VaccinesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

    @Autowired
    VaccinesRepository repository;

    public List<Vaccines> getVaccineVendors(String vaccineId, String vendorId) {
        return repository.getVaccineByVaccineIdAndVendorId(vaccineId, vendorId);
    }

    public void updateVaccineStock(String vaccineId, String vendorId) {
        repository.updateVaccineStock(vaccineId, vendorId);
    }

    public List<Vaccines> getListByVaccineId(String vaccineId) {
        return repository.getVaccineByVaccineId(vaccineId);
    }

    public List<Vaccines> getListByVendorId(String vendorId) {
        return repository.getVaccineByVendorId(vendorId);
    }
    
}
