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

        // looping multi dimentional array
        int[][] table = new int[3][3]; // create a blank array of 3 rows and 3 columns

        // put in the values to the elements
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[1][0] = 4;
        table[1][1] = 5;
        table[1][2] = 6;
        table[2][0] = 7;
        table[2][1] = 8;
        table[2][2] = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
