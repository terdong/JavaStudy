package day11.animals;

public class Dog extends Animal {
    public Dog(String name, int age, int weight) {
        super(name,age,weight);
    }

    public void bark(){
        System.out.println("개: 왈왈");
    }

    public void eat(){
        System.out.println("개가 개사료를 먹습니다.");
    }
}
