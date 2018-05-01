package com.example.BankDetails.BankDetails.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank_branches")
public class BankBranches implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ifsc")
	private String ifsc;
	
	@ManyToOne
	@JoinColumn(name="bank_id")
	private Banks bank;
		
	@Column(name="branch")
	private String branch;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="district")
	private String district;
	
	@Column(name="state")
	private String state;

	@Column(name="bank_name")
	private String bank_name;
	
	public BankBranches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankBranches(String ifsc, Banks bank, String branch, String address, String city, String district,
			String state, String bank_name) {
		super();
		this.ifsc = ifsc;
		this.bank = bank;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
		this.bank_name = bank_name;
	}

	

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Banks getBank() {
		return bank;
	}

	public void setBank(Banks bank) {
		this.bank = bank;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	@Override
	public String toString() {
		return "BankBranches [ifsc=" + ifsc + ", bank=" + bank + ", branch=" + branch + ", address=" + address
				+ ", city=" + city + ", district=" + district + ", state=" + state + ", bank_name=" + bank_name + "]";
	}

}
