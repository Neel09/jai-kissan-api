package org.jai.kissan.api.farmer.composite.contoller;

import org.jai.kissan.api.farmer.composite.model.FarmerComposite;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.core.publisher.Mono;

@RequestMapping("farmer-composite")
public interface IFarmerCompositeController {

	@PostMapping("farmer-with-fci-deals")
	public Mono<String> createFarmerAndFciDeal(@RequestBody FarmerComposite farmerComposite);

	@GetMapping("farmer-summary/{farmerIdentityCode}")
	public Mono<FarmerComposite> getFarmerSummary(@PathVariable String farmerIdentityCode);

	@GetMapping("farmer-active-fci-deal-summary/{farmerIdentityCode}")
	public Mono<FarmerComposite> getFarmerActiveFciSummary(@PathVariable String farmerIdentityCode);

	@GetMapping("farmer-reviewing-fci-summary/{farmerIdentityCode}")
	public Mono<FarmerComposite> getFarmerReviewingFciSummary(@PathVariable String farmerIdentityCode);

	@GetMapping("farmer-completed-fci-summary/{farmerIdentityCode}")
	public Mono<FarmerComposite> getFarmerCompletedFciSummary(@PathVariable String farmerIdentityCode);

	@DeleteMapping("farmer/{farmerIdentityCode}")
	public Mono<Void> deleteFarmer(@PathVariable String farmerIdentityCode);
}
