package day10;

public class Lion extends Animal{

    public Lion(String name){
        // 이미 Animal 클래스에 커스텀 생성자를 만들었기 때문에,
        // Animal 클래스에도 기본 생성자를 만들어 주어야 오류가 안난다.
        //super(); 이렇게 생략 가능하다.
        //this.name = name;

         //혹은 Animal 클래스에도 매개변수를 1개 가지는 생성자를 만들어서 다시 호출해준다.
         super(name);
    }

    public Lion(String name, int age, int weight) {
        super(name,age,weight);
    }
    public void bark() {
        System.out.println("어흥");
    }

    public void eat() {
        System.out.println("사자가 고기를 먹습니다.");
    }
}
