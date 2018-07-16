package com.poolsawat.api.gsb.dto.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.poolsawat.api.gsb.dto.MedicalQuota;

public class MedicalQuotaResponse implements Serializable{

	private static final long serialVersionUID = 827844151251123195L;

	@JsonProperty(value = "status")
	private Integer status;

	@JsonProperty(value = "medical_quota")
	private List<MedicalQuota> medicalQuotaList;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<MedicalQuota> getMedicalQuotaList() {
		return medicalQuotaList;
	}

	public void setMedicalQuotaList(List<MedicalQuota> medicalQuotaList) {
		this.medicalQuotaList = medicalQuotaList;
	}

	
	
}
