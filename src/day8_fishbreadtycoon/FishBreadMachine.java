package day8_fishbreadtycoon;

import java.util.Random;

public class FishBreadMachine {

    // 생성할 붕어빵의 평가점수 범위
    public static final int MAX_TASTY =  5;

    // 외부로 부터 받을 랜덤 객체의 레퍼런스 변수
    public Random random;

    public FishBreadMachine(Random random){
        // 매개변수로 넘겨 받은 랜덤객체의 레퍼런스 변수를 본 객체에 대입시켜준다.
        this.random = random;
    }

    // 붕어빵 기계가 붕어빵을 굽는다.
    public FishBread bake(){
        return new FishBread(getTasty());
    }

    // 구워질 붕어빵의 맛을 가져온다.
    public int getTasty(){
        // 랜덤 객체를 이용하여 평가점수를 1 ~ 5 사이의 값으로 뽑아 낸다.
        return random.nextInt(5) + 1;
    }
}
