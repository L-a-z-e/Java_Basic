package chapter06;
class Data{
    int d = 10;
}
public class primitiveParamTest {
    public static void main(String[] args) {

        Data data = new Data();
        System.out.println(data.d);

        Change(data.d);

        System.out.println(data.d);


    }

    static void Change(int x){
        x = 1000;
    }

}
