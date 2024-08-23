package com.zoulaika.Cloud_VendorAPI_DEMO.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vendor {
    private String vendorID;
    private String Name;
    private String address;
    private String number;
}
