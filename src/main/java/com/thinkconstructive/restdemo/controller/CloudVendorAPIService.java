package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {

        return  cloudVendor;
        //CloudVendor("C1","vendor1","xxx","xxxx");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully";

    }
    @PutMapping

    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Updated Successfully";

    }
    @DeleteMapping("{vendorId}")

    public String CloudVendorDetails(String vendorId)
    {
        this.cloudVendor=null ;
        return "Cloud Vendor Deleted Successfully";

    }
}
