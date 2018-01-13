package day9;

public class OverloadingStudyExtention {

    public OverloadingStudyExtention add(int number){
        int result = number + 3;
        System.out.println("result = " + result);
        return this;
    }

    public static void main(String[] args) {

        System.out.println("OverloadingStudy 시작");

        // OverloadingStudy 객체 생성해서 add 메소드를 호출 해보세요.
        new OverloadingStudyExtention().add(999).add(100).add(9);
    }
}
