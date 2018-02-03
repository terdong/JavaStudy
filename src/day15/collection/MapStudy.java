package day15.collection;

import day01.HelloWorld;

import java.util.HashMap;

public class MapStudy {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        String str = "안뇽?";
        Integer number = 99;
        HelloWorld world = new HelloWorld();
        world.number += 11;

        System.out.println("넣기 전 map.size() = " + map.size());

        map.put("문자열", str);
        map.put("정수", number);
        map.put("안녕세계", world);

        System.out.println("넣은 후 map.size() = " + map.size());

        String str2 = (String)map.get("문자열");
        System.out.println("str2 = " + str2);

        Integer number2 = (Integer)map.get("정수");
        System.out.println("number22 = " + number2);

        HelloWorld world2 = (HelloWorld)map.get("안녕세계");
        System.out.println("world2.number = " + world2.number);

        // 삭제
        map.remove("정수");
        System.out.println("삭제한 후 map.size() = " + map.size());





    }
}
