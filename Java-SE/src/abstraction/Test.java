package abstraction;

public abstract class Test {
    // abstract methods
    abstract void testAbs();

    abstract int add(int n1, int n2);

    // concrete methods
    int subtract(int n1, int n2) {
        return n1 - n2;
    }

}
