package org.jai.kissan.api.farmer.fci.controller;

import org.jai.kissan.api.farmer.fci.model.FarmerFciDeal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("farmer-fci")
public interface IFarmerFciController {

	@PostMapping("deal")
	Mono<FarmerFciDeal> createDeal(@RequestBody FarmerFciDeal farmerFciDeal);

	@PutMapping("buy-deal")
	void buyDeal(@RequestParam String dealCode, @RequestParam Double buyingRate);

	@PutMapping("quantity")
	void updateQuantityInDeal(@RequestParam String dealCode, @RequestParam Double quantity);

	@PutMapping("status-to-review")
	void updateStatusToReview(@RequestParam String dealCode);

	@GetMapping("new-deals")
	Flux<FarmerFciDeal> listAllNewDeals();

	@GetMapping("new-deals/{farmerIdentityCode}")
	Flux<FarmerFciDeal> listFarmerNewDeals(@PathVariable String farmerIdentityCode);

	@GetMapping("reviewing-deals")
	Flux<FarmerFciDeal> listAllReviewingDeals();

	@GetMapping("reviewing-deals/{farmerIdentityCode}")
	Flux<FarmerFciDeal> listAllReviewingDeals(@PathVariable String farmerIdentityCode);

	@GetMapping("active-deals/{farmerIdentityCode}")
	Flux<FarmerFciDeal> getFciActiveDealFromFarmerCode(@PathVariable String farmerIdentityCode);

	@DeleteMapping("farmer-deals/{farmerIdentityCode}")
	void deleteAllFarmerFciDeals(@PathVariable String farmerIdentityCode);

	@DeleteMapping("fci-deal/{farmerFciDeal}")
	void deleteFarmerFciDeal(@PathVariable String farmerFciDeal);
}
