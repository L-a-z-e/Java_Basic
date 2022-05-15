package chapter10;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "000000.000",
                "######.###",
                "-#.#",
                "0000E0",
                "000.000E0",
                "###E0",
                "###.###E0",
                "#.#\u2030",
                "\u00A4 #,###",
                "''#,###"
        };

        for (int i = 0 ; i < pattern.length ; i++){
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.println(df.format(number));
        }
    }
}
