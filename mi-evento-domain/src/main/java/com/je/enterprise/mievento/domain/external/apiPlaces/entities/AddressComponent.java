package com.je.enterprise.mievento.domain.external.apiPlaces.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AddressComponent {
	
	@JsonProperty("long_name")
	private String longName;
	@JsonProperty("short_name")
	private String shortName;
	@JsonProperty("types")
	private List<String> adressTypes;
	
	public AddressComponent() {
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public List<String> getAdressTypes() {
		return adressTypes;
	}

	public void setAdressTypes(List<String> adressTypes) {
		this.adressTypes = adressTypes;
	}
	
	@JsonIgnore
	public Boolean isCountry(){
		return this.adressTypes.contains(TypesAddressComponent.COUNTRY);
	}
	
	@JsonIgnore
	public Boolean isCity(){
		return this.adressTypes.contains(TypesAddressComponent.CITY);
	}
	
	@JsonIgnore
	public Boolean isProvince(){
		return this.adressTypes.contains(TypesAddressComponent.STATE_OR_PROVINCE);
	}	
	
	@JsonIgnore
	public Boolean isNeighborhood(){
		return this.adressTypes.contains(TypesAddressComponent.NEIGHBORHOOD);
	}
	
	@JsonIgnore
	public Boolean isStreet(){
		return this.adressTypes.contains(TypesAddressComponent.STREET);
	}
	
	@JsonIgnore
	public Boolean isNumber(){
		return this.adressTypes.contains(TypesAddressComponent.NUMBER);
	}
	
		
}
