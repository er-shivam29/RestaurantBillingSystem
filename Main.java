package RestaurantBillingSystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        while (true) {

            System.out.println("\n===== Restaurant Billing System =====");
            System.out.println("1. Show Menu");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    restaurant.displayMenu();
                    break;

                case 2:
                    restaurant.generateBill();
                    break;

                case 3:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
