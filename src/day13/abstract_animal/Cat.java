package day13.abstract_animal;

public class Cat extends Animal {

    // 추상 메소드를 구현 하는 자식 클래스에서는 해당 매소드를 public 키워드를 붙여준다.
    @Override
    public void cry(){
        System.out.println("냐옹~ 냐옹~");
    }

    @Override
    public void eat(){
        System.out.println("고양이가 먹은 음식은 고등어다.");
    }

}
