package org.jai.kissan.api.farmer.fci.controller;

import java.util.List;

import org.jai.kissan.api.farmer.fci.model.FarmerFciDeal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("farmer-fci")
public interface IFarmerFciController {

	@PostMapping("deal")
	String createDeal(@RequestBody FarmerFciDeal farmerFciDeal);

	@PutMapping("buy-deal")
	void buyDeal(@RequestParam String dealCode, @RequestParam Double buyingRate);

	@PutMapping("quantity")
	void updateQuantityInDeal(@RequestParam String dealCode, @RequestParam Double quantity);

	@PutMapping("status-to-review")
	void updateStatusToReview(@RequestParam String dealCode);

	@GetMapping("new-deals")
	List<FarmerFciDeal> listAllNewDeals();

	@GetMapping("new-deals/{farmerIdentityCode}")
	List<FarmerFciDeal> listFarmerNewDeals(@PathVariable String farmerIdentityCode);

	@GetMapping("reviewing-deals")
	List<FarmerFciDeal> listAllReviewingDeals();

	@GetMapping("reviewing-deals/{farmerIdentityCode}")
	List<FarmerFciDeal> listAllReviewingDeals(@PathVariable String farmerIdentityCode);

	@GetMapping("active-deals")
	List<FarmerFciDeal> getFciActiveDealFromFarmerCode(@PathVariable String farmerIdentityCode);

	@DeleteMapping("farmer-deals/{farmerIdentityCode}")
	void deleteAllFarmerFciDeals(@PathVariable String farmerIdentityCode);

	@DeleteMapping("fci-deal/{farmerFciDeal}")
	void deleteFarmerFciDeal(@PathVariable String farmerFciDeal);
}
