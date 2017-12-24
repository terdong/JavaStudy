package day3;

public class DataTypeStudy {
    public static void main(String[] args) {

//        System.out.println("Hello");

        byte byte_ = 16;
        short short_ = 50;
        int int_ = 100;
        long long_ = 10000;
        float float_ = 1.2345f;
        double double_ = 9899999.9999999;
        char char_ = 'a';
        char char2_ = 97;

        System.out.println("Data Type을 알아보는 프로그램.");
        System.out.println("byte_ = " + byte_);
        System.out.println("short_ = " + short_);
        System.out.println("int_ = " + int_);
        System.out.println("long_ = " + long_);
        System.out.println("float_ = " + float_);
        System.out.println("double_ = " + double_);

        System.out.println("char_ = " + char_);
        System.out.println("(int)char_ = " + (int)char_);
        System.out.println("char2_ = " + char2_);

        System.out.println("각각의 Data Type의 범위를 넘어서 값을 저장하면?");

        // -128 ~ 127
        // 최대 값은 127 까지 값을 대입할 수 있다.
        // 그 이상을 대입하면 컴파일러 오류가 난다.
        //byte byte2_ = 128;
        byte byte2_ = 127;
        byte byte3_ = 50;

        byte result = (byte)(byte2_ + byte3_);

        int intResult = byte2_ + byte3_;


        System.out.println("(byte)(byte2_ + byte3_) = " + result);
        System.out.println("intResult = " + intResult);

        System.out.println("이진수 변환(int): (byte)(127 + 50) = " + Integer.toBinaryString (result));
        System.out.println("이진수 변환(byte): 127 + 50 = " + Integer.toBinaryString (byte2_ + byte3_));

        // 최대 32767까지 값을 대입할 수 있다.
        // 그 이상을 대입하면 컴파일러 오류가 난다.
        //short short2_ = 32768;
        int int2_ = 100;
        long long2_ = 10000;
        float float2_ = 1.2345f;
        double double2_ = 9899999.9999999;

    }
}
