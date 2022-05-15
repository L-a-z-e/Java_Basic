package chapter10;

import java.util.*;

public class CalendarEx1 {

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("년도 :" + today.get(Calendar.YEAR));
        System.out.println("월 : " + today.get(Calendar.MONTH));
        System.out.println("몇째주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
    }




}
