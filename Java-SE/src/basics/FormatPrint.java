package basics;

public class FormatPrint {
    public static void main(String[] args) {
        String fname = "David";
        String lname = "Boon";
        int age = 45;
        String loc = "Singapore";

        // using the printf statement
        System.out.printf("Hello %s, you are %d years old. you are from %s \n", fname, age, loc);

        // right justify the columns

        System.out.printf("%10s %2d %20s \n", fname, age, loc);

        fname = "Ben";
        lname = "Boon";
        age = 25;
        loc = "Kl";
        System.out.printf("%10s %2d %20s \n", fname, age, loc);

        // left justify the columns

        System.out.printf("%-10s %-2d %-20s \n", fname, age, loc);

        fname = "David";
        lname = "Boon";
        age = 25;
        loc = "Singapore";
        System.out.printf("%-10s %-2d %-20s \n", fname, age, loc);
    }
}
