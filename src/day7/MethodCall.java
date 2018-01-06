package day7;

public class MethodCall {
    String str;
    int num;
    MethodCall m;

    void a(){
        MethodCall m = new MethodCall();
        m.num = 99;
        m.str = "안녕?";
        b(m);
    }

    void b(MethodCall m){
        System.out.println("m.num = " + m.num);
        m.num *= 2;
        System.out.println("'m.num *= 2' = " + m.num);
    }

    // 멤버변수 m에 MethodCall 객체를 생성하여 연결 시켜준다.
    void c(){
        m = new MethodCall();
        //현재 객체(this)의 멤버변수 m의 str 멤버변수에 해당 값을 정의해준다.
        m.str = "이 레퍼런스 변수 m은 MethodCall 클래스의 객체ID: " + this.hashCode() + "번호인 객체의 멤버 변수입니다.";
    }

    void d(){
        System.out.println(m.str);
    }
}
