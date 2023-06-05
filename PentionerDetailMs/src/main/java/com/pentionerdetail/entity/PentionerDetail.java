package com.pentionerdetail.entity;

import java.time.LocalDate;

public class PentionerDetail {
	
	    private String name;
	    private LocalDate dateOfBirth;
	    private String PAN;
	    private double salaryEarned;
	    private double allowances;
	    private String pensionClassification;
	    private BankDetail bankDetail;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getPAN() {
			return PAN;
		}
		public void setPAN(String pAN) {
			PAN = pAN;
		}
		public double getSalaryEarned() {
			return salaryEarned;
		}
		public void setSalaryEarned(double salaryEarned) {
			this.salaryEarned = salaryEarned;
		}
		public double getAllowances() {
			return allowances;
		}
		public void setAllowances(double allowances) {
			this.allowances = allowances;
		}
		public String getPensionClassification() {
			return pensionClassification;
		}
		public void setPensionClassification(String pensionClassification) {
			this.pensionClassification = pensionClassification;
		}
		public BankDetail getBankDetail() {
			return bankDetail;
		}
		public void setBankDetail(BankDetail bankDetail) {
			this.bankDetail = bankDetail;
		}
		public PentionerDetail(String name, LocalDate dateOfBirth, String pAN, double salaryEarned, double allowances,
				String pensionClassification, BankDetail bankDetail) {
			super();
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			PAN = pAN;
			this.salaryEarned = salaryEarned;
			this.allowances = allowances;
			this.pensionClassification = pensionClassification;
			this.bankDetail = bankDetail;
		}
		public PentionerDetail() {
			super();
		}
	    
	    
	

}
