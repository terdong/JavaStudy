package day08_fishbreadtycoon;

import java.util.Random;

public class Test01{
    public static void main(String[] args) {

        Random random = new Random();

        FishBreadMachine fbm = new FishBreadMachine(random);
        FishBreadCEO ceo = new FishBreadCEO(fbm);

        int initialMoney = (random.nextInt(10)) + 1 * 1000;
        Customer customer = new Customer("손님",initialMoney, ceo);
        customer.orderFishBread();

    }
}
