package day11.day11_launcher;

import day11.animals.ProtectedCat;

public class ProtectedCapsuleStudy {
    public static void main(String [] args){
        ProtectedCat cat = new ProtectedCat();

        cat.printInfo();

        // Cat의 멤버 변수들이 protected 으로 선언되어 있기 때문에 밖에서 접근 불가능.
        //cat.age = 30;
        //cat.weight = 99;
        //cat.name = "방구";
        cat.changeInfo("루비", 1, 4);

        cat.printInfo();
        
    }
}
