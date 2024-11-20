package arrays;

import java.util.Scanner;

public class EnhancedDynamicArray {
    public static void main(String[] args) {
        // Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the # rows to be stored: ");
        int rows = input.nextInt();
        input.nextLine();
        System.out.print("Enter the # columns to be stored: ");
        int columns = input.nextInt();
        input.nextLine();

        // create an array of String type with the above dimensions
        String[][] employees = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == 0)
                    System.out.print("Enter Employee Name:");
                else
                    System.out.print("Enter Employee Salary:");
                employees[i][j] = input.nextLine();
            }
        }
        input.close();

        // printing the information
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(employees[i][j]);
            }
            System.out.println();
        }
    }
}
