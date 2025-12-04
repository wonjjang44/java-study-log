package dev.javastudy.collections.array;

import java.util.Arrays;

/**
 * 배열의 추가 기능 테스트
 *   - 배열의 첫 번째 위치, 중간 위치, 마지막 위치에 값을 추가한다
 */
public class SecondsArrayMainClass {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[3] = 40;
        intArr[4] = 50;

        // [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]
        System.out.println("초기 intArr => " + Arrays.toString(intArr));

        // 배열의 첫 번째 위치에 값 추가
        for(int i = intArr.length - 1; i > 0; i--){
            intArr[i] = intArr[i -1];
        }

        // 배열의 0번째 인덱스 위치에 정수 40을 추가한다
        intArr[0] = 60;

        System.out.println("배열의 가장 첫 번째 위치에 정수 60 추가 후 intArr => " + Arrays.toString(intArr));


        // 배열의 중간 위치에 데이터 추가
        // 중간 지점 인덱스 설정
        int centerIndex = intArr.length / 2;
        for(int i = intArr.length - 1; i > centerIndex; i--) {
            intArr[i] = intArr[i - 1];
        }

        intArr[centerIndex] = 70;

        System.out.println("배열의 중간 지검에 정수 70 값 추가 후 intArr => " + Arrays.toString(intArr));


        // 배열의 마지막 위치에 값 추가하기
        intArr[intArr.length - 1] = 100;
        System.out.println("배열의 마지막 지점에 정수 100 값 추가 후 intArr => " + Arrays.toString(intArr));
    }

}
