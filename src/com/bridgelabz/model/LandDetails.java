package com.bridgelabz.model;

import java.util.ArrayList;

public class LandDetails {

	private double area;
	private int surveNo;
	private String landType;
	private ArrayList<String> crops;
	public LandDetails(double area, int surveNo, String landType, String crop) {
		super();
		this.area = area;
		this.surveNo = surveNo;
		this.landType = landType;
		this.crops = new ArrayList<String>();
		this.crops.add(crop);
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
	public ArrayList<String> getCrops() {
		return crops;
	}
	public void setCrops(ArrayList<String> crops) {
		this.crops = crops;
	}
	@Override
	public String toString() {
		return "LandDetails [area=" + area + ", surveNo=" + surveNo + ", landType=" + landType + ", crops=" + crops
				+ "]";
	}
}
