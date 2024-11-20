package methods;

public class Student {
    // feilds
    int sno;
    String sname;
    float marksInEnglish;
    float marksInMath;
    float markInScience;

    // instance methods
    public float getTotal() {
        return markInScience + marksInMath + marksInEnglish; // return statement is the last statement in a method
    }

    static void greet() {
        System.out.println("Welcome to my school");
    }

    public static void main(String[] args) {
        Student.greet();
        Student stud = new Student();
        stud.sno = 1;
        stud.sname = "Tony";
        stud.markInScience = 87;
        stud.marksInMath = 67;
        stud.marksInEnglish = 75;

        System.out.println(stud.getTotal());

    }
}
