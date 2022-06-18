package com.bridgelabz.model;

public class ProfitAndLostDetails {

	private double totalCost;
	private double investCost;
	private double incomeCost;
	private String crop;
	private int year;
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public double getInvestCost() {
		return investCost;
	}
	public void setInvestCost(double investCost) {
		this.investCost = investCost;
	}
	public double getIncomeCost() {
		return incomeCost;
	}
	public void setIncomeCost(double incomeCost) {
		this.incomeCost = incomeCost;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "ProfitAndLostDetails [totalCost=" + totalCost + ", investCost=" + investCost + ", incomeCost="
				+ incomeCost + ", crop=" + crop + ", year=" + year + "]";
	}
	
}
