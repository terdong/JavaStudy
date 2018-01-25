package day12.interface_study;

public class Animal {
    public String name;
    public int age;
    public int weight;

    public Animal(){
        age = 1;
        weight = 1;
    }

    public Animal(String name){
        this();
        this.name = name;
    }

    public Animal(String name, int age, int weight){
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