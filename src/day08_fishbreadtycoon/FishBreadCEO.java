package day08_fishbreadtycoon;

public class FishBreadCEO {

    // 붕어빵의 가격을 수정불가능한 정적변수로 선언해준다.
    public static final int FISHBREAD_COST = 300;

    // 판매한 대금
    public int totalMoney;
    // 누적 평가점수
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
    public void orderFishBread(Customer customer){
        // 손님객체 매개변수를 사장객체의 맴버변수에 대입시켜준다.
        this.customer = customer;
        bake();
    }



    // 붕어빵을 굽기 위해 기계에게 요청 및 구워진 붕어빵을 꺼낸다.
    public void bake(){

        // 손님객체로 부터 손님이 소지한 금액의 정보를 가지고 온다.
        int orderMoney = customer.money;

        // 손님이 건낸 금액이 붕어빵 한개도 못살 금액이면 메시지를 출력하고 붕어빵 굽기 중단.
        if(orderMoney < FISHBREAD_COST){
            System.out.println("손님, 붕어빵을 사기에는 돈이 너무 적습니다.");
            return;
        }

        // 손님이 건낸 금액을 가지고 구울 붕어빵 개수를 구하고 붕어빵을 굽는다.
        int totalFishBreadNumber = orderMoney / FISHBREAD_COST;
        fishBreads = new FishBread[totalFishBreadNumber];
        for(int i=0; i<totalFishBreadNumber; ++i){
            fishBreads[i] = fbm.bake();
        }

        // Test용 코드
        /*FishBread [] fishBreads = {
                new FishBread(3),new FishBread(3)
        };
        this.fishBreads = fishBreads;
        System.out.println("첫번째 붕어빵의 맛: " + fishBreads[0].tasty);
        System.out.println("두번째 붕어빵의 맛: " + fishBreads[1].tasty);*/

        giveFishBread();

    }

    // 손님에게 구워진 붕어빵을 준다.
    public void giveFishBread(){
        //System.out.println("붕어빵 주는 부분은 아직 미구현되었다.");
        customer.setFishBreads(fishBreads);
    }

    // 손님으로 부터 붕어빵 판매에 대한 결과(평가점수)를 받고 출력한다.
    public void getResult(int tasty){

        // 손님객체로 부터 손님이 소지한 금액의 정보를 가지고 온다.
        int orderMoney = customer.money;

        // 결과 출력
        System.out.println(customer.name + " 손님으로 부터 " + orderMoney + "원과 평가점수 " + tasty + "점을 받았습니다.");

        // 판매한 붕어빵 금액을 총 판매 대금에 더해준다.
        totalMoney += orderMoney;
        // 판매한 붕어빵의 평가점수를 총 평가점수에 더해준다.
        totalTasty += tasty;
    }

    // 게임의 결과를 출력한다.
    public void finalResult(){
        // 최종스코어에서 평가점수에 많은 비중을 두기 위해 판매 대금의 1%만 적용한다.
        int moneyPoint = totalMoney / 100;

        // 결과 출력
        String result = "총 판매 대금은 " + totalMoney + "원 이고, 붕어빵에 대한 총 평가점수는 " + totalTasty + "입니다. 그러므로 최종 스코어(=총 판매대금의 1% + 총 평가점수)는 " + (moneyPoint + totalTasty) + " 입니다.";
        System.out.println(result);
    }
}
