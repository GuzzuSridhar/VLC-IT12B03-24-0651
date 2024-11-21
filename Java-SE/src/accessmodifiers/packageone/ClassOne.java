package accessmodifiers.packageone;

import accessmodifiers.packagetwo.ClassTwo;

// check the access modifiers outside the package
public class ClassOne {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        // access all of the variables
        System.out.println(classTwo.publicVar);
        // System.out.println(classTwo.privateVar); // not allowed
        // System.out.println(classTwo.defaultVar); // not allowed
        // System.out.println(classTwo.protectedVar); // not allowed

        // access all of the methods
        classTwo.publicMethod();
        // classTwo.privateMethod(); // not allowed
        // classTwo.defaultMethod(); // not allowed
        // classTwo.protectedMethod(); // not allowed

    }
}
