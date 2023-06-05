package com.pentionerdetail.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pentionerdetail.entity.PentionerDetail;

@Service
public class PentionDetailServiceImpl implements IPensionDetailService {
    
    private List<PentionerDetail> pensionerDetailList;
    
    public PentionDetailServiceImpl() {
       
        this.pensionerDetailList = loadPensionerDetailsFromFile();
    }
    
 
    private List<PentionerDetail> loadPensionerDetailsFromFile() {
		return pensionerDetailList;
    
    }

	@Override
	public PentionerDetail getPensionerDetailByAadhaar(String aadhaarNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}
