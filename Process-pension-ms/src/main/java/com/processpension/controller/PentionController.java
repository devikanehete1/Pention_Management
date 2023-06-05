package com.processpension.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.processpension.entity.PensionDetail;
import com.processpension.entity.ProcessPentionInput;
import com.processpension.service.IPensionService;

@RestController
@RequestMapping("/processPension")
public class PentionController {

	    
	    @Autowired
	    private IPensionService pensionService;
	    
	    @Autowired
        private RestTemplate restTemplate;
	    
	    @PostMapping("/ProcessPension")
	    public PensionDetail processPension(@RequestBody ProcessPentionInput ppinput) {
	        return pensionService.calculatePension(ppinput);
	    }
	
			private static final Map<String, Double> BANK_SERVICE_CHARGES = new HashMap<>();
	        
	        static {
	            BANK_SERVICE_CHARGES.put("public", 500.0);
	            BANK_SERVICE_CHARGES.put("private", 550.0);
	        }


	        @PostMapping("/")
	        public ResponseEntity<?> processPension(@RequestParam("aadhaarNumber") String aadhaarNumber) {
	          
	            ResponseEntity<PensionDetail> pensionerDetailResponse = restTemplate.exchange(
	                    "http://PensionerDetailMicroservice/getPensionerDetail?aadhaarNumber=" + aadhaarNumber,
	                    HttpMethod.GET,
	                    null,
	                    PensionDetail.class
	            );

	            if (pensionerDetailResponse.getStatusCode() != HttpStatus.OK) {
	                return ResponseEntity.badRequest().body("Invalid pensioner detail provided, please provide valid detail.");
	            }
				return pensionerDetailResponse;

	            //PensionDetail pensionerDetail = pensionerDetailResponse.getBody();
	            //double pensionAmount = calculatePensionAmount(pensionerDetail);
	            //double bankServiceCharge = calculateBankServiceCharge(pensionerDetail);

	            //PensionDetail pensionDetail = new PensionDetail(pensionAmount, bankServiceCharge);
	            //return ResponseEntity.ok(pensionDetail);
	        //}

	        /*private double calculatePensionAmount(PensionDetail pensionerDetail) {
	            
	        }

	        private double calculateBankServiceCharge(PensionDetail pensionerDetail) {
	            
	        }*/
	        }}