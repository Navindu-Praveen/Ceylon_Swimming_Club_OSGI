package com.mtit.NutrientPublisher;

import java.util.List;

public interface NutrientPublisher {

	public String addNutrient(String nutrient_ID, String nutrient_Name, String nutrient_Type,
			String unit_of_measurement, String daily_Value, String food_Sources);

	public List<Nutrient> getAllNutrients();

	public void deleteNutrient(String nutrient_ID);
}
