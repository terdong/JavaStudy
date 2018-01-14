package day10;

public class Tiger extends Animal{
    public Tiger(String name, int age, int weight) {
        super(name,age,weight);
    }

    public void bark() {
        System.out.println("어흥");
    }

    public void eat() {
        System.out.println("호랑이가 고기를 먹습니다.");
    }
}
