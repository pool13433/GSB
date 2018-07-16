package com.poolsawat.api.gsb.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poolsawat.api.gsb.dto.Discipline;
import com.poolsawat.api.gsb.dto.response.DisciplineResponse;

@RestController
@RequestMapping(path = "/discipline")
public class DisciplineController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DisciplineController.class);

	@GetMapping(path = "/{organizationId}/{employeeId}")
	public @ResponseBody DisciplineResponse getDisciplineByEmployee(
			@PathVariable(value = "organizationId") Integer organizationId,
			@PathVariable(value = "employeeId") Integer employeeId) {
		DisciplineResponse response = new DisciplineResponse();
		try {

			List<Discipline> disciplineHistory = new ArrayList<Discipline>();
			disciplineHistory.add(new Discipline("03902273"));
			response.setDisciplineHistory(disciplineHistory);
			LOGGER.info("organizationId ::=={} ,employeeId ::=={} ,", organizationId, employeeId);
			response.setStatus(200);
			LOGGER.info("response ::=={}", response);
		} catch (Exception e) {
			LOGGER.error("getQuotaByEmployee ::== {}", e);
			response.setStatus(500);
		}
		return response;
	}
}
