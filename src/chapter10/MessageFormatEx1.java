package chapter10;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name : {0} \nTel : {1} \nAge : {2}";

        Object[] arguments = {"이름","010-0000-0000","28"};

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
