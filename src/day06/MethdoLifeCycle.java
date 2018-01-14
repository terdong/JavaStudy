package day06;

public class MethdoLifeCycle {
    public static void main(String[] args) {

        a();
        // b();
        // c();
    }

    public static void a(){
        System.out.println("a 메소드 호출");

        int result = b();

        //int result1 = 0;
        //int result2 = result1 = 1+1;

        System.out.println("b 메소드의 반환 값은:" + result + " 입니다.");

        System.out.println("a 메소드 끝");
    }

    public static int b(){
        System.out.println("b 메소드 호출");

        int result = c();
        System.out.println("c 메소드의 반환 값은:" + result + " 입니다.");

        System.out.println("b 메소드 끝");
        return 0;
    }

    public static int c(){
        System.out.println("c 메소드 호출");

        System.out.println("c 메소드 끝");
        return 1;
    }

}
