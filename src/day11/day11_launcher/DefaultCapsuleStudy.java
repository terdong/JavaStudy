package day11.day11_launcher;

import day11.animals.DefaultCat;

public class DefaultCapsuleStudy {
    public static void main(String[] args) {
        DefaultCat defaultCat = new DefaultCat();

        // 다른 패키지에서 접근 하려고하면 에러가 난다.
        // 그러나 같은 패키지 내에서는 접근 가능.
        //defaultCat.age = 4;
    }
}
