package day13.abstract_calc;

public class Plus extends Calc1 {
    public Plus(){
        this.op = '+';
    }
    @Override
    void answer() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    @Override
    void answerV2(){
        super.answerV2();
        System.out.println(a + b);
    }
}
