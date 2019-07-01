package CreateDisposeObject.JavaBeans;

// JavaBeans Pattern - allows inconsistency, mandates mutability
public class NutritionFacts {
	
	// Parameters initialized to default values (if any)
	private int servingSize = -1; // (mL) 			required, no default value
	private int servings = -1; 	// (per container) 	required, no default value
	private int calories = 0; 	// (per serving)	optional
	private int fat = 0 ;			// (g/serving)		optional 
	private int sodium = 0; 		// (mg/serving)		optional
	private int carbohydrate = 0; // (g/serving)		optional
	
	public NutritionFacts() {}
	
	// Setters
	public void setServingSize(int val) {servingSize = val;}
	public void setServings(int val) {servings = val;}
	public void setCalories(int val) {calories = val;}
	public void setFat(int val) {fat = val;}
	public void setSodium(int val) {sodium = val;}
	public void setCarbohydrate(int val) {carbohydrate = val;}
}
