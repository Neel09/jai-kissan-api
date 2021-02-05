package org.jai.kissan.api.farmer.fci.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class FarmerFciDeal {

    private String dealIdentityCode;

    private LocalDateTime dealCreatingDate;
    private LocalDateTime dealLastUpdatingDate;
    private LocalDateTime dealClosingDate;

    private String farmerIdentityCode;
    private String cropIdentityCode;
    private Double cropTotalQuantity;
    private Double buyingQuantity;

    private DealStatus dealStatus;

    private Double buyingRate;

    private Double mspRate;
}
