package exceptions;

public class BoundsException {
    public static void main(String[] args) {
        String test = "Hello";
        try {
            System.out.println(test.charAt(7));
        } catch (StringIndexOutOfBoundsException e) {

            int[] nums = { 10, 20, 30 };
            System.out.println(nums[3]);
        }
    }
}
