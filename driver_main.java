/* Lab 12 Explores GitHub and Repositories
 * COMP 253
 * James Dvorak
 * 12-10-23
 */

package src;

import java.util.Scanner;

public class driver_main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();

        int choice;
        do {
            System.out.println("Lab 12: Github Demo, James Dvorak");
            System.out.println("\tFood Tracker Menu:");
            System.out.println("\t1. Add Food and Calories");
            System.out.println("\t2. View Food List and Total Calories");
            System.out.println("\t3. Exit");
            System.out.print("\nEnter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            // Switch statement to handle user choices
            switch (choice) {
                case 1:
                    tracker.addFood(scanner);
                    break;
                case 2:
                    tracker.viewFoodList();
                    break;
                case 3:
                    System.out.println("Thank you for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3);

        scanner.close();
    }
}