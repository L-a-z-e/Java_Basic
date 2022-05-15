package chapter10;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {

        final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2022,Calendar.MAY, 15);
        date2.set(2022,4,16);
        System.out.println("date1 : " + toString(date1));
        System.out.println("date2 : " + toString(date2));

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;

        System.out.println("date2 - date1 초" + difference);
        System.out.println("date2 - date1 일" + difference/24/60/60);
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1) + "월" + date.get(Calendar.DATE) + "일";

    }
}
