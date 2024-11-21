package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<Integer> nums = new ArrayList<>();

    // arraylists are part of collections in java
    // ArrayList is a generic class
    // ArrayList works with reference types and not primitives
    // has got a set of methods

    public static void main(String[] args) {

        // ArrayList<int> nums = new ArrayList<>(); // not allowed with primitive types

        // to add elements to names
        names.add("Alex");
        names.add("David");
        names.add("James");
        names.add("Jim");
        names.add("James");

        // add elements to nums
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);

        // print the list elements
        getNames();
        System.out.println("----------");
        getNums();
        System.out.println("----------");

        // methods in ArrayList
        // size
        System.out.println(names.size()); // the # elements in the list
        System.out.println(nums.size()); // the # elements in the list
        System.out.println("----------");

        // set
        names.set(0, "Alice");
        getNames();
        System.out.println("----------");

        // get
        System.out.println(names.get(names.size() - 1));
        System.out.println(names.get(3));

        System.out.println("----------");
        // remove
        names.remove(1);
        getNames();
        System.out.println("----------");

        // exists
        boolean doesExist = names.contains("Alex");
        System.out.println(doesExist);
        System.out.println("----------");

        // indexOf
        int idx = names.indexOf("Alice");
        System.out.println(idx); // returns index of the element or -1 if not present otherwise the index
        System.out.println("----------");

        // isEmpty
        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);
        System.out.println("----------");

        // clear the list
        names.clear();
        System.out.println("----------");
        getNames();
        System.out.println("----------");

    }

    static void getNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    static void getNums() {
        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}
