package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // to accept the user Input we need a Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.print("What is your Name? ");
        String name = input.nextLine();
        System.out.print("What is your Age? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Where are you from? ");
        String loc = input.nextLine();
        System.out.println("Hello!, " + name + ", you are " + age + " years old." + " you are from " + loc);
        input.close();
    }
}
