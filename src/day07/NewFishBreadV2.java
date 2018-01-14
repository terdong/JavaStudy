package day07;

public class NewFishBreadV2 {
    // 팥의 양
    public int redBeanValue;
    // 반죽의 양
    public int doughValue;
    // 붕어빵의 익은 상태
    public int state;

    // 생성자: 객체가 new 이름으로 생성 될때 단 한번만 호출 되는 메소드.
    public NewFishBreadV2(){
        redBeanValue = 10;
        doughValue = 6;
        printInfo();
        cook();
    }

    public NewFishBreadV2(int redBeanValue, int doughValue){
        this.redBeanValue = redBeanValue;
        this.doughValue = doughValue;
        printInfo();
        cook();
    }

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
