package com.processpension.entity;

public class PensionDetail {
	
	private double pensionAmount;
    private double bankServiceCharge;
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public double getBankServiceCharge() {
		return bankServiceCharge;
	}
	public void setBankServiceCharge(double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}
	public PensionDetail(double pensionAmount, double bankServiceCharge) {
		super();
		this.pensionAmount = pensionAmount;
		this.bankServiceCharge = bankServiceCharge;
	}
	public PensionDetail() {
		super();
	}
    
	
    

}
