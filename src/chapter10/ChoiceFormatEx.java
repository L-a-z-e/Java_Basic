package chapter10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
    public static void main(String[] args) {
        double[] limits = {60,70,80,90};
        String[] grades = {"D","C","B","A"};

        int[] scores = {23,62,90,82,100,77};

        ChoiceFormat form = new ChoiceFormat(limits,grades);

        for(int i=0; i < scores.length ; i++){
            System.out.println(scores[i] + " : " + form.format(scores[i]));
        }
    }
}
