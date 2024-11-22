package dates;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        // variable of type LocalDate to store current date
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // accesing parameters of the date
        System.out.println(today.getYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfWeek());

        // work with custom dates
        LocalDate birthDay = LocalDate.of(2000, 1, 25);
        System.out.println(birthDay);
        // accesing parameters of the date
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonthValue());
        System.out.println(birthDay.getDayOfMonth());

        System.out.println(birthDay.getYear() + " - " + birthDay.getMonthValue() + " - " + birthDay.getDayOfMonth());
    }
}
