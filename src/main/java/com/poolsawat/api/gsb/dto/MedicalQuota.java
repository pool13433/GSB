package com.poolsawat.api.gsb.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MedicalQuota implements Serializable{

	private static final long serialVersionUID = 4344762055130190498L;
	
	@JsonProperty(value="RULETEXT")
	private String ruleText;
	
	@JsonProperty(value="USEDCNT")
	private Double usedCnt;
	
	@JsonProperty(value="QUOTA")
	private Double quota;
	
	@JsonProperty(value="USED")
	private Double used;
	
	@JsonProperty(value="REST")
	private Double rest;
	
	public MedicalQuota(String ruleText, Double usedCnt, Double quota, Double used, Double rest) {
		super();
		this.ruleText = ruleText;
		this.usedCnt = usedCnt;
		this.quota = quota;
		this.used = used;
		this.rest = rest;
	}

	public String getRuleText() {
		return ruleText;
	}

	public void setRuleText(String ruleText) {
		this.ruleText = ruleText;
	}

	public Double getUsedCnt() {
		return usedCnt;
	}

	public void setUsedCnt(Double usedCnt) {
		this.usedCnt = usedCnt;
	}

	public Double getQuota() {
		return quota;
	}

	public void setQuota(Double quota) {
		this.quota = quota;
	}

	public Double getUsed() {
		return used;
	}

	public void setUsed(Double used) {
		this.used = used;
	}

	public Double getRest() {
		return rest;
	}

	public void setRest(Double rest) {
		this.rest = rest;
	}
	
	

}
