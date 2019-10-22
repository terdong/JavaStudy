package day15;

public class Fish {
    private String name;
    private int weight;

    public Fish(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    // toString() 메소드는 해당 메소드를 호출하면 String 타입을 반환한다.
    // 그러나 println 메소드에 객체 자체를 넘겨주어도 print 메소드 자체에서 toString() 메소드를 호출한다.
    @Override
    public String toString() {
        return "물고기 이름: " + name + ", 무게: " + weight + "kg";
    }
}