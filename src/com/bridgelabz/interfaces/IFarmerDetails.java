package com.bridgelabz.interfaces;

import com.bridgelabz.model.FarmerDetails;

public interface IFarmerDetails {

	void addFarmer(String name, int age, String address);
	void addLandDetails(double area, int surveNo, String landType, FarmerDetails farmerDetails);
	FarmerDetails getFarmer(String name);
	void addCrop(String name, int surveNo, String crop, double investCost, double incomeCost);
}
