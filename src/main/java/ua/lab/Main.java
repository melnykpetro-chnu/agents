package ua.lab;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        UserService userService = new UserService();

        List<Product> products = List.of(
//                new Product("Laptop", 1000.0, 1),
//                new Product("Mouse", 50.0, 2),
//                new Product("Keyboard", 80.0, 1)
        );

        User user = new User("John Smith");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("=== Simple Shop ===");
            System.out.println("1. Calculate order total");
            System.out.println("2. Show average product price");
            System.out.println("3. Show user");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1" -> {
                        double total = orderService.calculateTotal(products, 0.10);
                        System.out.printf("Total with 10%% discount: %.2f%n", total);
                    }
                    case "2" -> {
                        double average = orderService.averagePrice(products);
                        System.out.printf("Average price: %.2f%n", average);
                    }
                    case "3" -> System.out.println(userService.formatUser(user));
                    case "0" -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Unknown option.");
                }
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
