package day04;

public class PrimitiveTypeStudy {

    // 클래스 멤버변수(필드)는 초기화를 안해주어도 값이 기본값으로 정의된다.
    private byte bb;

    public static void main(String[] args) {

        // 그러나 메소드안에서 선언된 primitive type 변수들은 값을 초기화(정의) 해주어야 한다.
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        float f = 0;
        double d = 0;
        char c = 0;
        boolean bool = true;

        int i2;
        i2 = 100;

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("bool = " + bool);
        System.out.println("i2 = " + i2);
        // ...

        PrimitiveTypeStudy p = new PrimitiveTypeStudy();
        System.out.println("p.bb = " + p.bb);
    }
}
