package day14.final_method;

public class Dog extends Animal{

    // 이제 자식클래스는 부모의 printCommonMessage()를 재구현 할 수 없다.
    // 왜냐하면 부모클래스에서 해당 메소드에 final 처리를 했기 때문이다.
  /*  @Override
    public void printCommonMessage(){
        System.out.println("흐흐흐 바꿨다");
    }*/

    @Override
    void bark() {
        System.out.println("왈왈!!!");
    }


    // 자식 클래스는 부모의 eat 메소드를 public 으로 재구현했다. 문법적으로 가능은 하나 비추천.
    @Override
    public void eat(){
        System.out.println("개가 고기를 먹는다. 컹컹");
    }
}
