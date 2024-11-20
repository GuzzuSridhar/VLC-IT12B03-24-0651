package arrays;

public class Loops {
    public static void main(String[] args) {
        String[] names = { "Alex", "Alice", "Bill", "Sara", "Lara" };
        int[] nums = { 10, 20, 30, 40, 50, 60, 70 };

        // looping thru arrays using while loop (not preferred)
        System.out.println("Using the While Loop");
        int arrLen = names.length;
        int index = 0;
        while (index < arrLen) {
            System.out.println(names[index]);
            index++;
        }

        // using for loop (preferred way)
        System.out.println("Using the for Loop");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-------------");
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
