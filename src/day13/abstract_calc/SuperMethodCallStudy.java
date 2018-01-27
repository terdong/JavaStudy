package day13.abstract_calc;

public class SuperMethodCallStudy {
    public static void main(String [] args){

        Plus plus = new Plus();
        plus.setData(27, 32);
        plus.answer();

        Calc1 calc1 = new Plus();
        calc1.setData(27, 32);
        calc1.answer();

        plus.setData(32, 11);
        plus.answerV2();

        calc1.setData(32, 11);
        calc1.answerV2();

        Multiply multiply = new Multiply(1234, 5678);
        multiply.answer();
        multiply.answerV2();

        Subtraction subtraction = new Subtraction(1, 99);
        subtraction.answer();
        subtraction.answerV2();

    }
}
