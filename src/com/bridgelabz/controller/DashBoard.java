package com.bridgelabz.controller;

import java.util.Scanner;

import com.bridgelabz.interfaces.IFarmerDetails;
import com.bridgelabz.model.FarmerDetails;
import com.bridgelabz.service.FarmerDetailsImpl;

public class DashBoard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IFarmerDetails details = new FarmerDetailsImpl();
		int i = 1;
		do {
			System.out.println("1 => add Farmer");
			System.out.println("2 => add LandDetails");
			System.out.println("3 => add Crop");
			System.out.println("Enter your choice...");
			
			int ch = scanner.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter farmer name");
				String name = scanner.next();
				System.out.println("Enter the aga");
				int age = scanner.nextInt();
				System.out.println("Eneter the address");
				String address = scanner.next();
				details.addFarmer(name, age, address);
				
				break;
				
			case 2:
				System.out.println("Enter farmer name");
				name = scanner.next();
				
				FarmerDetails farmerDetails = details.getFarmer(name);
				
				System.out.println("Enter area");
				double area = scanner.nextDouble();
				System.out.println("Enter surveNo");
				int surveNo = scanner.nextInt();
				System.out.println("Eneter LandType");
				String landType = scanner.next();
				System.out.println("Enter crop");
				String crop = scanner.next();
				details.addLandDetails(area, surveNo, landType, farmerDetails);
				break;
				
			case 3:
				System.out.println("Enter farmer name");
				name = scanner.next();
				System.out.println("Enter surveNo");
				surveNo = scanner.nextInt();
				System.out.println("Enter crop");
				crop = scanner.next();
				System.out.println("Enter investCost");
				double investCost = scanner.nextDouble();
				System.out.println("Enter incomeCost");
				double incomeCost = scanner.nextDouble();
				
				details.addCrop(name, surveNo, crop, investCost, incomeCost);
				break;
			default:
				break;
			}
			
			System.out.println("Do you want to add new farmer... press 1");
			i = scanner.nextInt();
		}while(i==1);
	}
}
