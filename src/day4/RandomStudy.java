package day4;

import java.util.Random;

public class RandomStudy {
    public static void main(String[] args) {

        Random random = new Random();

        for(int i=0; i < 100; ++i){
            // 0 ~ 99 사이의 임의의 값을 number에 대입시킨다.
            int number = random.nextInt(100);
            System.out.println("임의의 숫자 number = " + number);
        }

        //for(int i=0; i < 100; ++i){
            // 1 ~ 100 사이의 임의의 값을 number에 대입시킨다.
            int number = random.nextInt(100) + 1;
            System.out.println("임의의 숫자 number = " + number);
        //}
    }
}
