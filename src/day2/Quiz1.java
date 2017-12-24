package day2;

public class Quiz1 {
    public static void main(String [] args){
      /*
      개요
      바리스타를 꿈꾸는 김바리 학생은 이번달 초부터 별다방에서 일하기로 하였습니다.근무 계약 조건은 월급제로 기본시급과 일한시간을 곱하여 계산한다고 하네요.

      요구사항
      시급 8000 원으로 160 시간 근무하게될 경우, 받게될 총 급여를 계산하는 프로그램을 작성해주세요.

      총 급여(pay) = 시급(basePay) X 일한시간 (workingHours)
      */


      int basePay = 8000;
      int workingHours = 160;
      int pay = basePay * workingHours;

      System.out.println("급 8000 원으로 160 시간 근무하게될 경우, 받게될 총 급여 구하기");
      System.out.println("고객님께서 받으실 총 급여는 " + pay + "원 입니다.");
    }
}
