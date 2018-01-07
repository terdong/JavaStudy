package day8_fishbreadtycoon;

public class FishBreadCEO {

    // 손님이 요청한 붕어빵 개수
    public int orderCount;
    // 판매한 대금
    public int totalMoney;
    // 누적 평가치
    public int totalTasty;
    // 붕어빵 기계
    public FishBreadMachine fbm;
    // 붕어빵 주문한 손님
    public Customer customer;
    // 구워진 붕어빵들
    public FishBread [] fishBreads;

    // 붕어빵 사장 생성자
    public FishBreadCEO(FishBreadMachine fbm){
        this.fbm = fbm;
    }

    // 손님이 붕어빵을 주문할 때 호출된다.
    public void orderFishBread(Customer customer, int money){
        this.customer = customer;
        cook();
    }



    // 붕어빵을 굽기 위해 기계에게 요청 및 구워진 붕어빵을 꺼낸다.
    public void cook(){
        // 여러분들이 구현해아해요.
        //fbm.cook();

        FishBread [] fishBreads = {
                new FishBread(3),new FishBread(3)
        };

        this.fishBreads = fishBreads;

        System.out.println("첫번째 붕어빵의 맛: " + fishBreads[0].tasty);
        System.out.println("두번째 붕어빵의 맛: " + fishBreads[1].tasty);


        giveFishBread();

    }

    // 손님에게 구워진 붕어빵을 준다.
    public void giveFishBread(){

        System.out.println("붕어빵 주는 부분은 아직 미구현되었다.");

        customer.setFishBreads(fishBreads);

    }

    // 손님으로 부터 붕어빵 판매에 대한 결과를 받고 출력한다.
    public void getResult(int money, int tasty){

    }

    // 게임의 결과를 출력한다.
    public void finalResult(){
        String result = "총 판매 대금은 " + totalMoney + "원 이고, 붕어빵에 대한 평가치는 " + totalTasty + "입니다. 그러므로 최종 스코어는 " + (totalMoney + totalTasty) + " 입니다.";
        System.out.println(result);
    }
}
