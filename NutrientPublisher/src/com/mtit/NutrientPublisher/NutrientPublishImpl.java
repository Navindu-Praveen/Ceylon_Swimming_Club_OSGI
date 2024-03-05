package com.mtit.NutrientPublisher;

import java.util.ArrayList;
import java.util.List;

public class NutrientPublishImpl implements NutrientPublisher {

	public List<Nutrient> nutrients = new ArrayList<Nutrient>();

	// adding a new record
	@Override
	public String addNutrient(String nutrient_ID, String nutrient_Name, String nutrient_Type,
			String unit_of_measurement, String daily_Value, String food_Sources) {
		Nutrient nutrient = new Nutrient(nutrient_ID, nutrient_Name, nutrient_Type, unit_of_measurement, daily_Value,
				food_Sources);
		nutrients.add(nutrient);
		return "New Nutrient: " + nutrient.getNutrient_Name() + " " + nutrient.getNutrient_Type() + " "
				+ "added successfully!";

	}

	// Get all records
	@Override
	public List<Nutrient> getAllNutrients() {
		return nutrients;

	}

	// Delete Record
	@Override
	public void deleteNutrient(String nutrient_ID) {
		for (Nutrient nutrient : nutrients) {
			if (nutrient.getNutrient_ID().equalsIgnoreCase(nutrient_ID)) {
				int id = nutrients.indexOf(nutrient);
				nutrients.remove(id);
				System.out.println("Delete nutrient Record Successfully");
				return;
			}
		}

	}

}
