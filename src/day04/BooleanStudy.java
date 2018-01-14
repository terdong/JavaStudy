package day04;

public class BooleanStudy {
    public static void main(String[] args) {

        // Boolean 타입은 true 혹은 false 값만 가질 수 있다.
        Boolean bTrue = true;
        Boolean bFalse = false;

        Boolean b;

        // "b = 1000 < 1001" 는 "b = true" 와 같다.
        b = 1000 < 1001;

        // b 는 true 이므로 if문이 실행된다.
        if(b){
            System.out.println("1이 2보다 작다");
        }else{
            System.out.println("이 구문은 실행되지 않는다.");
        }

        System.out.println("###############################");
        System.out.println("논리 연산 알아보기");

        Boolean b2;
        // A, B: Boolean 또는 조건식만 가능

        // &&: A&&B A와 B가 둘다 true 일때 true를 반환한다.
        b2 = 1 < 2 && true;
        System.out.println("A&&B = " + b2);

        // ||: A||B A 또는 B가 true 일 때 true를 반환한다.
        b2 = 1 > 2 || true;
        System.out.println("A||B = " + b2);

        // !: !A 는 A의 부정
        // 만약 A = true 일때 !A 는 false 가 되고,
        // A = false 일떄 !A는 true가 된다.
        b2 = !(1 > 2);
        System.out.println("!A = " + b2);

    }
}
