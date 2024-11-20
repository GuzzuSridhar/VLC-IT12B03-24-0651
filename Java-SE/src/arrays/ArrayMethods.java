package arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        // declare an array instantiate of size 5
        int[] nums = { 100, 111, 102, 105, 104 };

        // Array methods
        // length
        System.out.println(nums.length);

        // print the array
        System.out.println(Arrays.toString(nums));

        // sort Array
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // Array Search
        int res = Arrays.binarySearch(nums, 104);
        System.out.println(res); // the array has to be sorted before usin the binarySearch
        System.out.println((res > 0) ? "value present" : "value not present");

        // fill array
        int[] x = new int[5];
        Arrays.fill(x, 3);
        System.out.println(Arrays.toString(x));

        // compare arrays
        int[] y = new int[5];
        Arrays.fill(y, 3);

        System.out.println(Arrays.compare(x, y));

        // copy arrays
        int[] copy = Arrays.copyOf(y, 3);
        System.out.println(Arrays.toString(copy));

    }
}
