package day13.abstract_animal;

// Animal 클래스를 상속받고, Pet, Fur, Meat 인터페이스를 구현한다.
// Dog 객체는 각각 Dog, Animal, Pet, Fur, Meat 타입으로 변환 가능합니다.(다형성)
public class Dog extends Animal implements Pet, Fur, Meat{

    // Animal 클래스의 추상 메소드 구현
    @Override
    public void cry() {
        System.out.println("멍!멍!");
    }

    // Pet 인터페이스의 추상 메소드 구현
    @Override
    public void shakeTail() {
        System.out.println("꼬리를 강아지처럼 살랑살랑 흔듭니다.");
    }

    // Fur 인터페이스의 추상 메소드 구현
    @Override
    public int getFur() {
        return 3;
    }

    // Meat 인터페이스의 추상 메소드 구현
    @Override
    public int getMeat() {
        return 5;
    }
}
