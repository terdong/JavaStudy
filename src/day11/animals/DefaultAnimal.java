package day11.animals;



public class DefaultAnimal {
    // default 접근 제한
    String name;
    int age;
    int weight;

    DefaultAnimal(){
        age = 1;
        weight = 1;
    }

    DefaultAnimal(String name){
        this();
        this.name = name;
    }

    DefaultAnimal(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void shakeTail(){
        System.out.println("꼬리를 흔듭니다.");
    }

    void printInfo(){
        System.out.println("이름: " + name + ", 나이: " + age + "살, 몸무게: " + weight + "kg");
    }
}
