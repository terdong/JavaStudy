package day04;

import java.util.Scanner;

public class ScannerStudy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자 입력 받는 프로그램. 시작합니다. 입력해주세요.");

        // 문자열 입력 받기
/*        String result = scanner.nextLine();
        System.out.println("result = " + result);*/

        //숫자 입력받기
/*        int intResult = scanner.nextInt();
        System.out.println("intResult = " + intResult * 100);*/

        //배열에 숫자 입력하기
        System.out.println("배열에 숫자 입력하기");
        int [] array = new int[5];

        for(int i=0; i<array.length; ++i){
            array[i] = scanner.nextInt();
        }

        for(int i=0; i<array.length; ++i){
            System.out.println("array["+i+"] = " + array[i]);
        }
    }
}
