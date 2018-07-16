package com.poolsawat.api.gsb.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poolsawat.api.gsb.dto.MedicalQuota;
import com.poolsawat.api.gsb.dto.response.MedicalQuotaResponse;

@RestController
@RequestMapping(path = "/absence")
public class AbsenceController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbsenceController.class);

	@GetMapping(path = "/quota/{employeeId}")	
	public MedicalQuotaResponse getQuotaByEmployee(@PathVariable(value = "employeeId") Integer employeeId) {
		MedicalQuotaResponse response = new MedicalQuotaResponse();
		try {						
			List<MedicalQuota> medicalQuotaList = new ArrayList<MedicalQuota>();
			medicalQuotaList.add(new MedicalQuota("สิทธิค่ารักษาพยาบาลของบิดามารดา", 0.00, 0.00, 6000.00, -60000.00));
			medicalQuotaList.add(new MedicalQuota("สิทธิค่ารักษาพยาบาลคลีนิก หรือโรงพยาบาลเอกชนกรณีผู้ป่วยนอก", 0.00, 0.00, 3600.00, -3600.00));
			medicalQuotaList.add(new MedicalQuota("สิทธิการตรวจสุขภาพ", 0.00, 0.00, 0.00, 0.00));
			response.setMedicalQuotaList(medicalQuotaList);			
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
