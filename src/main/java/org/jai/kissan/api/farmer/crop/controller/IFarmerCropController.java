package org.jai.kissan.api.farmer.crop.controller;

import org.jai.kissan.api.farmer.crop.model.Crop;
import org.jai.kissan.api.farmer.crop.model.Farmer;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.core.publisher.Mono;

@RequestMapping("farmer-crop")
public interface IFarmerCropController {

	@PostMapping("farmer")
	Mono<String> doFarmerRegistration(@RequestBody Farmer farmer);

	@PostMapping("crop")
	Mono<String> createCrop(@RequestBody Crop crop);

	@GetMapping("farmer/{farmerIdentityCode}")
	Mono<Farmer> getFarmerDetails(@PathVariable String farmerIdentityCode);

	@GetMapping("crop/{cropIdentityCode}")
	Mono<Crop> getCropDetails(@PathVariable String cropIdentityCode);

	@DeleteMapping("farmer/{farmerIdentityCode}")
	Mono<Void> deleteFarmer(@PathVariable String farmerIdentityCode);
}
