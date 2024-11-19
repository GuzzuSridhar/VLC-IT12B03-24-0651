package Loops;

public class ContunueDemo {
    // Continue statement exits the current iteration
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 5 || i == 7 || i == 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
