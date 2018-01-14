package day9_classroom;

public class ClassRoom {
    public static void main(String[] args) {
        Student kim = new Student(12, "김주현", 3);
        kim.test[0].setPoint("국어", 95);
        kim.test[1].setPoint("영어", 83);
        kim.test[2].setPoint("수학", 76);
        kim.printScore();
    }
}