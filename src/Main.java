public class Main {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();

        MealType mealType = new MealType("assiette");
        BeverageSize beverageSize = new BeverageSize("moyen");
        DessertType dessertType = new DessertType("normal");
        CoffeeOption coffeeOption = new CoffeeOption("yes");

        int totalPrice = priceCalculator.calculatePrice(mealType, beverageSize, dessertType, coffeeOption);

        System.out.println("Prix à payer : " + totalPrice + "€");
    }
}
