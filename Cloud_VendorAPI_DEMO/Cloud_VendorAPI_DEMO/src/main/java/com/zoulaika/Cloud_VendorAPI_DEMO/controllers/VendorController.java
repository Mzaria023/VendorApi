package com.zoulaika.Cloud_VendorAPI_DEMO.controllers;

import com.zoulaika.Cloud_VendorAPI_DEMO.models.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CloudVendor")
public class VendorController {
    public Vendor vendor;
    @GetMapping("{vendorID}")
    public Vendor getVendors(String vendorID){
        return vendor;
                //new Vendor("vendor001","Franky","MarineCircle 23","0679438024");
    }
    @PostMapping
    public String createVendor(@RequestBody Vendor vendor1) {
        this.vendor = vendor1;
        return "Vendor has been created successfully";
    }
    @PutMapping
    public String updatingVendor(@RequestBody Vendor vendor1) {
        this.vendor = vendor1;
        return "Vendor has been updated successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deletingVendor(String vendorID) {
        this.vendor = null;
        return "Vendor has been deleted successfully";
    }
}
