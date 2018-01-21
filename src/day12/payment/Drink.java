package day12.payment;

public class Drink {
    String name;
    int price;
    int count;

    Drink(String n, int p, int c) {
        name = n;
        price = p;
        count = c;
    }

    int getTotalPrice() {
        return count * price;
    }

    static void printTitle() {
        System.out.println("상품명\t단위\t수량\t금액");
    }

    void printData() {
        System.out.println(name + "\t    " + price + "\t" + count + "\t" + getTotalPrice());
    }
}
