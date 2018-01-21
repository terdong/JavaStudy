package day12.interface_study;

public class Cat extends Animal implements Pet {

    public Cat(){
        super("Ruby", 1, 4);
    }

    public Cat(String name, int age, int weight) {
        super(name,age,weight);
    }

    @Override
    public void shakeTail(){
        System.out.println("고양이가 꼬리를 살랑살랑 흔듭니다.");
    }

    @Override
    public void bark() {
        System.out.println("고양이: 냐옹");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 고양이사료를 먹습니다.");
    }
}
