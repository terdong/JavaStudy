package _hoemwork.NewFish2;

import java.util.Random;

public class FishBreadMachine {

    // 붕어빵 기계가 붕어빵을 굽는다.
    public FishBread cook() {
        FishBread f = new FishBread(getTasty());
        return f;
    }

    // 구워질 붕어빵의 맛을 가져온다
    public int getTasty() {
        Random r = new Random();

        return r.nextInt(5) + 1;
    }
}
