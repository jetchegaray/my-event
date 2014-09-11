package com.je.enterprise.mievento.domain.entity.location;

import com.je.enterprise.mievento.api.dto.CountryCode;


public class CommercialLocationEntity extends LocationEntity{

	private String placeName;

	public CommercialLocationEntity() {
	}

	public CommercialLocationEntity(String placeName,CountryCode countryCode, String province,
			StreetAddressEntity streetAddress) {
		super(countryCode, province, streetAddress);
		this.placeName = placeName;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	
}
