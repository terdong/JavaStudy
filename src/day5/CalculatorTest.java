package day5;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        int result = 0;

        result = add(a,b);
        System.out.println("a + b = " + result);

        result = subtract(a,b);
        System.out.println("a - b = " + result);

        result = multiple(a, b);
        System.out.println("a * b = " + result);

        result = divide(a,b);
        System.out.println("a / b = " + result );

        result = remain(a,b);
        System.out.println("a % b = " + result );
    }

    // 더하기 메소드
    public static int add(int a, int b){
        return a + b;
    }
    // 빼기 메소드
    public static int subtract(int a, int b){
        return a - b;
    }
    // 곱하기 메소드
    public static int multiple(int a, int b){
        return a * b;
    }
    // 나누기 메소드
    public static int divide(int a, int b){
        return a / b;
    }

    // 나머지 메소드
    public static int remain(int a, int b){
        return a % b;
    }

}
