import java.util.Scanner;


public class Aroma {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double totalCost = 0.0;

        System.out.println("Welcome to the Aroma Coffee Shop!");
        System.out.println("Menu:");
        System.out.println("1. Espresso - $2.50");
        System.out.println("2. Cappuccino - $3.00");
        System.out.println("3. Latte - 3.50");
        System.out.println("4. Frappe - 2.00");
        System.out.println("5. Toast - 2.00");
        System.out.println("6. Exit");

        while (true){
            System.out.println("Enter");
            int choice = scanner.nextInt();

            if (choice == 6){
                break;
            }

            double price = 0.0;
            String itemName = "";

            switch (choice){
                case 1:
                    itemName = "Espresso";
                    price = 2.50;
                    break;
                case 2:
                    itemName = "Cappuccino";
                    price = 3.00;
                    break;
                case 3:
                    itemName = "Latte";
                    price = 3.50;
                    break;
                case 4:
                    itemName = "Frappe";
                    price = 2.00;
                    break;
                case 5:
                    itemName = "Toast";
                    price = 2.00;
                    break;
                default:
                    System.out.println("invalid choice. Please select a valid option");
                    continue;
            }
            System.out.println("You've ordered a" + itemName + "for $" + price);
            totalCost += price;
        }
        System.out.println("Thank you for your order!");
        System.out.println("Total Cost: $" + totalCost);
        scanner.close();

    }
}
