package _hoemwork.NewFish2;

import java.util.Scanner;

public class FishBreadCEO {
Scanner s=new Scanner(System.in);
    // 손님이 요청한 붕어빵 개수
    public int i;
    // 판매한 대금
    public int totalMoney;
    // 누적 평가치
    public int totalTasty;
    // 붕어빵 기계
    public FishBreadMachine fbm;
    // 붕어빵 주문한 손님
    public Customer customer;
    // 구워진 붕어빵들
    public FishBread[] fishBreads;

    //사장 생성자
    public FishBreadCEO(FishBreadMachine fbm) {
        this.fbm = fbm;

    }

    //붕어빵 주문시 호출
    public void o(Customer customer, int money) {
 this.customer = customer;
        i = money / 300;
        totalMoney += i * 300;
        cook();
    }

    // 붕어빵을 굽기 위해 기계에게 요청 및 구워진 붕어빵을 꺼낸다.
    public void cook() {
        int j = i;
        this.fishBreads = new FishBread[i];

        for (; j > 0; --j) {
            this.fishBreads[j - 1] = fbm.cook();
        }
        giveFishBread();
    }

    // 손님에게 구워진 붕어빵을 준다.
    public void giveFishBread() {
        s.nextLine();
        System.out.println(i * 300 + "원 입니다");
        customer.setFishBreads(this.fishBreads);

    }

    // 손님으로 부터 붕어빵 판매에 대한 결과를 받고 출력한다.
    public void getResult(int[] tasty) {
        int j = 1;
        s.nextLine();
        System.out.println(i + "개의 붕어빵 판매!");
        s.nextLine();
        for (; i > 0; i--) {
            System.out.println(j+"번째 붕어빵에 대한 평가치는 5점 만점에" + tasty[j - 1] + "점.");s.nextLine();
            this.totalTasty += tasty[j - 1];
            j++;
        }
    }

    // 게임의 결과를 출력한다.
    public void finalResult() {
        System.out.println("총 판매 금액는 " + totalMoney + "원 이고, 붕어빵에 대한 평가치는 " + totalTasty + "점 입니다. 그러므로 최종 스코어는 " + (totalMoney + totalTasty * 100) + "점" + " 입니다.");
    }
}
