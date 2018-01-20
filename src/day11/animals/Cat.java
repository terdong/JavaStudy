package day11.animals;

public class Cat extends Animal {

    public Cat(){
        super("Ruby", 1, 4);
    }

    public Cat(String name, int age, int weight) {
        super(name,age,weight);
    }

/*    public void Cat(){
        System.out.println("이것은 생성자가 아니라 잘못 구현된 메소드입니다.");
    }*/

    public void bark() {
        System.out.println("고양이: 냐옹");
    }

    public void eat() {
        System.out.println("고양이가 고양이사료를 먹습니다.");
    }
}
