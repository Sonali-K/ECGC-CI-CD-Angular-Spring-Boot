package com.cdac.ecgc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="ecgcbank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int bankBranchCode;
	
	private int ifscCode ;
	
	private String bankBranchName;
	private String bankBranchCity;
	private String state;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankBranchCode, int ifscCode, String bankBranchName, String bankBranchCity, String state) {
		super();
		this.bankBranchCode = bankBranchCode;
		this.ifscCode = ifscCode;
		this.bankBranchName = bankBranchName;
		this.bankBranchCity = bankBranchCity;
		this.state = state;
	}
	public int getBankBranchCode() {
		return bankBranchCode;
	}
	public void setBankBranchCode(int bankBranchCode) {
		this.bankBranchCode = bankBranchCode;
	}
	public int getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankBranchName() {
		return bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}
	public String getBankBranchCity() {
		return bankBranchCity;
	}
	public void setBankBranchCity(String bankBranchCity) {
		this.bankBranchCity = bankBranchCity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Bank [bankBranchCode=" + bankBranchCode + ", ifscCode=" + ifscCode + ", bankBranchName="
				+ bankBranchName + ", bankBranchCity=" + bankBranchCity + ", state=" + state + "]";
	}
	
	
}
