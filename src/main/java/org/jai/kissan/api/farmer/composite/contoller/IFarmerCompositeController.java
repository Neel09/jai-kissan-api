package org.jai.kissan.api.farmer.composite.contoller;

import org.jai.kissan.api.farmer.composite.model.FarmerComposite;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("farmer-composite")
public interface IFarmerCompositeController {

	@GetMapping("farmer-summary/{farmerIdentityCode}")
	public FarmerComposite getFarmerSummary(@PathVariable String farmerIdentityCode);
	
	@GetMapping("farmer-active-fci-deal-summary/{farmerIdentityCode}")
	public FarmerComposite getFarmerActiveFciSummary(@PathVariable String farmerIdentityCode);
	
	@GetMapping("farmer-reviewing-fci-summary/{farmerIdentityCode}")
	public FarmerComposite getFarmerReviewingFciSummary(@PathVariable String farmerIdentityCode);
	
	@GetMapping("farmer-compelted-fci-summary/{farmerIdentityCode}")
	public FarmerComposite getFarmerCompletedFciSummary(@PathVariable String farmerIdentityCode);

	@PostMapping("create-farmer-with-fci-deal")
	public void createFarmerAndFciDeal(@RequestBody FarmerComposite farmerComposite);

	@DeleteMapping("delete-farmer/{farmerIdentityCode}")
	public void deleteFarmer(@PathVariable String farmerIdentityCode);
}
