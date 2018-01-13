package _hoemwork.NewFish;

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




    // 붕어빵 사장 생성자
    public FishBreadCEO(FishBreadMachine fbm){
        this.fbm = fbm;
    }

    // 손님이 붕어빵을 주문할 때 호출된다.
    public void orderFishBread(Customer customer, int money){
        this.customer = customer;
        cook(money);
    }
    // 붕어빵을 굽기 위해 얼마 받았는지 본다.
    public void cook(int money){

        totalMoney = money;
        System.out.println(money + "원 받았습니다. 붕어빵" + (money / FishBread.cost) + "개 드리겠습니다.");



        giveFishBread();

    }

    // 붕어빵을 굽고 손님에게 구워진 붕어빵을 준다.
    public void giveFishBread(){

        this.orderCount = customer.money / FishBread.cost;
        System.out.println("붕어빵 개수 : " +orderCount);

        customer.setFishBreads();

        System.out.println();


    }

    // 손님으로 부터 붕어빵 판매에 대한 결과를 받고 출력한다.
    public void getResult(int money, int tasty){
        this.totalMoney = money;
        this.totalTasty = tasty;
    }

    // 게임의 결과를 출력한다.
    public void finalResult(){


        String result = "총 판매 대금은 " + totalMoney + "원 이고, 붕어빵에 대한 평가치는 " + 100 * totalTasty + "입니다." +
                " 그러므로 최종 스코어는 " + (totalMoney + 100*totalTasty) + " 입니다.";

        System.out.println(result);
        System.out.println();
    }
}
