package com.poolsawat.api.gsb.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poolsawat.api.gsb.dto.Insignia;
import com.poolsawat.api.gsb.dto.response.InsigniaResponse;

@RestController
@RequestMapping(path = "/insignia")
public class GoodNessController {

	private static final Logger LOGGER = LoggerFactory.getLogger(GoodNessController.class);

	@GetMapping(path = "/{employeeId}")	
	public InsigniaResponse getInsigniaByEmployee(@PathVariable(value = "employeeId") Integer employeeId) {
		InsigniaResponse response = new InsigniaResponse();
		try {						
			List<Insignia> insigniaHistory = new ArrayList<Insignia>();
			insigniaHistory.add(new Insignia("10", "02", ""));
			insigniaHistory.add(new Insignia("11", "01", ""));
			response.setInsigniaHistory(insigniaHistory);			
			LOGGER.info("employeeId ::=={}",employeeId);
			response.setStatus(200);
			LOGGER.info("response ::=={}",response);
		} catch (Exception e) {
			LOGGER.error("getQuotaByEmployee ::== {}", e);
			response.setStatus(500);
		}
		return response;
	}
}
