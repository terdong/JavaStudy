package day15.collection;

import day01.HelloWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

// 데이터를 가변적으로 저장할 수 있는 ArrayList에 대해 알아보자.
public class ArrayListStudy {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        LinkedList list = new LinkedList();

        HelloWorld h = new HelloWorld();
        h.number += 1;
        String str = "메롱";

        arrayList.add(h);
        arrayList.add(h);
        arrayList.add(h);
        arrayList.add(str);

        for (int i = 0; i < 10; ++i) {
            arrayList.add(i);
        }

        System.out.println("arrayList.size() = " + arrayList.size());

 /*       int [] array = new int[1000];
        int result = array[0];*/

        for (int i = 0; i < arrayList.size(); ++i) {

            Object obj = arrayList.get(i);


            System.out.println(i + ": " + obj);
        }

        Object obj = arrayList.get(0);
        h = (HelloWorld)obj;
        System.out.println("h.number = " + h.number);
    }
}
