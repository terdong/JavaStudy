package day02;

// For 문의 다양한 문법
public class ForStudy2 {
    public static void main(String [] args){

        // 보통 쓰는 방법
        int x = 999;
        for(int i = 0; i < x; ++i){
            System.out.println("i = " + i);
        }

        // 초기화를 밖에서 선언 및 정의
        int x2 = 999;
        int i2 = 0;
        for(; i2 < x2; ++i2){
            System.out.println("i = " + i2);
        }

        // 무한루프
        for(;;){
            System.out.println("무한루프");
        }

    }
}
