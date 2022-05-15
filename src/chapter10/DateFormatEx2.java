package chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        // 지정된 형식과 입력이 일치하지 않는 경우 예외 처리가 필요함
        try{
            Date d = df.parse("2022년 05월 15일");
            System.out.println(df2.format(d));
        }catch (Exception e){

        }
    }
}
