package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputError {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int i = scan.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("Enter a Valid Number.");
        }
        scan.close();
    }
}
