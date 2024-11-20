package arrays;

public class Multidimentional {
    public static void main(String[] args) {
        // multi dimentional Arrays [][]
        int[][] tab = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.println(tab[0][0]);
        System.out.println(tab[0][1]);
        System.out.println(tab[1][0]);
        System.out.println(tab[1][1]);
        System.out.println(tab[2][0]);
        System.out.println(tab[2][1]);

        // create a blank multi dimentional array
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

        System.out.println(table[0][0]);
        System.out.println(table[0][1]);
        System.out.println(table[0][2]);
        System.out.println(table[1][0]);
        System.out.println(table[1][1]);
        System.out.println(table[1][2]);
        System.out.println(table[2][0]);
        System.out.println(table[2][1]);
        System.out.println(table[2][2]);

    }
}
