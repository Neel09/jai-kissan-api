package org.jai.kissan.api.farmer.composite.model;

import java.time.LocalDateTime;

import org.jai.kissan.api.farmer.fci.model.DealStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FciDealSummary {

	private String fciDealIdentityCode;

	private LocalDateTime dealCreatingDate;
	private LocalDateTime dealLastUpdatingDate;
	private LocalDateTime dealClosingDate;

	private CropDetail cropDetails;

	private Double cropTotalQuantity;
	private Double buyingQuantity;

	private DealStatus dealStatus;

	private Double buyingRate;

	private Double mspRate;

}
