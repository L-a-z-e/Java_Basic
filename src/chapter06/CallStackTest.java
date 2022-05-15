package chapter06;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod(){
        secondMethod();
        System.out.println("first Method");
    }

    static void secondMethod(){
        System.out.println("second Method");
    }
}
