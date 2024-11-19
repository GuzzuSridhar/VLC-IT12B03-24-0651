package Loops;

public class NestedLoops {
    public static void main(String[] args) {
        // print multiplication table of 5
        for (int i = 1; i < 11; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // print multiplication tables from 1 to 5
        for (int i = 1; i < 6; i++) {
            System.out.println("Table of " + i);
            System.out.println("---------------");
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
