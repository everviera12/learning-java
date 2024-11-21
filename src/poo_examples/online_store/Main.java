package poo_examples.online_store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many products do you want to enter?");
        int productCount = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[productCount];

        for (int i = 0; i < productCount; i++) {
            System.out.println("\nEnter the details for product #" + (i + 1));

            System.out.println("Enter the brand name: ");
            String brand_product = scanner.nextLine();

            System.out.println("Enter the price of the product: ");
            double price_product = scanner.nextDouble();
            scanner.nextLine();

            int option = 0;

            while (option != 1 && option != 2) {
                System.out.println("Is it a laptop (1) or phone (2)? ");
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Enter the processor of the laptop: ");
                        String processor_laptop = scanner.nextLine();
                        products[i] = new Laptop(brand_product, price_product, processor_laptop);
                        break;

                    case 2:
                        System.out.println("Enter the phone company of your phone: ");
                        String phone_company = scanner.nextLine();
                        products[i] = new Phone(brand_product, price_product, phone_company);
                        break;

                    default:
                        System.out.println("Invalid option! Please enter 1 for Laptop or 2 for Phone.");
                        break;
                }
            }
        }

        System.out.println("\nProduct details:");
        for (Product product : products) {
            product.ProductDetails();
        }
    }
}
