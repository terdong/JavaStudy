package day05;

// 재귀함수 테스트
public class RecoursionFucntionStudy {
    public static void main(String[] args) {

        boolean isPlay = true;
        int count = 100;

        printMessage("안녕?", isPlay, count);
    }

    public static void printMessage(String message, boolean isPlay, int count){
        System.out.println("message = " + message + ", count = " + count);

        count = count - 1;

        if(count <= 0){
            isPlay = false;
        }

        if(isPlay){
            printMessage(message, isPlay, count);
        }else {
            return;
        }
    }
}
