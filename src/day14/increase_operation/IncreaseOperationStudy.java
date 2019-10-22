package day14.increase_operation;

// ++i 와 i++ 을 비교해봅시다.
// 위에 두 식은 i = i + 1 을 줄인 식이지만 약간의 차이가 있습니다.
public class IncreaseOperationStudy {
    public static void main(String[] args) {

        // 두 for문의 ++i와 i++의 차이를 알아봅시다.
        for(int i=0; i<5; ++i){
        }
        for(int i=0; i<5; i++){
        }
        // 사실 for문에서는 차이를 우리가 확인 할 수 없어요.

        int i = 0;
        int result = i++;
        System.out.println("i++ 했을 때 result = " + result + ", i = " + i);

        i = 0;
        result = ++i;
        System.out.println("++i 했을 때 result = " + result + ", i = " + i);

        /*
        ### i++ 해석(내부적으로 이렇게 동작합니다.) ###
        int temp = i;
        i = i + 1;
        return temp;
        ################

        ### ++i 해석(내부적으로 이렇게 동작합니다.) ###
        i = i + 1;
        return i;
        ################

        * 결론적으로 i++ 은 temp라는 임시변수가 하나 stack 공간에 생성이 됩니다.
        * 이 temp 라는 변수는 32bit의 크기를 갖습니다.
         */

    }
}
