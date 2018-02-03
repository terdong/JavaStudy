package day15.collection;

import day01.HelloWorld;

import java.util.ArrayList;

public class GenericArrayListStudy {
    public static void main(String[] args) {

        Fish fish1 = new Fish("붕어", 2);
        Fish fish2 = new Fish("잉어", 5);
        Fish fish3 = new Fish("상어", 100);

        HelloWorld h = new HelloWorld();
        String str = "야호!123";

        ArrayList<Fish> arrayList = new ArrayList<>();

        System.out.println("객체 추가 전 arrayList size = " + arrayList.size());

        arrayList.add(fish1);
        arrayList.add(fish2);
        arrayList.add(fish3);

        System.out.println("객체 추가 후 arrayList size = " + arrayList.size());

        for(int i=0; i<arrayList.size(); ++i){
            Fish fish = arrayList.get(i);

            System.out.println(fish);
            //System.out.println(fish.toString());  바로 위 코드와 반환값이 같다.
        }

        // 지정된 타입이 아니라 컴파일 에러가 난다.
        //arrayList.add(h);
        //arrayList.add(str);

         arrayList.remove(0);

        System.out.println("객체 삭제 후 arrayList size = " + arrayList.size());

        for(int i=0; i<arrayList.size(); ++i){
            Fish fish = arrayList.get(i);

            System.out.println(fish);
        }

    }
}

class Fish{
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
