package day02;

public class IfStudy {
    public static void main(String [] args){

        /*if(*//*조건문*//*){

        }*/

        /*
        조건문의 조건 식은
        <, >, <=, >=, ==, != 형태로 사용 가능하다.
         */
        System.out.println("조건문의 조건식 연산기호는 <, >, <=, >=, ==, != 형태로 사용 가능하다.");

        // if 문이 실행 된다.
        if(1 < 2){
            System.out.println("1은 2보다 작다.");
        }else{
            System.out.println("1은 2보다 작지 않다. 즉, 위에 식은 거짓이다.");
        }

        // else 문이 실행된다.
        if(1 > 2){
            System.out.println("1은 2보다 크다.");
        }else{
            System.out.println("1은 2보다 크지 않다. 즉, 위에 식은 거짓이다.");
        }

        if(1 == 1){
            System.out.println("1과 1은 같다.");
        }

        int a= 2;
        int b = 3;
        if(a != b){
            System.out.println("1과 2는 같지 않다.");
        }
    }
}
