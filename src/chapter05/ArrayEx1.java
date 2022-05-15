package chapter05;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int [] score = new int[5];
        score[0] = 50;
        score[1] = 60;
        score[2] = 70;
        score[3] = 80;
        score[4] = 90;

        int [] score2 = new int[5];

        for ( int i = 0 ; i < score2.length ; i++ ){
            score2[i] = i * 10 + 50;
            System.out.println(score2[i] + "점");
        }

        System.out.println(Arrays.toString(score) + "점 (score1)");

        int [] test = new int[10];
        System.out.println(Arrays.toString(test)); // 0 으로 초기화

        int [] test2 = {10,20,30,40,50};

        for( int i = 0 ; i < test2.length ; i++){
            test[i] = test2[i];
        }

        System.out.println("test");
        System.out.println(Arrays.toString(test));
        System.out.println("test2");
        System.out.println(Arrays.toString(test2));

        test = test2;

        System.out.println("test");
        System.out.println(Arrays.toString(test));
        System.out.println("test2");
        System.out.println(Arrays.toString(test2));

        int test3[] = new int[5];
        System.out.println(Arrays.toString(test3));

        int test4[] = {1,2,3,4,5};

        test3 = test4;

        System.out.println(Arrays.toString(test3));


        int test5[] = new int[5];
        System.out.println(Arrays.toString(test5));
        System.arraycopy(test4, 0, test5, 0, test4.length);
        System.out.println(Arrays.toString(test5));




    }
}
