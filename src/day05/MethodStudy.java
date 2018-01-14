package day05;


import java.util.Random;

public class MethodStudy {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(99);
        int b = random.nextInt(99);

        int result = add(a,b);
        System.out.println(a + " + " + b +" = " + result);

        result = addWith2(7);
        System.out.println("addWith2(7) = " + result);
    }

    // 2개의 숫자를 더한 값을 반환 해주는 함수.
    public static int add(int a, int b) {
        return a + b;
    }

    public static int addWith2(int a) {
        int result = a + 2;
        return result;
    }
}
