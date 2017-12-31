package day6;

// 기존의 붕어빵 클래스를 개조하겠습니다.
public class ClassStudy3 {
    public static void main(String[] args) {

        // 붕어빵 객체 생성
        FishBread fishBread_1 = new FishBread();
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

        System.out.println();

        FishBread fishBread_2 = new FishBread();
        fishBread_2.redBeanValue = 3;
        fishBread_2.doughValue = 4;
        fishBread_2.printInfo();
        fishBread_2.cook();
        result = fishBread_2.evaluate();
        System.out.println("이 붕어빵의 맛은" + result);
    }
}

// 새로운 붕어빵 클래스
class NewFishBread {
    // 팥의 양
    public int redBeanValue;
    // 반죽의 양
    public int doughValue;
    // 붕어빵의 익은 상태
    public int state;

    public void cook(){
        if(redBeanValue >= 10 && (doughValue < 10 && doughValue > 5)){
            state = 4;
        }else if(redBeanValue >= 10){
            state = 3;
        }else if(redBeanValue >= 5){
            state = 2;
        }else if(redBeanValue >0 || doughValue <= 5){
            state = 1;
        }else{
            state = 0;
        }
    }

    // 붕어빵의 성분을 출력하는 메소드
    public void printInfo(){
        System.out.println("이 붕어빵은 팥 " + redBeanValue + " 개, 반죽 " + doughValue + "그램으로 구성 되어있다. ");
    }

    // 맛을 평가하는 메소드
    public String evaluate(){
        String result = "미완성";
        if(state == 4){
            result = "아주 달고 맛있다. 앙! 기모띠";
        }else if(state == 3){
            result = "달고 맛있다.";
        }else if(state == 2){
            result = "들 달다. 그저 그렇다";
        }else if(state == 1){
            result = "탔다. 맛이 없다.";
        }
        return result;
    }
}
