package day11.animals;

public class ProtectedAnimal {
    protected String name;
    protected int age;
    protected int weight;

    public ProtectedAnimal(){
        age = 1;
        weight = 1;
    }

    public ProtectedAnimal(String name){
        this();
        this.name = name;
    }

    public ProtectedAnimal(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void shakeTail(){
        System.out.println("꼬리를 흔듭니다.");
    }

    public void printInfo(){
        System.out.println("이름: " + name + ", 나이: " + age + "살, 몸무게: " + weight + "kg");
    }
}
