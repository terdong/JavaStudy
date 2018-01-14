package day08_fishbreadtycoon;

import java.util.Random;

public class FishBreadTycoonLauncher {

    // 랜덤 객체는 static으로 선언 및 정의 해준다.
    public static Random random = new Random();

    // 고객이 처음 소지하고있는 금액을 설정해주는 정적메소드
    public static int getInitialMoney() {
        return (random.nextInt(10) + 1) * 1000;
    }

    public static void main(String[] args) {
        System.out.println("붕어빵 타이쿤 게임을 시작한당께.");

        // 붕어빵 기계 생성
        FishBreadMachine fbm = new FishBreadMachine(random);
        // 붕어빵 사장 생성(그 전에 생성한 붕어빵 기계 객체를 전달해준다.)
        FishBreadCEO ceo = new FishBreadCEO(fbm);

     /*
        for문으로 대체하기 위해 주석처리함.

        Customer customer = new Customer(getInitialMoney(), ceo);
        customer.orderFishBread();

        customer = new Customer(getInitialMoney(), ceo);
        customer.orderFishBread();

        customer = new Customer(getInitialMoney(), ceo);
        customer.orderFishBread();
    */

        // 손님객체를 10개 생성해서 각각 주문한다.
        Customer customer;
        for (int i = 0; i < 10; ++i) {
            // 손님 객체를 생성하면서 생성자 매개변수에 각각 손님의 이름, 소지금액, 사장객체를 전달해준다.
            customer = new Customer((i+1) +"번", getInitialMoney(), ceo);
            // 주문 메소드를 호출한다.
            customer.orderFishBread();
        }

        // 마지막 결과 출력.
        ceo.finalResult();

        System.out.println("붕어빵 타이쿤 게임을 종료했당께.");
    }
}
