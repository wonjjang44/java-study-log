package dev.javastudy.collections.array.mylist.main;

import dev.javastudy.collections.array.mylist.MyArrayListV2;

public class MyArrayListV2MainClass {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("list => " + list);

        list.setData(1);
        list.setData(2);
        list.setData(3);
        list.setData(4);
        list.setData(5);

        System.out.println("list = " + list);

        // 의도적 배열 길이 초과
        list.setData(6); // 배열 길이 2배 동적 증가 확인(5 => 10)
        System.out.println("list = " + list);

        list.setData(7);
        list.setData(8);
        list.setData(9);
        list.setData(10);
        list.setData(11);
        System.out.println("list = " + list); // 배열 길이 2배 동적 증가 확인(10 => 20)


    }

}
