package com.mtit.NutrientPublisher;

public class Nutrient {

	private String nutrient_ID;
	private String nutrient_Name;
	private String nutrient_Type;
	private String unit_of_measurement;
	private String daily_Value;
	private String food_Sources;

	public Nutrient(String nutrient_ID, String nutrient_Name, String nutrient_Type, String unit_of_measurement,
			String daily_Value, String food_Sources) {
		super();
		this.nutrient_ID = nutrient_ID;
		this.nutrient_Name = nutrient_Name;
		this.nutrient_Type = nutrient_Type;
		this.unit_of_measurement = unit_of_measurement;
		this.daily_Value = daily_Value;
		this.food_Sources = food_Sources;

	}

	// Getters and Setters

	public String getNutrient_ID() {
		return nutrient_ID;
	}

	public void setNutrient_ID(String nutrient_ID) {
		this.nutrient_ID = nutrient_ID;
	}

	public String getNutrient_Name() {
		return nutrient_Name;
	}

	public void setNutrient_Name(String nutrient_Name) {
		this.nutrient_Name = nutrient_Name;
	}

	public String getNutrient_Type() {
		return nutrient_Type;
	}

	public void setNutrient_Type(String nutrient_Type) {
		this.nutrient_Type = nutrient_Type;
	}

	public String getUnit_of_measurement() {
		return unit_of_measurement;
	}

	public void setUnit_of_measurement(String unit_of_measurement) {
		this.unit_of_measurement = unit_of_measurement;
	}

	public String getDaily_Value() {
		return daily_Value;
	}

	public void setDaily_Value(String daily_Value) {
		this.daily_Value = daily_Value;
	}

	public String getFood_Sources() {
		return food_Sources;
	}

	public void setFood_Sources(String food_Sources) {
		this.food_Sources = food_Sources;
	}

}
