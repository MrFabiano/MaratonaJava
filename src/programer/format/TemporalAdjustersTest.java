package programer.format;

import java.time.LocalDate;

public class TemporalAdjustersTest {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.plusDays(0);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
