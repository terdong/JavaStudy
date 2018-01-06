package day7;

public class MethodCallLauncher {
    public static void main(String[] args) {
        /*
        HelloClass h = new HelloClass();
        h.num = 1111;
        System.out.println("h.num = " + h.num);
        */

        MethodCall m = new MethodCall();
        m.a();
        m.c();
        m.d();

        System.out.println(new MethodCall().hashCode());
        System.out.println(new MethodCall().hashCode());
        System.out.println(new MethodCall().hashCode());
        System.out.println(new MethodCall().hashCode());
        System.out.println(new MethodCall().hashCode());

    }
}
