package org.jai.kissan.api.farmer.fci.controller;


import org.jai.kissan.api.farmer.fci.model.FarmerFciDeal;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("farmer-fci")
public interface IFarmerFciController {

    @PostMapping("create-deal")
    String createDeal(@RequestBody FarmerFciDeal farmerFCIDeal);

    @PutMapping("buy-deal")
    void buyDeal(@RequestParam String dealCode, @RequestParam Double buyingRate);

    @PutMapping("update-quantity")
    void updateQuantityInDeal(@RequestParam String dealCode, @RequestParam Double quantity);

    @PutMapping("update-status-to-review")
    void updateStatusToReview(@RequestParam String dealCode);

    @GetMapping("list-all-new-deals")
    List<FarmerFciDeal> listAllNewDeals();

    @GetMapping("list-all-reviewing-deals")
    List<FarmerFciDeal> listAllReviewingDeals();

    @GetMapping("get-active-fci-deals")
    List<FarmerFciDeal> getFCIActiveDealFromFarmerCode(@PathVariable String farmerIdentityCode);
}
