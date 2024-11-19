package activities;

import java.util.Scanner;

public class SalIncrement {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Accept user's salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Initialize variables for increment and new salary
        double incrementPercentage;
        double newSalary;

        // Determine increment percentage based on salary
        if (salary > 5000) {
            incrementPercentage = 5.0;
        } else if (salary >= 3000 && salary <= 4999) {
            incrementPercentage = 6.0;
        } else { // salary < 3000
            incrementPercentage = 7.0;
        }

        // Calculate the increment amount and the new salary
        double incrementAmount = salary * incrementPercentage / 100;
        newSalary = salary + incrementAmount;

        // Display the old salary, increment percentage, and the new salary
        System.out.printf("Old Salary: %.2f%n", salary);
        System.out.printf("Increment Percentage: %.2f%%%n", incrementPercentage);
        System.out.printf("Incremented Salary: %.2f%n", newSalary);

        // Close the scanner
        scanner.close();
    }
}
