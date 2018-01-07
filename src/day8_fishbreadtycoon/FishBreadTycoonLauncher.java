package day8_fishbreadtycoon;

import java.util.Random;

public class FishBreadTycoonLauncher {
    public static void main(String[] args) {
        System.out.println("붕어빵 타이쿤 게임을 시작한당께.");

        Random random = new Random();

        FishBreadMachine fbm = new FishBreadMachine();
        FishBreadCEO ceo = new FishBreadCEO(fbm);

        int initialMoney = (random.nextInt(10)) + 1 * 1000;
        Customer customer = new Customer(initialMoney, ceo);
        customer.orderFishBread();

    /*    initialMoney = (random.nextInt(10)) + 1 * 1000;
        customer = new Customer(initialMoney, ceo);
        customer.orderFishBread();*/

        // 위와 같이 customer를 10개 생성해서 실행한다.
        // for문으로 간단하게 만들어보세요.


        // 마지막 결과 출력.
        ceo.finalResult();

        System.out.println("붕어빵 타이쿤 게임을 종료했당께.");
    }
}
