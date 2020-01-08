package sii.maroc;

public class Meal {

	public Meal() {
		
	}
	private static int servedDishesNumber = 0;
	private static int cookingDurationMinutes = 0;
	
	public int servedDishes() {
		
		return servedDishesNumber;
	}

	public int cookingDuration() {
		
		return cookingDurationMinutes;
	}

	public static int getServedDishesNumber() {
		return servedDishesNumber;
	}

	public static void setServedDishesNumber(int servedDishesNumber) {
		Meal.servedDishesNumber = servedDishesNumber;
	}

	public static int getCookingDurationMinutes() {
		return cookingDurationMinutes;
	}

	public static void setCookingDurationMinutes(int cookingDurationMinutes) {
		Meal.cookingDurationMinutes = cookingDurationMinutes;
	}
	
	

}
