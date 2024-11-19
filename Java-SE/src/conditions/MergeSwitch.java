package conditions;

import java.util.Scanner;

public class MergeSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter a Day of the week (1-7): ");
        int dow = scan.nextInt();
        switch (dow) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break;
            case 6:
            case 7:
                System.out.println("Week End");
                break;
            default:
                System.out.println("Invalid day of the week");
        }
        scan.close();
    }
}
