package Loops;

public class BreakDemo {
    // break statement quits the loop
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("this line is executed");
    }
}
