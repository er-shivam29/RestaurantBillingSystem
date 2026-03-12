package RestaurantBillingSystem;

import java.util.*;

class Restaurant {

    private Map<Integer, MenuItem> menu = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public Restaurant() {
        menu.put(1, new MenuItem("Burger", 120));
        menu.put(2, new MenuItem("Pizza", 250));
        menu.put(3, new MenuItem("Pasta", 180));
        menu.put(4, new MenuItem("Coffee", 80));
    }

    public void displayMenu() {
        System.out.println("\n----- MENU -----");

        for (int key : menu.keySet()) {
            MenuItem item = menu.get(key);
            System.out.println(key + ". " + item.getName() + " - ₹" + item.getPrice());
        }
    }

    public void generateBill() {

        double total = 0;

        while (true) {

            displayMenu();

            System.out.print("Enter item number (0 to finish): ");
            int choice = sc.nextInt();

            if (choice == 0)
                break;

            if (!menu.containsKey(choice)) {
                System.out.println("Invalid item!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            MenuItem item = menu.get(choice);

            total += item.getPrice() * qty;
        }

        double gst = total * 0.05;

        System.out.println("\nSubtotal : ₹" + total);
        System.out.println("GST (5%) : ₹" + gst);
        System.out.println("Total Bill : ₹" + (total + gst));
    }
}
