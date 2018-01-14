package day06;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        String [] history = new String[999];
        int history_count = 0;

        Boolean isPlay = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("계산기를 시작합니다.");

        for(;isPlay;){

            System.out.println("################################################");
            System.out.println("<메뉴> 해당 번호를 입력해주세요.");
            System.out.println("1. 계산기");
            System.out.println("2. 계산기록");
            System.out.println("3. 도움말");
            System.out.println("4. 종료");

            System.out.print("번호 입력: ");
            int menu = scanner.nextInt();
            if(menu == 1){

                System.out.println("계산기를 시작합니다.");

                System.out.print("첫번째 숫자: ");
                int a = scanner.nextInt();
                System.out.print("연산자: ");
                String operator = scanner.next();
                System.out.print("두번째 숫자: ");
                int b = scanner.nextInt();
                System.out.println();

                String result = "";
                if(operator.equals("+")){
                    result = a + operator + b + "=" + (a+b);
                }else if(operator.equals("-")){
                    result = a + operator + b + "=" + (a-b);
                }else if(operator.equals("*")){
                    result = a + operator + b + "=" + (a*b);
                }else if(operator.equals("/")){
                    result = a + operator + b + "=" + (a/b);
                }

                if(history_count >= history.length){history_count = 0;}
                history[history_count++] = result;

                System.out.println(result);
            }else if(menu == 2){
                System.out.println("계산 기록을 출력합니다.(최대 " + history.length + "개)");
                if(history_count == 0 && history[0] == null){
                    System.out.println("계산 기록이 없습니다.");
                }else{
                    for(int i=0; i<history_count; ++i){
                        System.out.println((i+1) + ": " + history[i]);
                    }
                }

                System.out.println();
            }else if(menu == 3){
                System.out.println("계산기 프로그램을 시작합니다.");
                System.out.println("계산할 숫자 A, 연산자, 계산할 숫자 B 순으로 각각 입력해주세요.");
                System.out.println("(입력 예 1) 첫번째 숫자: 3");
                System.out.println("(입력 예 2) 연산자: +");
                System.out.println("(입력 예 3) 두번째 숫자: 4");
                System.out.println("(출력 예) 3 + 4 = 7");
                System.out.println();
            }else if(menu == 4){
                System.out.println("계산기 프로그램을 종료합니다. 감사합니다.");
                isPlay = false;
            }
        }
    }
}
