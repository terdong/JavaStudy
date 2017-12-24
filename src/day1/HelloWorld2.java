package day1;

public class HelloWorld2 {
    public static void main(String [] args) {

        System.out.println("[[[[[직각 삼각형]]]]]");
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("[[[[[역직각 삼각형]]]]]");
        for (int i = 10; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
