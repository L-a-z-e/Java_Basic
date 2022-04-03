package chapter02;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf(" f : %f%n",f); // 7자리에서 반올림
        System.out.printf(" f : %24.20f%n",f); // 유효 7자리
        System.out.printf(" f2 : %24.20f%n",f2); // 유효 7자리
        System.out.printf(" d : %24.20f%n",d); // 유효 15자리
    }
}
