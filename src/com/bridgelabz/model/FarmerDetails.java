package com.bridgelabz.model;

import java.util.ArrayList;

public class FarmerDetails {

	private String farmerName;
	private int age;
	private String address;
	private ArrayList<LandDetails> listOflandDetails;
	public FarmerDetails(String farmerName, int age, String address) {
		super();
		this.farmerName = farmerName;
		this.age = age;
		this.address = address;
		this.listOflandDetails = new ArrayList<LandDetails>();
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<LandDetails> getListOflandDetails() {
		return listOflandDetails;
	}
	public void setListOflandDetails(ArrayList<LandDetails> listOflandDetails) {
		this.listOflandDetails = listOflandDetails;
	}
	@Override
	public String toString() {
		return "FarmerDetails [farmerName=" + farmerName + ", age=" + age + ", address=" + address
				+ ", listOflandDetails=" + listOflandDetails + "]";
	}
	
}
