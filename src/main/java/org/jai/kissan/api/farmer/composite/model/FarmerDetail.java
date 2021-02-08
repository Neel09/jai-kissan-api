package org.jai.kissan.api.farmer.composite.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FarmerDetail {

	private String farmerIdentityCode;

	private String farmerName;
	private String address;
	private String contactNumber;

	private String aadharNumber;
}
