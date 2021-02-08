package org.jai.kissan.api.farmer.crop.controller;

import org.jai.kissan.api.farmer.crop.model.Crop;
import org.jai.kissan.api.farmer.crop.model.Farmer;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("farmer-crop")
public interface IFarmerCropController {

	@PostMapping("farmer")
	String doFarmerRegistration(@RequestBody Farmer farmer);

	@PostMapping("crop")
	String createCrop(@RequestBody Crop crop);

	@GetMapping("farmer/{farmerIdentityCode}")
	Farmer getFarmerDetails(@PathVariable String farmerIdentityCode);

	@GetMapping("crop/{cropIdentityCode}")
	Farmer getCropDetails(@PathVariable String cropIdentityCode);

	@DeleteMapping("farmer/{farmerIdentityCode}")
	void deleteFarmer(@PathVariable String farmerIdentityCode);
}
