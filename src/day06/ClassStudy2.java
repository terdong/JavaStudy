package day06;

public class ClassStudy2 {
    public static void main(String[] args) {

        NewCalculator cal_1 = new NewCalculator();
        cal_1.add(3,6);
        cal_1.subtract(3,6);
        cal_1.multiply(3,6);
        cal_1.divide(6,2);
        System.out.println("계산 기록 출력하기.");
        cal_1.printHistory();

        NewCalculator cal_2 = new NewCalculator();
        cal_2.printHistory();

        NewCalculator cal_3 = new NewCalculator();

        NewCalculator cal_4 = new NewCalculator();
    }
}

class NewCalculator{
    public String [] history = new String[999];
    public int historyCount = -1;

    public void printHistory(){
        if(historyCount == -1){
            System.out.println("계산 기록이 없습니다.");
        }
        for(int i=0; i< historyCount; ++i){
            System.out.println(history[i]);
        }
    }

    public void printResult(String str){
        historyCount += 1;
        if(historyCount >= history.length){
            historyCount = 0;
        }
        history[historyCount] = str;

        System.out.println(str);
    }
    public void add(int a, int b){
        printResult(a + " + " + b + " = " + (a+b));
    }
    public void subtract(int a, int b){
        printResult(a + " - " + b + " = " + (a-b));
    }
    public void multiply(int a, int b){
        printResult(a + " * " + b + " = " + (a*b));
    }
    public void divide(int a, int b){
        printResult(a + " / " + b + " = " + (a/b));
    }
}

