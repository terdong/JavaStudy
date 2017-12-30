package day5;

public class Method2Study {
    public static void main(String[] args) {

        System.out.println("addType1(3,4) = " + addType1(3,4));

        System.out.print("addType2(6,5) = ");
        addType2(6,5);

        System.out.println("addType3() = " + addType3());

        System.out.print("addType4() = ");
        addType4();
    }

    // 리턴 타입과, 매개 변수가 둘 다 있는 메소드
    public static int addType1(int a, int b){
        return a + b;
    }

    // 매개 변수만 있는 메소드
    public static void addType2(int a, int b){
        int result = a + b;
        System.out.println("a + b = " + result);
    }

    // 리턴 타입만 있는 메소드
    public static int addType3(){
        int a = 3;
        int b = 11;
        return a + b;
    }

    // 리턴 타입과 매개변수가 없는 메소드드
    public static void addType4(){
        int a = 3;
        int b = 11;
        int result = a + b;
        System.out.println("a + b = " + result);
    }
}
