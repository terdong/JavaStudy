package day07;

// Class 코드 정보는 Static 메모리 공간에 저장된다. 즉, 붕어빵 기계가 Static 공간에 놓아 진다고 생각하면 된다.
// Static 메모리 공간 내용들은 프로그램이 시작 될 때 모두 형성되며, 프로그램이 종료 될 때 모두 제거된다.
public class HelloClass {

    int num;

    public static void main(String[] args) {

        /*
        '=' 기준으로 왼쪽코드('HelloClass h')는 레퍼런스 변수(Stack 메모리 공간에 저장된다.)
        '=' 기준으로 오른쪽코드('new HelloClass()')는 객체 그 자체(Heap 메모리 공간에 저장된다.)
        */
        HelloClass h = new HelloClass();

        // 레퍼런스 변수(일명 리모콘)를 통해 우리는 Heap 공간에 있는 객체를 조종 할 수 있다.
        h.num = 2;

        System.out.println("h.num = " + h.num);

        HelloClass h1 = new HelloClass();
        h1.num = 9;
        System.out.println("h1.num = " + h1.num);

        HelloClass h2;
        // h 변수와 연결된 객체를 h2 변수에도 연결시켜준다.
        // 즉, h2도 h에 연관된 객체를 h와 같이 조종 가능하다.
        h2 = h;

        // 밑에 코드는
        // h2.num = h2.num - 9;
        // 와 같다.
        h2.num -= 9;

        // 같은 결과가 출력 되어야 한다.
        System.out.println("h.num = " + h.num);
        System.out.println("h2.num = " + h2.num);

        // h1에 연결된 객체를 h에 연결 시켜준다.
        // 기존 h에 연결된 선은 끊어진다.
        h = h1;
        System.out.println("h.num = " + h.num);

        h2 = null;
    }
}
