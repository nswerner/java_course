package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items you would like to scan");

        int quantity = scanner.nextInt();
        double total = 0;

        System.out.println("Enter the cost of your item");
        double price = scanner.nextDouble();

        for (int i = 0; i < quantity; i++) {
            total = total + price;
        }

        System.out.println("Your total is: $" + total);
        scanner.close();
    }
}
