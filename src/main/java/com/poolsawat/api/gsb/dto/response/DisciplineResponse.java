package com.poolsawat.api.gsb.dto.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.poolsawat.api.gsb.dto.Discipline;

public class DisciplineResponse implements Serializable{

	private static final long serialVersionUID = 827844151251123195L;

	@JsonProperty(value = "status")
	private Integer status;

	@JsonProperty(value = "discipline_history")
	private List<Discipline> disciplineHistory;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Discipline> getDisciplineHistory() {
		return disciplineHistory;
	}

	public void setDisciplineHistory(List<Discipline> disciplineHistory) {
		this.disciplineHistory = disciplineHistory;
	}
	
}
