package chapter10;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class TimeEx2 {
    public static void main(String[] args) {
        Date date2 = new Date();
        LocalDate date = LocalDate.of(2022,05,15);
        LocalTime time = LocalTime.of(14,42,00);
        LocalDateTime dt = LocalDateTime.of(date,time);
        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zid);
        String strZid = zdt.getZone().toString();

        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York" );
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        OffsetDateTime offsetDateTime = zdt.toOffsetDateTime();



        System.out.println(dt);
        System.out.println(zid);
        System.out.println(strZid);
        System.out.println(seoulTime);
        System.out.println(nyTime);
        System.out.println(offsetDateTime);

    }
}
