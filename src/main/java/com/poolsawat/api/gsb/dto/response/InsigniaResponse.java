package com.poolsawat.api.gsb.dto.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.poolsawat.api.gsb.dto.Insignia;

public class InsigniaResponse implements Serializable{

	private static final long serialVersionUID = 827844151251123195L;

	@JsonProperty(value = "status")
	private Integer status;

	@JsonProperty(value = "insignia_history")
	private List<Insignia> insigniaHistory;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Insignia> getInsigniaHistory() {
		return insigniaHistory;
	}

	public void setInsigniaHistory(List<Insignia> insigniaHistory) {
		this.insigniaHistory = insigniaHistory;
	}

}
