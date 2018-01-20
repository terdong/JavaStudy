package day11.animals;

public class ProtectedCat extends ProtectedAnimal {

    public ProtectedCat(){
        super("방구", 99, 99);
    }

    public ProtectedCat(String name, int age, int weight) {
        super(name,age,weight);
    }

    public void changeInfo(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void bark() {
        System.out.println("고양이: 냐옹");
    }

    public void eat() {
        System.out.println("고양이가 고양이사료를 먹습니다.");
    }
}
