package day5;

import java.util.Scanner;

// 재귀함수를 이용하여 팩토리얼을 계산하는 프로그램
public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlay = true;

        System.out.println("팩토리얼 프로그램을 시작합니다.");

        for(;isPlay ;){
            System.out.print("입력: ");
            int number = scanner.nextInt();
            if(number == 0){
                isPlay = false;
            }else{
                long result = factorial(number);
                System.out.println(number+"! = " + result);
            }
        }

        System.out.println("팩토리얼 프로그램을 종료합니다.");
    }

    public static long factorial(int number) {
        if(number > 1){
            return number * factorial(number - 1);
        }else{
            return number;
        }
    }
}
