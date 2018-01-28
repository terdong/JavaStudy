package day14.final_method;

public abstract class Animal {
    public final void printCommonMessage(){
        System.out.println("이 객체는 동물 객체입니다.");
    }
    abstract void bark();


    // 부모 클래스는 eat 메소드를 protected 로 선언했다.
    protected void eat(){
        System.out.println("동물이 음식을 먹는다 냠냠.");
    }
}
