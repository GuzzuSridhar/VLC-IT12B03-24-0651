package methods;

public class MethodOverLoad {
    // rules of method overload
    // The name of the method should be the same
    /*
     * Number of parameters can change
     * Types of the parameters can change
     * Order of the parameters can change
     * return type can change
     * Access modifier can be changed
     */

    float add(float n1, float n2) {
        return n1 + n2;
    }

    float add(float n1, float n2, float n3) {
        return n1 + n2 + n3;
    }

    String add(String n1, String n2, String n3) {
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
        MethodOverLoad mo = new MethodOverLoad();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(10, 20, 30));
        System.out.println(mo.add("Hello", "World", "Java"));
    }

}
