package com.je.enterprise.mievento.api.dto.event.wedding;

import java.math.BigDecimal;
import java.util.List;

import com.je.enterprise.mievento.api.dto.location.Location;
import com.je.enterprise.mievento.api.dto.provider.Provider;
import com.je.enterprise.mievento.api.dto.provider.ProviderType;

public class Place extends Provider {

	private BigDecimal m2;
	private BigDecimal estimatedQuantityTables;
	private BigDecimal estimatedQuantityPerson;
	
	public Place() {
		super();
	}

	public Place(String businessName, String description, Location location,
			String email, String cellPhone, String phone, BigDecimal price,
			BigDecimal estimatedPrice, BigDecimal m2,
			BigDecimal estimatedQuantityTables,
			BigDecimal estimatedQuantityPerson,List<String> photos,ProviderType providerType) {
		super(businessName, description, location, email, cellPhone, phone,
				price, estimatedPrice,photos,providerType);
		this.m2 = m2;
		this.estimatedQuantityTables = estimatedQuantityTables;
		this.estimatedQuantityPerson = estimatedQuantityPerson;

	}

	public BigDecimal getM2() {
		return m2;
	}

	public void setM2(BigDecimal m2) {
		this.m2 = m2;
	}

	public BigDecimal getEstimatedQuantityTables() {
		return estimatedQuantityTables;
	}

	public void setEstimatedQuantityTables(BigDecimal estimatedQuantityTables) {
		this.estimatedQuantityTables = estimatedQuantityTables;
	}

	public BigDecimal getEstimatedQuantityPerson() {
		return estimatedQuantityPerson;
	}

	public void setEstimatedQuantityPerson(BigDecimal estimatedQuantityPerson) {
		this.estimatedQuantityPerson = estimatedQuantityPerson;
	}
}
