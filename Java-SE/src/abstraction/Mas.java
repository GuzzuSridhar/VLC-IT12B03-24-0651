package abstraction;

public interface Mas {
    // static final feilds
    static final int archivePeriod = 48;

    // can have abstract methods
    void archive(int acctno);

    float fdInterest(float depAmt, int period);

}
