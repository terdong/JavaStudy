package day03;

public class ShiftOperationStudy {
    public static void main(String[] args) {
        System.out.println("Shift 연산 공부하기");

        // 기준 값 = 105
        int data = 105;

        System.out.println("data = " + data + ", data(2진수) = " + Integer.toBinaryString(data));

        // 105 >> 2 = 26
        System.out.print("105 >> 2 = " + (data >> 2));

        // 105 << 3 = 72
        System.out.println("105 << 3 = " + (data << 3));
        System.out.println("(byte)105 << 3 = " + (byte)(data << 3));
        System.out.println(", 105 << 3(2진수) = " + Integer.toBinaryString((data << 3)));

        // 105 >>> 1 = 52
        System.out.println("105 >>> 1 = " + (data >>>1));
    }
}
