package com.bridgelabz.model;

import java.util.ArrayList;

public class LandDetails {

	private double area;
	private int surveNo;
	private String landType;
	private ArrayList<ProfitAndLostDetails> profitAndLostDetails;
	public LandDetails(double area, int surveNo, String landType) {
		super();
		this.area = area;
		this.surveNo = surveNo;
		this.landType = landType;
		this.profitAndLostDetails = new ArrayList<ProfitAndLostDetails>();
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getSurveNo() {
		return surveNo;
	}
	public void setSurveNo(int surveNo) {
		this.surveNo = surveNo;
	}
	public String getLandType() {
		return landType;
	}
	public void setLandType(String landType) {
		this.landType = landType;
	}
	public ArrayList<ProfitAndLostDetails> getProfitAndLostDetails() {
		return profitAndLostDetails;
	}
	public void setProfitAndLostDetails(ArrayList<ProfitAndLostDetails> profitAndLostDetails) {
		this.profitAndLostDetails = profitAndLostDetails;
	}
	@Override
	public String toString() {
		return "LandDetails [area=" + area + ", surveNo=" + surveNo + ", landType=" + landType
				+ ", profitAndLostDetails=" + profitAndLostDetails + "]";
	}
	
}
