package basics;

public class BoxingAndUnboxing {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // boxing (implicit) convert primitive to wrapper class
        int num = 10;
        Integer test = num;

        // unboxing (implicit) converting the wrapper class to primitive
        Integer x = 10;
        int y = x;

    }
}
