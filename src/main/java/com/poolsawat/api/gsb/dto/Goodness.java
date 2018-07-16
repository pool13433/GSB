package com.poolsawat.api.gsb.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Goodness implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 384150275559061624L;

	@JsonProperty(value="PERNR")
	private String perNR;
	
	@JsonProperty(value="SUBTYPE")
	private String subType;
	
	@JsonProperty(value="GOOD_NAME")
	private String goodName;
	
	@JsonProperty(value="STARTDATE")
	private String startDate;
	
	@JsonProperty(value="ENDDATE")
	private String endDate;
	
	@JsonProperty(value="DETAIL1")
	private String detail1;
	
	@JsonProperty(value="DETAIL2")
	private String detail2;
	
	@JsonProperty(value="DETAIL3")
	private String detail3;
	
	

	public Goodness() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goodness(String perNR, String subType, String goodName) {
		super();
		this.perNR = perNR;
		this.subType = subType;
		this.goodName = goodName;
	}

	public String getPerNR() {
		return perNR;
	}

	public void setPerNR(String perNR) {
		this.perNR = perNR;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDetail1() {
		return detail1;
	}

	public void setDetail1(String detail1) {
		this.detail1 = detail1;
	}

	public String getDetail2() {
		return detail2;
	}

	public void setDetail2(String detail2) {
		this.detail2 = detail2;
	}

	public String getDetail3() {
		return detail3;
	}

	public void setDetail3(String detail3) {
		this.detail3 = detail3;
	}
	
	
}
