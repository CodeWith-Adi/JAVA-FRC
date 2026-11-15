
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] items = {
            "Milk", "Bread", "Eggs", "Rice",
            "Sugar", "Butter", "Apples", "Potatoes"
        };

        int[] stock = {10, 15, 20, 25, 30, 12, 18, 40};

        ArrayList<String> cart = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== GROCERY STORE =====");
            System.out.println("1. View Inventory");
            System.out.println("2. Add to Cart");
            System.out.println("3. Remove from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n===== INVENTORY =====");

                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i] + " : " + stock[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter item name: ");
                    String addItem = sc.next();

                    boolean found = false;

                    for (int i = 0; i < items.length; i++) {
                        if (items[i].equalsIgnoreCase(addItem)) {
                            found = true;

                            if (stock[i] > 0) {
                                cart.add(items[i]);
                                stock[i]--;
                                System.out.println(items[i] + " added to cart.");
                            } else {
                                System.out.println("Item is out of stock.");
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = sc.next();

                    if (cart.remove(removeItem)) {
                        for (int i = 0; i < items.length; i++) {
                            if (items[i].equalsIgnoreCase(removeItem)) {
                                stock[i]++;
                                System.out.println(removeItem + " removed from cart.");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Item not found in cart.");
                    }
                    break;

                case 4:
                    System.out.println("\n===== YOUR CART =====");

                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        for (String item : cart) {
                            System.out.println(item);
                        }

                        System.out.println("Total items: " + cart.size());
                    }
                    break;

                case 5:
                    System.out.println("\n===== CHECKOUT =====");

                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        for (String item : cart) {
                            System.out.println(item);
                        }

                        System.out.println("Total items purchased: " + cart.size());

                        cart.clear();

                        System.out.println("Thank you for shopping!");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
