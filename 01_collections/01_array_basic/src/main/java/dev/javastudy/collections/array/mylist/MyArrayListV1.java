package dev.javastudy.collections.array.mylist;

public class MyArrayListV1 {

    // 배열 리스트의 기본 용량(전체 길이)
    private static final int DEFAULT_CAPACITY = 5;

    // 모든 데이터 타입이 들어올 수 있도록 Object타입 배열로 선언
    private Object[] elementData;

    // 배열 내부에 존재하는 데이터 개수
    private int size = 0;


    /**
     * 생성 시 Object 배열 초기화
     */
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }


    /**
     * 생성 시 Object 배열의 전체 크기를 정할 수 있다.
     *
     * @param initialCapacity 초기 Object 배열 전체 길이
     */
    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }


    /**
     * size getter
     *
     * @return exists Data count
     */
    public int getSize() {
        return size;
    }


    /**
     * 배열에 데이터 추가
     *
     * @param data 추가할 데이터
     */
    public void setData(Object data) {
        elementData[size] = data;

        // 두 번째로 값 추가 시 두 번째 인덱스 위치에 값을 추가해야 하므로 + 1
        size++;
    }


    /**
     * 배열의 특정 위치에 데이터 추가
     * 
     * - ex) 2번 째 위치에 값을 추가? => 두 번째 인덱스 위치에 존재하는 값은 새롭게 추가한 값으로 대체됨
     *
     * @param index 데이터를 추가할 위치
     * @param data 추가할 데이터
     *
     * @return 변경 전 데이터 리턴
     */
    public Object setData(int index, Object data) {
        Object beforeData = this.getData(index);
        elementData[index] = data;

        return beforeData;
    }


    /**
     * 배열에 set한 데이터 get
     *
     * @param index 배열의 인덱스
     * @return Object
     */
    public Object getData(int index) {
        return elementData[index];
    }


    /**
     * 배열에서 특정 데이터가 위치하는 인덱스 값 조회
     *
     * @param data 찾을 데이터
     * @return 배열에 찾는 값이 있다면 해당 값의 index, 없다면 -1
     */
    public int indexOf(Object data) {
        for (int i = 0; i < elementData.length; i++)
            if(data.equals(elementData[i])) return i;

        return -1;
    }


    /**
     * Object 클래스의 toString() 오버라이드
     *
     * 배열의 값을 출력
     *   - 배열 내부에 존재하는 값만 출력한다
     *   - ex) 1) 배열에 값을 set하기 전 => []으로 출력
     *         2) 배열에 값이 2개 set 됐다면 => [1, 2, null, null, null] 이지만 추가된 데이터만 조회 => [1, 2]
     *
     * @return 값이 존재하는 배열의 값만 출력
     *         => ex) [1, 2, 3, ..]
     */
    @Override
    public String toString() {
        int size = this.getSize();
        if(size == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] != null) {
                Object element = elementData[i];
                sb.append(element);
                if(i < size - 1) sb.append(", ");
            }
        }

        sb.append("] / ");
        sb.append("size => ");
        sb.append(size);
        sb.append(" / ");
        sb.append("total length => ");
        sb.append(elementData.length);

        return sb.toString();
    }
}