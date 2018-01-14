package day04;

public class IfStudy2 {
    public static void main(String[] args) {

        int number = 51;

        Boolean b1 = number > 101;
        Boolean b2 = number > 50;
        Boolean b3 = number > 0;

        if(b1){
            System.out.println("number 는 101 보다 크다");
        }else{
            System.out.println("number 는 101 보다 작다");
        }

        if(b1){
            System.out.println("number 는 101 보다 크다");
        }else if(b2){
            System.out.println("number 는 50 보다 크다");
        }else if(b3){
            System.out.println("number 는 0 보다 크다");
        }else{
            System.out.println("number 는 0 보다 작거나 같다");
        }







    }
}
