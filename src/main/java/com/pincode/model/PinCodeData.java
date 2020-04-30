package com.pincode.model;

import java.io.Serializable;

public class PinCodeData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String postOfficeName;
	private String pincode;
	private String districtsName;
	private String city;
	private String state;

	public PinCodeData() {
		// TODO Auto-generated constructor stub
	}

	public PinCodeData(String postOfficeName, String pincode, String districtsName, String city, String state) {
		super();
		this.postOfficeName = postOfficeName;
		this.pincode = pincode;
		this.districtsName = districtsName;
		this.city = city;
		this.state = state;
	}

	public String getPostOfficeName() {
		return postOfficeName;
	}

	public void setPostOfficeName(String postOfficeName) {
		this.postOfficeName = postOfficeName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getDistrictsName() {
		return districtsName;
	}

	public void setDistrictsName(String districtsName) {
		this.districtsName = districtsName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "PinCodeData [postOfficeName=" + postOfficeName + ", pincode=" + pincode + ", districtsName="
				+ districtsName + ", city=" + city + ", state=" + state + "]";
	}

}
