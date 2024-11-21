package abstraction;

public class MayBank implements Mas { // class implementing the interface

    @Override
    public void archive(int acctno) {
        // logic
        System.out.println("Account " + acctno + " Archived!!!");
    }

    @Override
    public float fdInterest(float depAmt, int period) {
        float roi = 3.0f;
        float interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

    // other methods in this class
    void welcome() {
        System.out.println("Welcome to mayBank");
    }

}
