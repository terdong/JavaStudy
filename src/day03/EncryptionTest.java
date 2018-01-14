package day03;

public class EncryptionTest {
    public static void main(String[] args) {
        int src = 20171223;

        int key = 0502;

        // 암호화된 src 값
        int dest = src ^ key;

        System.out.println("원본 값 = " + src);
        System.out.println("변환 값 = " + dest);

        int decryption = dest ^ key;
        System.out.println("복호화한 값 = " + decryption);

        int wrongDecryption = dest ^ 1234;
        System.out.println("잘못 복호화한 값 = " + wrongDecryption);

        System.out.println("#################################################");
        System.out.println("메세지 암호화 하기");
        char message1 = 'x';
        char message2 = '-';
        char message3 = 'm';
        char message4 = 'a';
        char message5 = 's';

        System.out.println("원본 메세지: " + message1 + message2 + message3 + message4 + message5);

        int encryption1 = message1 ^ key;
        int encryption2 = message2 ^ key;
        int encryption3 = message3 ^ key;
        int encryption4 = message4 ^ key;
        int encryption5 = message5 ^ key;

        System.out.println("암호화된 메세지: " + encryption1 + encryption2 + encryption3 + encryption4 + encryption5);

        char decryption1 = (char)(encryption1 ^ key);
        char decryption2 = (char)(encryption2 ^ key);
        char decryption3 = (char)(encryption3 ^ key);
        char decryption4 = (char)(encryption4 ^ key);
        char decryption5 = (char)(encryption5 ^ key);
        // 여러분들이 직접 풀어보세요.
        System.out.println("복호화된 메세지: " + decryption1 + decryption2 + decryption3 + decryption4 + decryption5);
    }
}
