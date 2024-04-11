import java.util.HashMap;
import java.util.Map;

public class PriceCalculator {
    private final Map<MealType, Integer> mealPrices;
    private final Map<BeverageSize, Integer> beveragePrices;
    private final Map<DessertType, Integer> dessertPrices;

    public PriceCalculator() {
        mealPrices = new HashMap<>();
        mealPrices.put(new MealType("assiette"), 15);
        mealPrices.put(new MealType("sandwich"), 10);

        beveragePrices = new HashMap<>();
        beveragePrices.put(new BeverageSize("petit"), 2);
        beveragePrices.put(new BeverageSize("moyen"), 3);
        beveragePrices.put(new BeverageSize("grand"), 4);

        dessertPrices = new HashMap<>();
        dessertPrices.put(new DessertType("normal"), 2);
        dessertPrices.put(new DessertType("special"), 4);
    }

    public int calculatePrice(MealType mealType, BeverageSize beverageSize, DessertType dessertType, CoffeeOption coffeeOption) {
        int total = mealPrices.getOrDefault(mealType, 0);

        total += beveragePrices.getOrDefault(beverageSize, 0);
        total += dessertPrices.getOrDefault(dessertType, 0);
        if (coffeeOption != null && coffeeOption.getValue().equals("yes")) {
            total -= 1;
        }

        return total;
    }
}
