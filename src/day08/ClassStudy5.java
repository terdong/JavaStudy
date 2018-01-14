package day08;

public class ClassStudy5 {

    int number;
    ClassStudy5Friend csf;

    static int bigNumber;

    public void a(int number){
        //int number = 10;

        int number1;
        number1 = 99;

        //this.number = this.number + number;
        this.number += number;
        System.out.println("this.number = " + this.number);
    }

    public void b(ClassStudy5Friend csf){
        this.csf = csf;
    }

    public void c(){
        System.out.println(this.csf.mesesage);

        ClassStudy5.d(number);
    }

    public static void d(int number){
        System.out.println(number);
    }
}
