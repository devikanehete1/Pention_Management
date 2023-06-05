package com.processpension.entity;

public class ProcessPentionInput {
	
	private String aadhaarNumber;

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public ProcessPentionInput(String aadhaarNumber) {
		super();
		this.aadhaarNumber = aadhaarNumber;
	}

	public ProcessPentionInput() {
		super();
	}

	
}
