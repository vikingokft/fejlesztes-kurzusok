class Main {

public static void main(String[] args) {

printSandwichRecipe("mayonnaise", "ham", "cheddar", "tomato");

}

public static void printSandwichRecipe(String condiment, String meat,
String cheese, String vegetable) {

System.out.println("1. Get two slices of bread.");

System.out.println("2. On one of the slices put some " + condiment +
".");

System.out.println("3. Put two slices of " + meat + " on the
bread.");

System.out.println("4. Put a slice of " + cheese + " on the
bread.");

System.out.println("5. Finish your sandwich with some " + vegetable +
".");

System.out.println("6. Close your sandwich with the other slice.");

System.out.println("7. Bon appétit!");

}

}