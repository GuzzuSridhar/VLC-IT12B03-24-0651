package abstraction;

public class CitiBank implements Mas {

    @Override
    public void archive(int acctno) {
        // logic
        System.out.println("Account " + acctno + " Archived");
    }

    @Override
    public float fdInterest(float depAmt, int period) {
        float roi = 3.5f;
        float interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

    // other methods of this class
    void greet() {
        System.out.println("Hello");
    }

    @Override
    public void newAbstract() {
    }

}
