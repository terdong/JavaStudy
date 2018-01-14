package day09_classroom;

public class Test {
    String subject;
    int point;
    void setPoint(String s, int p) {
        subject = s;
        point = p;
    }

    String getPoint(){
        return subject + " : " + point;
    }
}
