package day03;

public class DataOperationStudy {
    public static void main(String[] args) {

        int a = 11;
        int b = 8;

        // 논리곱 계산
        int andOp = a & b;
        // 논리합 계산
        int orOp = a | b;
        // 배타적 논리합 계산
        int xOrOp = a ^ b;
        // 1의 보수값
        int notOpA = ~a;
        int notOpB = ~b;

        System.out.print("a의 10진수 값 = " + a);
        System.out.println(", a의 2진수 값 = " + Integer.toBinaryString(a));

        System.out.print("b의 10진수 값 = " + b);
        System.out.println(", b의 2진수 값 =  " + Integer.toBinaryString(b));

        System.out.println();

        System.out.println("a + b = " + (a + b) );
        System.out.println("(2진수)a + b = " + Integer.toBinaryString(a+b) );
        System.out.println("a & b = " + andOp);
        System.out.println("a | b = " + orOp);
        System.out.println("a ^ b = " + xOrOp);
        System.out.println("~a = " + notOpA);
        System.out.println("~b = " + notOpB);






    }
}
