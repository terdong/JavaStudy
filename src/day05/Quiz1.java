package day05;

// 주어진 임의의 숫자들을 오름차순으로 정렬하는 프로그램(순차 정렬)
public class Quiz1 {
    public static void main(String[] args) {
        int [] array = {512, 8, 2, 256, 128, 65536, 1024, 4, 16, 64, 32};
        int arrayLength = array.length;

        System.out.print("변환 전: ");
        printArray(array);
        for(int i=0; i < arrayLength; ++i){
            for(int j=i; j < arrayLength; ++j){
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("변환 후: ");
        printArray(array);
    }

    public static void printArray(int [] array){
        for(int i=0; i<array.length; ++i){
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
}
