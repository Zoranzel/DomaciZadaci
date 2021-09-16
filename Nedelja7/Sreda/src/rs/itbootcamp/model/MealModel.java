package rs.itbootcamp.model;

public class MealModel {

	 private int meal_id;
	 private String meal_name;
	 private String meal_description;
	 private String meal_difficulty;
	 
	 
	public MealModel(int meal_id, String meal_name, String meal_description, String meal_difficulty) {
		this.meal_id = meal_id;
		this.meal_name = meal_name;
		this.meal_description = meal_description;
		this.meal_difficulty = meal_difficulty;
	}


	public int getMeal_id() {
		return meal_id;
	}


	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}


	public String getMeal_name() {
		return meal_name;
	}


	public void setMeal_name(String meal_name) {
		this.meal_name = meal_name;
	}


	public String getMeal_description() {
		return meal_description;
	}


	public void setMeal_description(String meal_description) {
		this.meal_description = meal_description;
	}


	public String getMeal_difficulty() {
		return meal_difficulty;
	}


	public void setMeal_difficulty(String meal_difficulty) {
		this.meal_difficulty = meal_difficulty;
	}


	@Override
	public String toString() {
		return "Ime jela: " + meal_name + ", opis jela: " + meal_description + ", tezina: " + meal_difficulty;
							
	}
	
	
	 
	 
}
