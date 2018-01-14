package day08;

public class ClassStudy5Launcher {
    public static void main(String[] args) {
        ClassStudy5 classStudy51 = new ClassStudy5();
        ClassStudy5 classStudy52 = new ClassStudy5();
        ClassStudy5Friend csf = new ClassStudy5Friend("안녕? 난 ClassStudy5 친구야!");

        classStudy51.a(99);
        classStudy51.b(csf);
        classStudy51.c();

        ClassStudy5.bigNumber = 99;
        ClassStudy5.d(ClassStudy5.bigNumber);

        System.out.println("ClassStudy5.bigNumber = " + ClassStudy5.bigNumber );
    }
}
