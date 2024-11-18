package basics;

public class ByteCasting {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);

        byte c = (byte) 130;
        System.out.println(c); // the result is -126 (byte uses circullar assignment beyond range)

    }
}
