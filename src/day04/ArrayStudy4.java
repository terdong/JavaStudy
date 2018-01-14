package day04;

public class ArrayStudy4 {
    public static void main(String[] args) {

        int [][] a= {{1,2},{4,5,6},{7,8,9,10}};

        for(int i=0; i<a.length; ++i){
            System.out.println("a["+i+"]의 배열 개수 = "+ a[i].length);
        }

        System.out.println();

        int [][] aa = new int[5][];
        aa[0] = new int[1];
        aa[1] = new int[10];
        aa[2] = new int[100];
        aa[3] = new int[9];
        aa[4] = new int[19];

        for(int i=0; i<aa.length; ++i){
            System.out.println("aa["+i+"]의 배열 개수 = "+ aa[i].length);
        }

    }
}
