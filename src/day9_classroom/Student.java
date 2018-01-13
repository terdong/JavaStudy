package day9_classroom;

public class Student {
    int id;
    String name;
    int subNum;
    Test[] test;

    Student(int id, String name, int subNum) {
        this.id = id;
        this.name = name;
        this.subNum = subNum;
        test = new Test[subNum];
        for(int i = 0; i<test.length; ++i){
            test[i] = new Test();
        }
    }

    String getName(){
        return id + " : " + name;
    }

    int getGrade() {
        int sum = 0;
        for(int i=0; i<subNum; ++i){
            sum += test[i].point;
        }
        return sum;
    }

    int getGrade(int a){
        int base = 100 * subNum / a;
        int rank = getGrade() / base + 1;
        return rank;
    }

    void printScore() {
        System.out.println("(번호 : 이름)");
        System.out.println(getName());

        for(int i=0; i < subNum; ++i){
            System.out.println(test[i].getPoint() + " ");
        }
        System.out.println();
        System.out.println("총점 " + getGrade());
        int rank = 5;
        System.out.println(rank + "단계평가 " + getGrade(rank));
        System.out.println();
    }
}