package _hoemwork.NewFish2;

public class Customer {

    // 손님이 보유한 자금
    public int money;
    // 붕어빵 사장
    public FishBreadCEO ceo;
    // 붕어빵 사장에게 받은 붕어빵들
    public FishBread[] fishBreads;
    //손님의 취향
    int s;
    int a;

    public Customer(int money, FishBreadCEO ceo) {
        this.money = money;
        this.ceo = ceo;
    }

    // 붕어빵 사장한테 붕어빵을 주문한다.
    public void orderFishBread() {
        System.out.println("손님:붕어빵"+money+"원 어치 주세요!");
        ceo.o(this, money);
    }

    // 붕어빵 사장으로 부터 구워진 붕어빵을 받는다.
    public void setFishBreads(FishBread[] fishBreads) {
        this.fishBreads = new FishBread[fishBreads.length];
        int i = fishBreads.length;
        int j[] = new int[fishBreads.length];
        for (; i > 0; --i) {
            this.fishBreads[i - 1] = fishBreads[i - 1];
            j[i - 1] = evaluate(this.fishBreads[i - 1]);
        }
        responseResult(j);
    }

    // 받은 붕어빵의 맛을 평가해 준다.
    public int evaluate(FishBread fishBread) {
        return fishBread.tasty;
    }

    // 붕어빵을 받고,평가치를 붕어빵 사장에게 전달해준다.
    public void responseResult(int a[]) {
        ceo.getResult(a);

    }
}
