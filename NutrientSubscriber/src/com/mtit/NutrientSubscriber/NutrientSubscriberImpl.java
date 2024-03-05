package com.mtit.NutrientSubscriber;

import java.util.List;
import java.util.Scanner;

import com.mtit.NutrientPublisher.Nutrient;
import com.mtit.NutrientPublisher.NutrientPublisher;

public class NutrientSubscriberImpl implements NutrientSubscriber {

	String input;
	String nutrient_ID;
	String nutrient_Name;
	String nutrient_Type;
	String unit_of_measurement;
	String daily_Value;
	String food_Sources;
	Scanner sc = new Scanner(System.in);

	public static final String ADD = "add";
	public static final String All = "all";
	public static final String DELETE = "delete";

	@Override
	public void getService(NutrientPublisher nutrientpublisher) {
		System.out.println("***********Welcome to the Ceylon swimming club Admin Portal for Water Enthusiasts***********");
		System.out.println("Ceylon Swimming Club\n\n");
		System.out.println("Choose the option you desire.");
		System.out.println();

		while (true) {
			input = getInput();

			if (input.equalsIgnoreCase(ADD)) {
				addRecord(nutrientpublisher);
			} else if (input.equalsIgnoreCase(All)) {
				getAllRecords(nutrientpublisher);
			} else if (input.equalsIgnoreCase(DELETE)) {
				deleteRecord(nutrientpublisher);
			} else {
				System.out.println("Invalid");
			}
		}

	}

	public String getInput() {
		System.out.println("To Insert a record to the portal type: 'Add'");
		System.out.println("To View records from the portal type: 'All'");
		System.out.println("To Delete a record from the portal type: 'Delete'");
		System.out.println("\n");
		String input = sc.nextLine();
		
		
		System.out.println("Welcome to the Nutrient Service");
		System.out.println("Ceylon Swimming Club\n\n");
		
		
		return input;

	}

	public void addRecord(NutrientPublisher nutrientpublisher) {
		System.out.println("Enter Nutrient ID:");
		nutrient_ID = sc.nextLine();

		System.out.println("Enter Nutrient Name:");
		nutrient_Name = sc.nextLine();

		System.out.println("Enter Nutrient Type:");
		nutrient_Type = sc.nextLine();

		System.out.println("Enter unit_of_measurement:");
		unit_of_measurement = sc.nextLine();

		System.out.println("Enter daily_Value:");
		daily_Value = sc.nextLine();

		System.out.println("Enter food_Sources: ");
		food_Sources = sc.nextLine();

		String temp = nutrientpublisher.addNutrient(nutrient_ID, nutrient_Name, nutrient_Type, unit_of_measurement,
				daily_Value, food_Sources);
		System.out.println(temp);
		System.out.println();
	}

	public void getAllRecords(NutrientPublisher nutrientpublisher) {
		List<Nutrient> nutrients = nutrientpublisher.getAllNutrients();

		System.out.println("Displaying all Added Nutrients ");
		System.out.println();

		System.out.println("ID \t Full Name");
		for (Nutrient nutrient : nutrients) {

			System.out.println(nutrient.getNutrient_ID());
			System.out.println("\t" + nutrient.getNutrient_Name() + " " + nutrient.getNutrient_Type());

			System.out.println();
		}

		System.out.println();
	}

	private void deleteRecord(NutrientPublisher nutrientpublisher) {
		String nut_id;

		System.out.println("Enter Nutrient ID to be deleted: ");
		nut_id = sc.nextLine();
		nutrientpublisher.deleteNutrient(nut_id);
		System.out.println();
	}

}
