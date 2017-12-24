package day4;

import java.util.Scanner;

public class ScannerStudy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자의 입력을 무한정 받는 프로그램. 메시지를 입력하세요.");

        Boolean isPlay = true;
        for(;isPlay;){
            String message = scanner.nextLine();

            // >=, < , <=, ==, 1 != 2
            if(message.equals("/exit")){
                isPlay = false;
                System.out.println("프로그램을 종료합니다.");
            }else {
                System.out.println("당신의 입력 메시지는 \"" + message + "\" 입니다.");
            }
        }
    }
}
