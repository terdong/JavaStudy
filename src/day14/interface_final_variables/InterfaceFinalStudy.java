package day14.interface_final_variables;

public class InterfaceFinalStudy implements InterfaceFinal{
    public static void main(String[] args) {

        InterfaceFinal obj = new InterfaceFinalStudy();
        obj.printMessage();

        // 상수기 때문에 값을 바꿀 수 없습니다.
        //obj.EXAMPLE_INTEGER = 99;

        System.out.println(InterfaceFinal.EXAMPLE_INTEGER);

    }

    @Override
    public void printMessage() {
        System.out.println("인터페이스 상수 테스트입니다.");
    }
}
