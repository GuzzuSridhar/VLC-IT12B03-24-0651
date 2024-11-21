package accessmodifiers.packageone;

import accessmodifiers.packagetwo.ClassTwo;

public class SubClass {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        // access all of the variables
        System.out.println(classTwo.publicVar);
        // System.out.println(classTwo.privateVar);
        // System.out.println(classTwo.defaultVar);
        // System.out.println(classTwo.protectedVar);

        // access all of the methods
        classTwo.publicMethod();
        // classTwo.privateMethod();
        // classTwo.defaultMethod();
        // classTwo.protectedMethod();

    }
}
