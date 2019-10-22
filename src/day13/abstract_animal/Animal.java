package day13.abstract_animal;

// Animal 클래스를 추상화 시킵니다.
// 절대로 이 클래스를 객체로 생성하지 마세요.
// 추상클래스가 되었습니다.
public abstract class Animal {

    String name;
    int weight;
    int age;

    public void eat(){
        System.out.println(name + "이 음식을 맛있게 먹는다. 냠냠.");
    }

    // 추상 메소드. 선언한 메소드 앞에 abstract 키워드를 붙여준다.
    public abstract void cry();
}
