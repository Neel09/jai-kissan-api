package org.jai.kissan.api.farmer.crop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Farmer {

    private String identityCode;

    private String name;
    private String address;
    private String contactNumber;

    private String aadharNumber;

}
