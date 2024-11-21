package abstraction;

public interface Mas {
    // static final feilds
    static final int archivePeriod = 48;

    // can have abstract methods
    void archive(int acctno);

    float fdInterest(float depAmt, int period);

    // static method are concrete in a interface
    static void closeAcct(int acctno) {
        System.out.println("Account closed");
    }

    void newAbstract();

    // default methods will be concrecete
    default void moreAbstracts() {
    }

}
