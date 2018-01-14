package day02;

public class Quiz4 {
    public static void main(String [] args){
        /*
연습문제4: 물체의 고도 구하기
요구사항
등가속운동을 하는 물체의 이동거리 공식을 이용하여, 1000 미터 높이에서 떨어뜨린 물체의 10초 후 높이를 구하시오.
         */

        int a = 1;
        float b = -9.8f;
        int c = 10;

        float result1 = a * b;
        System.out.println(result1);

        float result2 = result1 + c;
        System.out.println(result2);


    }
}
