package org.jai.kissan.api.farmer.crop.controller;

import org.jai.kissan.api.farmer.crop.model.Crop;
import org.jai.kissan.api.farmer.crop.model.Farmer;
import org.springframework.web.bind.annotation.*;

@RequestMapping("farmer-crop")
public interface IFarmerCropController {

    @PostMapping("farmer-registration")
    String doFarmerRegistration(@RequestBody Farmer farmer);

    @PostMapping("create-crop")
    String createCrop(@RequestBody Crop crop);

    @GetMapping("farmer-detail/{farmerIdentityCode}")
    Farmer getFarmerDetails(@PathVariable String farmerIdentityCode);

    @GetMapping("crop-detail/{cropIdentityCode}")
    Farmer getCropDetails(@PathVariable String cropIdentityCode);
}
