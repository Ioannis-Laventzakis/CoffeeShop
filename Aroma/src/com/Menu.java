package com;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        System.out.println("com.Menu:");
        System.out.println("1. Sweets 100g-2.50");
        System.out.println("2. Cupcake 100g-2.50");
        System.out.println("3. Doughnut 100-2.00");
        System.out.println("4. Croissant 100g-1.50");
        System.out.println("5. Cheesecake 100g-3.00");
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
                itemName = "Sweets";
        }

    }
}
