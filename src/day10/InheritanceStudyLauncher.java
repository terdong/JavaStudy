package day10;

public class InheritanceStudyLauncher {
    public static void main(String[] args) {
        Cat cat = new Cat("냐옹이", 2, 3);
        Dog dog = new Dog("루시", 2, 4);
        Tiger tiger = new Tiger("호랑이",3,200);

        // PPT 설명 참조
        Lion lion = new Lion("사자");

        // 생성자를 이용하면 깔끔하게 멤버변수를 초기화 할 수 있습니다.
  /*      cat.name = "냐옹이";
        cat.age = 2;
        cat.weight = 3;*/

        cat.bark();
        cat.eat();
        cat.shakeTail();
        cat.printInfo();
        //cat.Cat();

        System.out.println();

        dog.bark();
        dog.eat();
        dog.shakeTail();
        dog.printInfo();

        System.out.println();

        tiger.bark();
        tiger.eat();
        tiger.shakeTail();
        tiger.printInfo();

        System.out.println();

        lion.printInfo();
    }
}
