package day05;

public class Method3Study {
    public static void main(String[] args) {

        //returnMethod();
        //System.out.println("#############################");
        //returnMethod2();
        returnMethod3();

    }

    public static void returnMethod() {

        System.out.println("returnMethod 실행");

        int a = 10;
        System.out.println("a = " + a);

        boolean bool = true;

        if (bool) {
            return;
        }

        int b = 99;
        System.out.println("b = " + b);

        System.out.println("returnMethod 끝");
    }

    public static int returnMethod2(){
        System.out.println("returnMethod2 실행");

        int a = 10;
        System.out.println("a = " + a);

        boolean bool = false;

        if (bool) {
            return -1;
        }

        int b = 99;
        System.out.println("b = " + b);
        System.out.println("returnMethod2 끝");
        return 0;
    }

    public static void returnMethod3(){

        boolean isPlay = true;
        for(int i=0; i< 999 && isPlay; ++i){
            System.out.println("i = " + i);
            if( i > 222) {
                isPlay = false;
            }
        }
/*        for(int i=0; i< 999; ++i){
            System.out.println("i = " + i);

      *//*      if(i > 333){
                return;
            }*//*

            if(i > 333){
                break;
            }
        }*/

        System.out.println("for문이 모두 종료되었습니다.");

    }
}
