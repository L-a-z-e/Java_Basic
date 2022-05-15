package chapter06;

import java.util.Arrays;

class DataArray{
    int data[] = {1,2,3};

}

class Data2{
    int data = 10;
}
public class RefferenceParamTest {
    public static void main(String[] args) {
        DataArray d = new DataArray();
        System.out.println(Arrays.toString(d.data));

        Change(d.data);
        System.out.println(Arrays.toString(d.data));

        Data2 d2 = new Data2();
        System.out.println(d2.data);
        Change2(d2);
        System.out.println(d2.data);


    }

    static void Change(int[] x){
        for (int i = 0 ; i < x.length ; i++ ){
            x[i] = i;
        }
    }

    static void Change2(Data2 x){
        x.data = 1000;
    }
}
