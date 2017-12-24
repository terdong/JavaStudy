package day4;

public class ArrayStudy1 {
    public static void main(String[] args) {

        // 배열 선언 및 정의 첫번째 방법
        int [] a = new int [5];

        System.out.println("초기화된 a[0] = " + a[0]);
        System.out.println("초기화된 a[1] = " + a[1]);
        System.out.println("초기화된 a[2] = " + a[2]);
        System.out.println("초기화된 a[3] = " + a[3]);
        System.out.println("초기화된 a[4] = " + a[4]);

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[2] = " + a[2]);
        System.out.println("a[3] = " + a[3]);
        System.out.println("a[4] = " + a[4]);

        // 배열 선언 및 정의 두번째 방법
        int [] a2 = {1,2,3,4,5};

        System.out.println("a2[0] = " + a2[0]);
        System.out.println("a2[1] = " + a2[1]);
        System.out.println("a2[2] = " + a2[2]);
        System.out.println("a2[3] = " + a2[3]);
        System.out.println("a2[4] = " + a2[4]);



    }
}
