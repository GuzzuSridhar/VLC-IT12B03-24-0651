package dates;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        LocalTime currTime = LocalTime.now();
        System.out.println(currTime);

        // access parameters of the time
        System.out.println(currTime.getHour());
        System.out.println(currTime.getMinute());
        System.out.println(currTime.getSecond());
        System.out.println(currTime.getNano());

        // custom time
        LocalTime showTime = LocalTime.of(10, 20);
        LocalTime showTime1 = LocalTime.of(10, 20, 50);
        LocalTime showTime2 = LocalTime.of(10, 20, 50, 1000);

        System.out.println(showTime);
        // formatting the time
        System.out.println(showTime.format(DateTimeFormatter.ofPattern("hh:mm a")));

        // display time in a different time zone
        LocalTime timeInSg = LocalTime.now(ZoneId.of("Asia/Singapore"));
        LocalTime timeInInd = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(timeInSg);
        System.out.println(timeInInd);

    }
}
