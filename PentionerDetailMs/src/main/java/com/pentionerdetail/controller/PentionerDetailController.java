package com.pentionerdetail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pentionerdetail.entity.PentionerDetail;
import com.pentionerdetail.service.IPensionDetailService;

@RestController
public class PentionerDetailController {
    
    @Autowired
    private IPensionDetailService pensionerDetailService;
    
    @GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
    public PentionerDetail getPensionerDetailByAadhaar(@PathVariable String aadhaarNumber) {
        return pensionerDetailService.getPensionerDetailByAadhaar(aadhaarNumber);
    }
}
