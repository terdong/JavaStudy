package day11.day11_launcher;

import day11.animals.Cat;

public class PublicCapsuleStudy {
    public static void main(String [] args){

        Cat cat = new Cat();

        cat.printInfo();

        // Cat의 멤버 변수들이 public 으로 선언되어 있기 때문에 밖에서 접근 가능.
        cat.age = 30;
        cat.weight = 99;
        cat.name = "방구";

        cat.printInfo();
    }
}
