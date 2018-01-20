package day11.animals;

public class PrivateCat extends PrivateAnimal {

    public PrivateCat(){
        super("방구", 99, 99);
    }

    public PrivateCat(String name, int age, int weight) {
        super(name,age,weight);
    }

    public void changeInfo(String name, int age, int weight){

        super.changeInfo(name, age, weight);

        // 부모 클래스인 PrivateAnimal 에서 해당 매개변수들을 private 처리를 했기 때문에,
        // 자식 클래스도 부모 클래스의 멤버 변수에 접근 할 수 없습니다.
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
    }

    public void bark() {
        System.out.println("고양이: 냐옹");
    }

    public void eat() {
        System.out.println("고양이가 고양이사료를 먹습니다.");
    }
}
