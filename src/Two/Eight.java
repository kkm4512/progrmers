package Two;

import java.util.stream.IntStream;

public class Eight {

    public static void solution(int[] arr, int idx) {
        int i = IntStream.range(idx, arr.length)
                .peek(System.out::println)
                .filter(n -> arr[n] == 1 && n >= idx)
                .findFirst()
                .orElse(-1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        solution(new int[]{1, 1, 1, 1, 0},3);
    }
}