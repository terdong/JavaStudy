package day02;

// For문을 이용하여 삼각형모양을 출력하는 프로그램
public class TriangleWithForLoopStudy {
    public static void main(String [] args){
        System.out.println("#################삼각형 출력합니다.###################");
        for(int i=0; i<10; ++i){
            for(int j=0; j<i; ++j){
                System.out.print("*");
            }
            //println()에 아무런 값도 입력 안하면 단순히 개행만 된다.
            System.out.println();
        }
        System.out.println("#################출력 끝~ 감사합니다.###################");
    }
}
