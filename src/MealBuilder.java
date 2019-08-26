import FoodTypes.ChickenBurger;
import FoodTypes.Coke;
import FoodTypes.Pepsi;
import FoodTypes.VegBurger;
import Meals.Meal;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeak(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
