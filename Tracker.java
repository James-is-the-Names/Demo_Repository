/* Lab 12 Explores Github and Repositories
 * COMP 253
 * James Dvorak
 * 12-10-23
 */

// Designates that the java class is within the src package
package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tracker {

    // Initializing variables
    private static Map<String, Integer> foodCaloriesMap = new HashMap<>();
    private static int totalCalories = 0;

    public static void addFood(Scanner scanner) {
        System.out.print("Enter the name of the food: ");
        String foodName = scanner.nextLine();

        System.out.print("Enter the number of calories in your food, " + foodName + ": ");
        int calories = scanner.nextInt();

        // Update the total calories and food map
        totalCalories += calories;
        foodCaloriesMap.put(foodName, calories);

        System.out.println(foodName + "Your food was added to the list.");
    }

    // Method to view the food list and total calories
    public static void viewFoodList() {
        System.out.println("Food List:");
        for (Map.Entry<String, Integer> entry : foodCaloriesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " calories");
        }
        System.out.println("Total Calories: " + totalCalories);
    }

}