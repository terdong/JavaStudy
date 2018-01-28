package day14.object_class;

import java.util.Date;

// 모든 Class는 Object 클래스를 상속 받는다.
public class ObjectClassStudy {

    // 생성된 객체마다 부여할 ID 값 관리 변수
    static int globalClassIndex = 0;

    // 생성된 객체마다 부여되는 ID를 저장하는 변수
    int classID;
    // 생성된 객체마다 부여되는 생성된 시간을 저장하는 변수
    long createdTime;

    // 사실 Object 클래스에는 checkBothObjects() 메소드를 대신하는 메소드가 있다.
    // 그것은 equals() 메소드다. 밑에 구현 내용 참고.
    static boolean checkBothObjects(ObjectClassStudy o1, ObjectClassStudy o2) {

        // o1과 o2의 hashCode(), getCreatedTime()의 반환값을 각각 비교해서 둘다 true면 true 반환.
        // 틀리면 false 반환.
        // 이 조건식으로 서로 가르키는 객체가 동일한지 판별 가능하다.
        return o1.hashCode() == o2.hashCode()
                && o1.getCreatedTime() == o2.getCreatedTime();
    }


    // ObjectClassStudy 생성자
    public ObjectClassStudy() {

        // globalClassIndex의 값을 classID에 대입하고, globalClassIndex의 값을 1 증가시킨다.
        classID = globalClassIndex++;
        // 현재의 시간을 나노 초(second)로 변환하여 createdTime에 저장한다.
        createdTime = System.nanoTime();
        //System.out.println(createdTime);
    }

    // checkBothObjects() 메소드 테스트를 위한 생성자
    public ObjectClassStudy(int id) {
        classID = id;
        createdTime = System.nanoTime();
        //System.out.println(createdTime);
    }

    // createdTime 멤버변수를 반환하는 메소드
    public long getCreatedTime() {
        return createdTime;
    }

    // Object 클래스의 hashCode()를 재구현한다.
    @Override
    public int hashCode() {
        return classID;
    }

    // Object 클래스의 equals 메소드를 재구현하여 레퍼런스 변수가 가르키는 객체가 같은지 비교한다.
    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode()
                && this.getCreatedTime() == ((ObjectClassStudy) obj).getCreatedTime();
    }

    public static void main(String[] args) {

        ObjectClassStudy ocs = new ObjectClassStudy();

        ObjectClassStudy ocs2 = new ObjectClassStudy();
        ObjectClassStudy sameOcs2 = new ObjectClassStudy(1);
        ObjectClassStudy ocs2Brother = ocs2;

        ObjectClassStudy ocs3 = new ObjectClassStudy();
        ObjectClassStudy ocs4 = new ObjectClassStudy();

           /*
        hashCode()
        1. 객체가 생성 되었을 때 생성 되는 ID 같은 것. 객체별로 구분을 위함.
        2. 생성된 객체마다 hashCode() 의 결과값이 틀리다.
         */
        System.out.println("ocs.hashCode() = " + ocs.hashCode());
        System.out.println("ocs2.hashCode() = " + ocs2.hashCode());
        System.out.println("ocs3.hashCode() = " + ocs3.hashCode());
        System.out.println("ocs4.hashCode() = " + ocs4.hashCode());

        System.out.println("ocs.getClass() = " + ocs.getClass());
        System.out.println("ocs.toString() = " + ocs.toString());
        System.out.println("ocs = " + ocs);

        // 절대로 아래 와 같이 그냥 hashCode()를 사용하지마세요.
        // 단, override 된 hashCode()는 괜찮음.
        int hashCode = ocs4.hashCode();
        // 이 코드는 hashCode() 메소드 자체가 명확한 구분을 짓기 어렵기 때문에 비추천합니다.
        // 객체간의 비교는 equals() 메소드를 오버라이드 하여 구현하세요.
        if (ocs2.hashCode() == hashCode) {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 같다.");
        }

        /////////////////////////////////////////////////////////////////
        // 우리가 만든 checkBothObjects 메소드를 사용하여 객체를 비교함.
        if (checkBothObjects(ocs2, ocs4)) {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 같다.");
        } else {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 틀리다.");
        }
        if (checkBothObjects(ocs2, ocs2Brother)) {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 같다.");
        } else {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 틀리다.");
        }
        /////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////
        // Object 클래스에 있는 equals 메소드를 오버라이(재구현) 하여 객체를 비교함.
        // 이렇게 코드 짜시는 걸 추천합니다.
        if (ocs2.equals(ocs4)) {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 같다.");
        } else {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 틀리다.");
        }
        if (ocs2.equals(ocs2Brother)) {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 같다.");
        } else {
            System.out.println("두 레퍼런스변수가 가르키는 객체는 틀리다.");
        }
        /////////////////////////////////////////////////////////////////////
    }
}
