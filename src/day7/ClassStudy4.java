package day7;

public class ClassStudy4 {
    public static void main(String[] args) {

/*        NewFishBreadV2 fishBread = new NewFishBreadV2();
        System.out.println(fishBread.evaluate());*/

        NewFishBreadV2 fishBread = new NewFishBreadV2(10, 6);
        System.out.println(fishBread.evaluate());

        fishBread = new NewFishBreadV2(5, 1);
        System.out.println(fishBread.evaluate());

        NewFishBreadV2 fishBread2 = fishBread;
        fishBread = new NewFishBreadV2(1, 10);
        System.out.println(fishBread.evaluate());

        System.out.println(fishBread2.evaluate());

/*
        기존 붕어빵 객체 생성 테스트 코드

        // 붕어빵 객체 생성
        NewFishBreadV2 fishBread_1 = new NewFishBreadV2();
        // 붕어빵에 팥 삽입
        fishBread_1.redBeanValue = 10;
        // 붕어빵에 반죽 삽입
        fishBread_1.doughValue = 9;
        // 붕어빵 현재 정보(상태) 보기
        fishBread_1.printInfo();
        // 붕어빵 굽기
        fishBread_1.cook();
        // 붕어빵 맛 보기(평가한 값을 result에 저장)
        String result = fishBread_1.evaluate();
        System.out.println("이 붕어빵의 맛은" + result);
*/


    }
}
