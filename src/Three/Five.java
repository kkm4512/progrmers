package Three;

import java.util.stream.IntStream;

public class Five {

    public static int[] solution(int[] num_list, int n) {
        return IntStream.range(0,num_list.length)
                .filter(number -> number >= n-1)
                .map( number -> num_list[number] )
                .toArray();

    }

    public static void main(String[] args) {
        solution(new int[]{5, 2, 1, 7, 5},2);
    }
}
