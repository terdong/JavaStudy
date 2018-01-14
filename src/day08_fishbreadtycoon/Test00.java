package day08_fishbreadtycoon;

public class Test00 {
    public static void main(String[] args) {

        Customer c = new Customer("손님",100, null);

        FishBread fishBread = new FishBread(3);

        System.out.println("임시 붕어빵 맛 평가: " + c.evaluate(fishBread));

    }
}
