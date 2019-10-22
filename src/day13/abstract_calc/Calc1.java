package day13.abstract_calc;

public abstract class Calc1 {
    int a;
    int b;
    protected char op;

    abstract void answer();

    void answerV2(){
        // 출력내용: a + b =
        System.out.print(a + " " + op + " " + b + " = ");
    }

    void setData(int m, int n){
        a = m;
        b = n;
    }
}
