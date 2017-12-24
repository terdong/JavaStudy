package day4;

public class ArrayStudy2 {
    public static void main(String[] args) {

        int [] a = new int [99999];

        // 값 입력 구문
        for(int i=0; i < a.length; ++i){
            a[i] = i + 1;
        }

        // 값 출력 구문
        for(int i=0; i < a.length; ++i){
            System.out.println("a[" + i + "] = " + a[i]);
        }

        //a.length 를 사용하면 a 배열의 갯수를 알 수 있다.
        System.out.println("a.length = " + a.length);

        //에러구문
   /*     int [] a2 = new int [5];
        for(int i=0; i < 5; ++i){
            a2[i] = i + 1;
        }

        for(int i=0; i <= 5; ++i){
            System.out.println("a2[" + i + "] = " + a2[i]);
        }*/

    }

}
