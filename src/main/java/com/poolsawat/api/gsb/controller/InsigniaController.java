package com.poolsawat.api.gsb.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poolsawat.api.gsb.dto.Goodness;
import com.poolsawat.api.gsb.dto.response.GoodNessResponse;

@RestController
@RequestMapping(path = "/goodness")
public class InsigniaController {

	private static final Logger LOGGER = LoggerFactory.getLogger(InsigniaController.class);

	@GetMapping(path = "/{employeeId}")	
	public GoodNessResponse getGoodnessByEmployee(@PathVariable(value = "employeeId") Integer employeeId) {
		GoodNessResponse response = new GoodNessResponse();
		try {						
			List<Goodness> goodnessHistory  = new ArrayList<Goodness>();
			goodnessHistory.add(new Goodness("999999", "xxxxxxxxxx", "iiiiiiiiii"));
			goodnessHistory.add(new Goodness("888888", "eeeeeee", "yyyyyyy"));
			response.setGoodnessHistory(goodnessHistory);			
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
