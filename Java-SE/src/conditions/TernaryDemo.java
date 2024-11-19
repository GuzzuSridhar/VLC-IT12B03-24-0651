package conditions;

public class TernaryDemo {
    public static void main(String[] args) {
        // shortcut for if - else condition
        // syntax (condition) ? statement if true : statement if false
        int age = 14;
        String status = (age > 18) ? "You are a Major" : "You are a Minor";
        System.out.println(status);
    }
}
