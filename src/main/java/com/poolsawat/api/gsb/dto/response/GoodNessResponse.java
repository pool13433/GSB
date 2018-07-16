package com.poolsawat.api.gsb.dto.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.poolsawat.api.gsb.dto.Goodness;

public class GoodNessResponse implements Serializable{

	private static final long serialVersionUID = 827844151251123195L;

	@JsonProperty(value = "status")
	private Integer status;

	@JsonProperty(value = "goodness_history")
	private List<Goodness> goodnessHistory;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Goodness> getGoodnessHistory() {
		return goodnessHistory;
	}

	public void setGoodnessHistory(List<Goodness> goodnessHistory) {
		this.goodnessHistory = goodnessHistory;
	}
}
