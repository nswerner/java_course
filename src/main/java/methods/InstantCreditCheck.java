package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean isQualified = isUserQualified(salary, creditScore);
        notifyUser(isQualified);
    }

    private static void notifyUser(boolean isQualified) {
        if (isQualified) System.out.println("Congrats! You're qualified!");
        else System.out.println("Sorry, you are not qualified for this purchase.");
    }

    public static double getSalary() {
        System.out.println("Enter your salary");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }
}
