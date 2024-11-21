package abstraction;

public class CitiBankDriver {
    public static void main(String[] args) {
        CitiBank citiBank = new CitiBank();

        System.out.println(citiBank.fdInterest(1000, 12));
        citiBank.archive(200);
    }
}
