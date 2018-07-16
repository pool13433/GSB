package com.poolsawat.api.gsb.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Insignia implements Serializable {

	private static final long serialVersionUID = -3410812027894266238L;

	@JsonProperty(value = "INSIGNIA_CODE")
	private String insigniaCode;

	@JsonProperty(value = "INSIGNIA_STATUS")
	private String insigniaStatus;

	@JsonProperty(value = "INSIGNIA_NAME")
	private String insigniaName;

	@JsonProperty(value = "YEAR_REQUEST")
	private String yearRequest;

	@JsonProperty(value = "REQUEST_BY")
	private String requestBy;

	@JsonProperty(value = "DECLAR_DATE")
	private String declarDate;

	@JsonProperty(value = "CERT_DATE")
	private String certDate;

	@JsonProperty(value = "INSIGNIA_DATE")
	private String insigniaDate;

	@JsonProperty(value = "NEXT_SIGNIA")
	private String nextSignia;
	
	

	public Insignia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insignia(String insigniaCode, String insigniaStatus, String insigniaName) {
		super();
		this.insigniaCode = insigniaCode;
		this.insigniaStatus = insigniaStatus;
		this.insigniaName = insigniaName;
	}

	public String getInsigniaCode() {
		return insigniaCode;
	}

	public void setInsigniaCode(String insigniaCode) {
		this.insigniaCode = insigniaCode;
	}

	public String getInsigniaStatus() {
		return insigniaStatus;
	}

	public void setInsigniaStatus(String insigniaStatus) {
		this.insigniaStatus = insigniaStatus;
	}

	public String getInsigniaName() {
		return insigniaName;
	}

	public void setInsigniaName(String insigniaName) {
		this.insigniaName = insigniaName;
	}

	public String getYearRequest() {
		return yearRequest;
	}

	public void setYearRequest(String yearRequest) {
		this.yearRequest = yearRequest;
	}

	public String getRequestBy() {
		return requestBy;
	}

	public void setRequestBy(String requestBy) {
		this.requestBy = requestBy;
	}

	public String getDeclarDate() {
		return declarDate;
	}

	public void setDeclarDate(String declarDate) {
		this.declarDate = declarDate;
	}

	public String getCertDate() {
		return certDate;
	}

	public void setCertDate(String certDate) {
		this.certDate = certDate;
	}

	public String getInsigniaDate() {
		return insigniaDate;
	}

	public void setInsigniaDate(String insigniaDate) {
		this.insigniaDate = insigniaDate;
	}

	public String getNextSignia() {
		return nextSignia;
	}

	public void setNextSignia(String nextSignia) {
		this.nextSignia = nextSignia;
	}

}
