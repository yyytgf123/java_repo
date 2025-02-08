package time;

import java.time.*;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println(period);
        LocalDate currentDate = LocalDate.of(2030,1,1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println(plusDate);

        LocalDate start = LocalDate.of(2023,1,1);
        LocalDate end = LocalDate.of(2023,4,2);

        Period between = Period.between(start,end);
        System.out.println(between.getMonths()
        );
    }
}
