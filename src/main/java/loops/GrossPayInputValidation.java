package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hour did your work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours) {
            System.out.println("Invalid entry. Your hours must be between 1 & 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();
        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay: " +  grossPay);
    }

}
