package classesandobjects.constructors;

public class ThisKeyword {
    int id;
    String name;

    public ThisKeyword(int id, String name) {
        this.id = id; // this keyword is replace with the current instance in runtime
        this.name = name;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(10, "Bill"); // this keyword now becomes "thisKeyword"
        ThisKeyword thisKeyword1 = new ThisKeyword(101, "Gates"); // this keyword now becomes "thisKeyword1"
        ThisKeyword x = new ThisKeyword(101, "Gates"); // this keyword now becomes "x"
        ThisKeyword y = new ThisKeyword(101, "Gates"); // this keyword now becomes "y"
    }

}
