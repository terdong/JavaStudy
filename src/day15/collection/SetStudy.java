package day15.collection;

import day01.HelloWorld;

import java.util.HashSet;
import java.util.Iterator;

// 같은 레퍼런스 변수를 중복 저장 할 수 없는 Set에 대해 알아보자.
public class SetStudy {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        HelloWorld h = new HelloWorld();
        HelloWorld h2 = new HelloWorld();
        h2.number = 1;

        set.add(h);
        System.out.println("set.size() = " + set.size());
        set.add(h);
        System.out.println("set.size() = " + set.size());
        set.add(h2);
        System.out.println("set.size() = " + set.size());

        Iterator e = set.iterator();

        for(;e.hasNext();){
            h = (HelloWorld)e.next();
            System.out.println("h.number = " + h.number);
        }


    }
}
