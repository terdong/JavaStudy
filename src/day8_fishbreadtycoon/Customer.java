package day8_fishbreadtycoon;

public class Customer {
    //손님의 이름
    public String name;
    // 붕어빵을 사기 위한 자금.
    public int money;
    // 붕어빵 사장
    public FishBreadCEO ceo;
    // 붕어빵 사장에게 받은 붕어빵들
    public FishBread [] fishBreads;


    // 손님객체 생성자.
    public Customer(String name, int money, FishBreadCEO ceo){
        this.name = name;
        this.money = money;
        this.ceo = ceo;
    }

    // 붕어빵 사장한테 붕어빵을 주문한다.
    public void orderFishBread(){
        // 손님이 직접 ceo에게 cook() 를 호출하면 안된다.
        // cook()는 ceo가 직접 호출하게 하자.
        // ceo.cook(); <- 옳지 못한 방법.

        // 대신 ceo 에게 붕어빵을 사기 위한 돈과 함께 요청하자.
        // 손님 객체 정보에 붕어빵 자금이 있으므로 매개변수에 돈을 전달할 필요는 없다.
        //ceo.orderFishBread(this, money);
        ceo.orderFishBread(this);
    }

    // 붕어빵 사장으로 부터 구워진 붕어빵을 받는다.
    public void setFishBreads(FishBread [] fishBreads){

        // 구워진 붕어빵 배열 정보 매개변수를 객체 맴버변수에 저장한다.
        this.fishBreads = fishBreads;

        // 결과 메소드 호출
        responseResult();
    }

    // 받은 붕어빵의 맛을 평가해 준다.
    public int evaluate(FishBread fishBread){
        // 매개변수로 받은 붕어빵 객체 안에 담긴 tasty 변수를 반환한다.
        return fishBread.tasty;
    }

    // 붕어빵을 받고, 평가치를 붕어빵 사장에게 전달해준다.
    public void responseResult(){

        // 모든 붕어빵의 평가점수를 저장하기 위한 변수 선언.
        int totalEvaluation = 0;

        // 구매한 붕어빵의 평가 점수를 totalEvaluation 변수에 더해준다.
        for(int i=0; i<fishBreads.length; ++i){
            totalEvaluation += evaluate(fishBreads[i]);
        }

        // 붕어빵 사장에게 더해진 총 평가점수를 전달한다.
        ceo.getResult(totalEvaluation);
    }
}
