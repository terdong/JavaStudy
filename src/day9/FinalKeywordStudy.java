package day9;

public class FinalKeywordStudy {

    //프로그램 시작시 최초로 한번 정의되는 변수.
    // 클래스 이름으로 호출가능하며(FinalKeywordStudy.number1) 값 변경 가능.
    static int number1 = 99;

    //프로그램 시작시 최초로 한번 정의되는 변수.
    // 클래스 이름으로 호출가능하며(FinalKeywordStudy.number1) 값 변경은 불가능.
    static final int number2 = 99;

    // 멤버 변수
    int number3;

    // 값 변경 불가능한 멤버 변수.
    // 최초의 초기값을 정의해주어야 한다.
    final int number4 = 99;

    // 메소드 혹은 class에 final 키워드 의미는 후반부에 알아봅시다.
    public final void add(int a){
        System.out.println("a + 3" + a + 3);
    }

    public static void main(String[] args) {
        System.out.println("FinalKeywordStudy 시작");

        // final은 변수의 값을 변경 못하게끔 잠구는 keyword 입니다.
        final int a = 10;
        // a 변수의 값을 변경 불가능합니다.
        //a = 11;

        System.out.println("number = " + number1);

        // number 에 다시 +1 한 값을 저장한 후에 결과를 출력해보세요.
        //number += 1;

        FinalKeywordStudy.number1 = 99;
        FinalKeywordStudy.number1 = 100;

        //FinalKeywordStudy.number2 = 100;

        FinalKeywordStudy object = new FinalKeywordStudy();
        object.number3 = 99;
        object.number3 = 100;

        // final 멤버변수기 때문에 값을 바꾸려고 하면 에러가 난다.
        //object.number4 = 1;
        // 그러나 호출은 가능하다.
        System.out.println("object.number4 = " + object.number4);

    }
}
