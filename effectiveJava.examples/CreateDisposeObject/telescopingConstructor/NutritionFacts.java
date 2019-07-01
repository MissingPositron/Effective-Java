package createDisposeObject.telescopingConstructor;

// Telescoping constructor pattern - does not scale well !

public class NutritionFacts {
	private final int servingSize; 	// (mL) 			required
	private final int serving; 		// (per container) 	required
	private final int calories; 	// (per serving)	optional
	private final int fat;			// (g/serving)		optional 
	private final int sodium; 		// (mg/serving)		optional
	private final int carbohydrate; // (g/serving)		optional
	
	public NutritionFacts(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, 
			int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, 
			int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.serving = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
	
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
	}
}
