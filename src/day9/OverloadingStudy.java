package day9;

public class OverloadingStudy {

    public void add(int number){
        int result = number + 3;
        System.out.println("result = " + result);
    }
    public void add(int a, int b){
        int result = a + b;
        System.out.println("int type result = " + result);
    }

    public void add(float a, float b){
        float result = a + b;
        System.out.println("float type result = " + result);
    }

    public void add(byte a, int b){
        float result = a + b;
        System.out.println("float type result = " + result);
    }

    public void add(int a, int b, int c){
        int result = a + b + c;
        System.out.println("result = " + result);
    }

    // return 타입이 틀리면 오버로딩 메소드로 정의할 수 없다.
/*    public int add(int a, int b, int c){
        int result = a + b + c;
        System.out.println("result = " + result);
    }*/

    public static void main(String[] args) {

        System.out.println("OverloadingStudy 시작");

        // OverloadingStudy 객체 생성해서 add 메소드를 호출 해보세요.
        OverloadingStudy ols = new OverloadingStudy();
        ols.add(99);
        ols.add(1, 2);
        ols.add(1f, 2f);
        ols.add(1, 2,3);

        byte b= 8;
        ols.add(8,1);
        ols.add(b,1);
    }
}
