package day11.animals;

public class PrivateAnimal {
    private String name;
    private int age;
    private int weight;

    public PrivateAnimal(){
        age = 1;
        weight = 1;
    }

    public PrivateAnimal(String name){
        this();
        this.name = name;
    }

    public PrivateAnimal(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // protected 키워드를 붙였기 때문에 자식 클래스에서만 접근 가능한 메소드.
    protected void changeInfo(String name, int age, int weight){
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
