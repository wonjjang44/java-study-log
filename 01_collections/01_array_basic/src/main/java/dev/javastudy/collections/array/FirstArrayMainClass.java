package dev.javastudy.collections.array;

/**
 * 1. 배열을 생성할 때, 메모리상에 어떤 주소값을 가지고 생성되는지 확인한다.
 * 2. 배열은 인덱스를 사용하여 접근할 때 가장 빠르다. 하지만 순수 값을 배열에서 찾는(검색) 행위는 굉장히 느리다.
 * - 크기가 큰 배열을 생성하고 얼마나 걸리는지 시간을 비교해본다.
 *   - ms, ns 를 같이 비교해본다.
 */
public class FirstArrayMainClass {

    public static void main(String[] args) {
        // 1. 배열을 생성하고, 생성한 배열의 주소값(참조값) 조회
        int[] intArr = new int[3];
        System.out.println(intArr); // [I@7f560810 => 주소값 리턴 확인


        // 2. 크기가 제법 큰 배열을 생성하고 무작위 값을 세팅해준 뒤 인덱스 접근과 값 접근을 통해 속도가 얼마나 차이나는지 비교해본다.
        // 2-1) 크기가 1000000인 int 배열 선언
        int[] comparedIndexWithSearchIntArr = new int[1000000];
        for (int i = 0; i < comparedIndexWithSearchIntArr.length; i++) {
            comparedIndexWithSearchIntArr[i] = i;
        }


        // 100004번째 인덱스
        int index = 100004;

        // index 연산 시작 시간
        long startTime = System.currentTimeMillis();
        long nanoStartTime = System.nanoTime();

        int value = comparedIndexWithSearchIntArr[index];
        System.out.println(value);

        // index 연산 종료 시간
        long endTime = System.currentTimeMillis();
        long nanoEndTime = System.nanoTime();

        System.out.println("[index 접근 방식] 연산 시간 => " + (endTime - startTime) + "ms"); // 0ms
        System.out.println("[index 접근 방식] 연산 시간(nano) => " + (nanoEndTime - nanoStartTime) + "ns"); // 46792ns


        // 999999 값(배열의 마지막 값)
        int realValue = 1000000 - 1;

        long startTimeByValue = System.currentTimeMillis();
        long nanoStartTimeByValue = System.nanoTime();

        for (int i : comparedIndexWithSearchIntArr) {
            if(i == realValue) {
                System.out.println("i = " + i);

                break;
            }

        }

        long endTimeByValue = System.currentTimeMillis();
        long nanoEndTimeByValue = System.nanoTime();

        System.out.println("[value 접근 방식] 연산 시간 => " + (endTimeByValue - startTimeByValue) + "ms"); // 4ms
        System.out.println("[value 접근 방식] 연산 시간(nano)=> " + (nanoEndTimeByValue - nanoStartTimeByValue) + "ns"); // 5148208ns
    }

}
