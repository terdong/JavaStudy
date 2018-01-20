
// 현재 클래스가 위치한 곳.
// 디렉토리명과 같다.
package day11.day11_launcher;

// 내가 사용하고 싶은 혹은 생성하고 싶은 객체의 위치를 지정해준다.
import day11.animals.PrivateCat;

public class PrivateCapsuleStudy {
    public static void main(String [] args){
        PrivateCat cat = new PrivateCat();

        cat.printInfo();

        cat.changeInfo("루비", 1, 4);

        cat.printInfo();
    }
}
