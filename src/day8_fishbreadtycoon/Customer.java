package day8_fishbreadtycoon;

import java.util.Random;

public class Customer {

    // 붕어빵을 사기 위한 자금.
    public int money;
    // 붕어빵 사장
    public FishBreadCEO ceo;
    // 붕어빵 사장에게 받은 붕어빵들
    public FishBread [] fishBreads;

    public Customer(int money, FishBreadCEO ceo){
        this.money = money;
        this.ceo = ceo;
    }

    // 붕어빵 사장한테 붕어빵을 주문한다.
    public void orderFishBread(){
        // 손님이 직접 ceo에게 cook() 를 호출하면 안된다.
        // cook()는 ceo가 직접 호출하게 하자.
        // ceo.cook(); <- 옳지 못한 방법.

        // 대신 ceo 에게 붕어빵을 사기 위한 돈과 함께 요청하자.
        ceo.orderFishBread(this, money);
    }

    // 붕어빵 사장으로 부터 구워진 붕어빵을 받는다.
    public void setFishBreads(FishBread [] fishBreads){

        System.out.println("setFishBreads");
        // 여러분들이 구현하세요.
    }

    // 받은 붕어빵의 맛을 평가해 준다.
    public int evaluate(FishBread fishBread){
        // 여러분들이 구현하세요.
        return fishBread.tasty;
    }

    // 붕어빵을 받고, 돈과 평가치를 붕어빵 사장에게 전달해준다.
    public void responseResult(){

    }
}
