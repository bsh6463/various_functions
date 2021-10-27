package stream;

import java.util.Arrays;

public class StreamTest {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44};

        //반복문
        System.out.println("반복문 사용");
        for (int num : arr) {
            System.out.println("num = " + num);
        }

        System.out.println("=============================");

        //stream
        System.out.println("stream 사용");
        Arrays.stream(arr).forEach(num -> System.out.println("num = " + num));
    }
}
