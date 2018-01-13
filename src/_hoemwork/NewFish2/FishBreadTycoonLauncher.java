package _hoemwork.NewFish2;

import java.util.Random;

public class FishBreadTycoonLauncher {
    public static void main(String[] args) {
System.out.println("enter로 텍스트 넘기기\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        Random random = new Random();

        FishBreadMachine fbm = new FishBreadMachine();
        FishBreadCEO ceo = new FishBreadCEO(fbm);

        for (int i = 5; i > 0; i--) {
            int initialMoney = ((random.nextInt(5)) + 1) * 300;
            int s=random.nextInt(3);
            int a=random.nextInt(3);
            Customer customer = new Customer(initialMoney, ceo);
            customer.orderFishBread();
        }
        ceo.finalResult();
    }
}
