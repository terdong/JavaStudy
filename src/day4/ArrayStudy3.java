package day4;

public class ArrayStudy3 {
    public static void main(String[] args) {

        int [][] aa = new int [9][9];
        int [][] aa2 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        for(int i=0; i<aa.length; ++i){
            for(int j=0; j<aa[i].length; ++j){
                aa[i][j] = i * j;
            }
        }

        for(int i=0; i<aa.length; ++i){
            for(int j=0; j<aa[i].length; ++j){
                System.out.println("aa["+i+"]["+j+"] = " + aa[i][j]);
            }
        }
    }
}
