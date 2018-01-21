package day12.payment;

public class Alcohol extends Drink{
    float alcper;

    Alcohol(String n, int p, int c, float a) {
        super(n, p, c);
        alcper = a;
    }

    static void printTitle() {
        System.out.println("상품명(도수[%])\t단위\t수량\t금액");
    }

    // static 영역과 일반 멤버변수, 멤버메소드의 영역은 별개입니다.
    // static 영역은 프로그램이 시작될 때 생성되고,
    // static 영역이 아닌 멤버변수나 메소드는 객체를 생성할 때 생성됩니다.
    static void printTitle2(Alcohol alcohol) {
        System.out.println("상품명(도수[%])\t단위\t수량\t금액");
        System.out.println("name = " + alcohol.name);
    }

    void printData() {
        System.out.println(name + "(" + alcper + ")\t    " + price + "\t" + count + "\t" + getTotalPrice());
    }
}
