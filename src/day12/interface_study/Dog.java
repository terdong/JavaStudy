package day12.interface_study;

public class Dog extends Animal implements Pet{

    public Dog(){
        super("Lucy", 3, 4);
    }
    public Dog(String name, int age, int weight) {
        super(name,age,weight);
    }

    @Override
    public void bark(){
        System.out.println("개: 왈왈");
    }

    @Override
    public void eat(){
        System.out.println("개가 개사료를 먹습니다.");
    }
}
