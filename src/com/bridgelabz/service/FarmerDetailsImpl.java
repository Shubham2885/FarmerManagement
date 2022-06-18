package com.bridgelabz.service;

import java.util.ArrayList;

import com.bridgelabz.interfaces.IFarmerDetails;
import com.bridgelabz.model.FarmerDetails;
import com.bridgelabz.model.LandDetails;
import com.bridgelabz.model.ProfitAndLostDetails;

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
	public void addLandDetails(double area, int surveNo, String landType, FarmerDetails farmerDetails) {
		LandDetails landDetails = new LandDetails(area, surveNo, landType);
		farmerDetails.getListOflandDetails().add(landDetails);
		System.out.println(listOfFarmer);
	}

	@Override
	public void addCrop(String name, int surveNo, String crop, double investCost, double incomeCost) {
		LandDetails landDetails = getLandDetails(surveNo, name);
		ArrayList<ProfitAndLostDetails> crops = landDetails.getProfitAndLostDetails();
		ProfitAndLostDetails profitAndLostDetail = new ProfitAndLostDetails();
		profitAndLostDetail.setCrop(crop);
		profitAndLostDetail.setIncomeCost(incomeCost);
		profitAndLostDetail.setInvestCost(investCost);
		profitAndLostDetail.setTotalCost(incomeCost-investCost);
		crops.add(profitAndLostDetail);
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
