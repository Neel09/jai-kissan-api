package org.jai.kissan.api.farmer.composite.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FarmerComposite {

	private FarmerDetail farmerDetail;

	private List<FciDealSummary> fciDeals;
//	private final List<ApmcDealSummary> apmcDeals;
//	private final List<ContractorDealSummary> contractorDeals;
}
