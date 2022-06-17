package com.bridgelabz.service;

import java.util.ArrayList;

import com.bridgelabz.interfaces.IFarmerDetails;
import com.bridgelabz.model.FarmerDetails;
import com.bridgelabz.model.LandDetails;

public class FarmerDetailsImpl implements IFarmerDetails {

	private ArrayList<FarmerDetails> listOfFarmer;
	
	public FarmerDetailsImpl() {
		listOfFarmer = new ArrayList<FarmerDetails>();
	}
	
	@Override
	public void addFarmer(String name, int age, String address) {
		FarmerDetails farmerDetails = new FarmerDetails(name, age, address);
		listOfFarmer.add(farmerDetails);
		System.out.println(listOfFarmer);
	}

	@Override
	public FarmerDetails getFarmer(String name) {
		
		for(int i =0; i< listOfFarmer.size();i++) {
			FarmerDetails farmerDetails = listOfFarmer.get(i);
			if(farmerDetails.getFarmerName().compareToIgnoreCase(name) == 0){
				return farmerDetails;
			}
		}
		return null;
	}

	@Override
	public void addLandDetails(double area, int surveNo, String landType, String crop, FarmerDetails farmerDetails) {
		LandDetails landDetails = new LandDetails(area, surveNo, landType, crop);
		farmerDetails.getListOflandDetails().add(landDetails);
		System.out.println(listOfFarmer);
	}

	@Override
	public void addCrop(String name, int surveNo, String crop) {
		LandDetails landDetails = getLandDetails(surveNo, name);
		ArrayList<String> crops = landDetails.getCrops();
		crops.add(crop);
		System.out.println(listOfFarmer);
	}
	
	private LandDetails getLandDetails(int surveNo, String name) {
		FarmerDetails farmerDetails = getFarmer(name);
		ArrayList<LandDetails> listOflandDetails = farmerDetails.getListOflandDetails();
	
		for(int i =0; i< listOflandDetails.size();i++) {
			LandDetails landDetails = listOflandDetails.get(i);
			if(landDetails.getSurveNo() == surveNo){
				return landDetails;
			}
		}
		return null;
	}

}
