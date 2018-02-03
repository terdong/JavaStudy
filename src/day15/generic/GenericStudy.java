package day15.generic;

import day15.Fish;

public class GenericStudy {
    public static void main(String[] args) {

        OperatorInt operatorInt = new OperatorInt(3, 5);
        System.out.println("operatorInt.add() = " + operatorInt.add());

        OperatorFloat operatorFloat = new OperatorFloat(3.14f, 1.12f);
        System.out.println("operatorFloat.add() = " + operatorFloat.add());

        System.out.println();

        // 위에 경우 처럼 타입마다 클래스를 생성해 주어야 하는 불편함이 있다.
        // 제네릭을 사용하면 하나의 클래스 내부를 다양한 타입으로 변환 가능하다.

        GenericOperator<String> gStr = new GenericOperator<>("다 끝나감");
        System.out.println("gStr.getT() = " + gStr.getT());

        GenericOperator<Integer> gInt = new GenericOperator<>(987654321);
        System.out.println("gInt.getT() = " + gInt.getT());

        GenericOperator<Fish> gFish = new GenericOperator<>(new Fish("쉬리",1));
        System.out.println("gFish.getT() = " + gFish.getT());

    }
}
