package com.vendor.controller;

import java.util.List;

import com.vendor.model.VaccineVendors;
import com.vendor.service.VendorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {

    @Autowired
    VendorService service;

    @GetMapping
    public ResponseEntity<List<VaccineVendors>> getVaccineVendors(@PathVariable("id") String vendorId){
        List<VaccineVendors> vaccinesList = service.getVaccineVendors(vendorId);
        return new ResponseEntity<>(vaccinesList,HttpStatus.OK);
    }

}