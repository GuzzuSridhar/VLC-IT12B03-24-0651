package Loops;

import java.util.Scanner;

public class DoWhileLoop {

    // first iteration is always guarenteed
    public static void main(String[] args) {
        // print numbers from 1 to 10 using the while loop
        int loopVar = 1; // loop variable defined
        do {
            System.out.println(loopVar);
            loopVar++; // loop variable increment
        } while (loopVar < 11); // exit condition

        // -----------------------------
        // check for a password
        String pwd = "pass", passKey = "";
        Scanner scan = new Scanner(System.in);
        boolean isValidPwd = false;

        do {
            System.out.print("Enter Password: ");
            passKey = scan.nextLine();
            if (passKey.equalsIgnoreCase(pwd)) {
                isValidPwd = true;
                System.out.println("Welcome!");
            }
        } while (!isValidPwd);

        scan.close();
    }

}
