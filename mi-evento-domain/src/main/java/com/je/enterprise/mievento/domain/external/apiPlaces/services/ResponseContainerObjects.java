package com.je.enterprise.mievento.domain.external.apiPlaces.services;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseContainerObjects<Model> {

	private String status;
	@JsonProperty("results")
	private List<Model> results;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Model> getData() {
		return results;
	}
	public void setData(List<Model> data) {
		this.results = data;
	}
	
	
}