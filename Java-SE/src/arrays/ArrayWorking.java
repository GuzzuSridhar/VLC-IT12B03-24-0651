package arrays;

public class ArrayWorking {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // decalre and assign values
        // the names array below has 5 as its size
        String[] names = { "Alex", "Alice", "Bill", "Sara", "Lara" };
        int[] nums = { 10, 20, 30 };

        // accessing the elements using the index
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // declare an empty array of 5 element size
        int salaries[] = new int[5]; // array to hold 5 integer values

        // assign the value to the elements in the array
        salaries[0] = 1000;
        salaries[1] = 2000;
        salaries[2] = 3000;
        salaries[3] = 4000;
        salaries[4] = 5000;

        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);
        System.out.println(salaries[4]);
        // access an non existing element
        // System.out.println(salaries[5]);

    }
}
