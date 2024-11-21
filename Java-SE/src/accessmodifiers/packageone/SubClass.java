package accessmodifiers.packageone;

import accessmodifiers.packagetwo.ClassTwo;

// access modifiers out side the package in a subclass
public class SubClass extends ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        SubClass subClass = new SubClass();
        // access all of the variables
        System.out.println(classTwo.publicVar);
        // System.out.println(classTwo.privateVar);
        // System.out.println(classTwo.defaultVar);
        // System.out.println(classTwo.protectedVar);
        System.out.println(subClass.protectedVar);

        // access all of the methods
        classTwo.publicMethod();
        // classTwo.privateMethod();
        // classTwo.defaultMethod();
        // classTwo.protectedMethod();
        subClass.protectedMethod();

    }
}
