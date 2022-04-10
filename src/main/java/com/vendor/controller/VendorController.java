package com.vendor.controller;

import java.util.List;

import com.vendor.model.VaccineVendors;
import com.vendor.model.Vaccines;
import com.vendor.service.VendorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/vendors")
public class VendorController {

    @Autowired
    VendorService service;

    @GetMapping(value="/{vaccineid}/{vendorid}")
    public List<Vaccines> getListByVaccinesVendors(@PathVariable("vaccineid") String vaccineId ,@PathVariable("vendorid") String vendorId ){
        return service.getVaccineVendors(vaccineId,vendorId);
    }

    @PostMapping(value="update/{vaccineid}/{vendorid}")
    public void updateVaccineStock(@PathVariable("vaccineid") String vaccineId ,@PathVariable("vendorid") String vendorId ){
        service.updateVaccineStock(vaccineId,vendorId);
    }

    @GetMapping(value="vaccineId/{vaccineid}")
    public List<Vaccines> getListByVaccineId(@PathVariable("vaccineid") String vaccineId){
        return service.getListByVaccineId(vaccineId);
    }

    @GetMapping(value="vendorId/{vendorid}")
    public List<Vaccines> getListByVendorId(@PathVariable("vendorid") String vendorId){
        return service.getListByVendorId(vendorId);
    }

}