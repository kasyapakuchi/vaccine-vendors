package com.vendor.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.vendor.model.Vaccines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface VaccinesRepository extends JpaRepository<Vaccines,String>{

    @Query(value = "select v from Vaccines v where v.vaccine_id =?1 and v.vendor_id = ?2")
    public List<Vaccines> getVaccineByVaccineIdAndVendorId(String vaccineId, String VendorId);

    @Modifying
    @Transactional
    @Query(value="update Vaccines v set v.available_count=v.available_count-1 where v.vaccine_id =?1 and v.vendor_id = ?2")
    public void updateVaccineStock(String vaccineId, String vendorId);

    @Query(value = "select v from Vaccines v where v.vaccine_id =?1")
    public List<Vaccines> getVaccineByVaccineId(String vaccineId);

    @Query(value = "select v from Vaccines v where v.vendor_id =?1")
    public List<Vaccines> getVaccineByVendorId(String vendorId);


}
