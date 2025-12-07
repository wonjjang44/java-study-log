package dev.javastudy.collections.array.mylist.main;

import dev.javastudy.collections.array.mylist.MyArrayListV1;

public class MyArrayListV1MainClass {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("list => " + list);

        list.setData("테스트1");
        list.setData("테스트2");
        list.setData(3);
        list.setData(true);
        list.setData('X');

        System.out.println("데이터 추가 후 list => " + list);

        System.out.println("list.getSize() => " + list.getSize());
        System.out.println("list.getData(0) => " + list.getData(0));
        System.out.println("list.indexOf(\"테스트2\") => " + list.indexOf("테스트2"));

        System.out.println("변경 전 값 => " + list.setData(2, "XD"));
        System.out.println("데이터 수정 후 list => " + list);

        try {
            list.setData("의도적으로 배열 최대 범위 초과");
            System.out.println("list => " + list);
        } catch (IndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("#####################################################");
            System.out.println("배열의 범위를 초과했습니다.\n배열 길이를 동적으로 늘려주는 로직을 추가하거나 기존 데이터에 덮어 씌워 주세요.");
            System.out.println("#####################################################");
        }

    }

}
