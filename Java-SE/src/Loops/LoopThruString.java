package Loops;

public class LoopThruString {
    public static void main(String[] args) {
        String test = "Hello";
        // loop thru the characters of String
        // print H E L L O
        for (int i = 0; i < test.length(); i++) {
            System.out.print(test.toUpperCase().charAt(i) + " ");
        }
    }
}
