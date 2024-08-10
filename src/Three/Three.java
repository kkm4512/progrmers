package Three;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Three {

    /**
     * @param arr 안에서 가장 작은 2와, 가장 큰 2를 찾기
     * minTwo = start
     * maxTwo + 1 = end
     */
    public static int[] solution(int[] arr) {
        int[] indexes = IntStream.range(0,arr.length).map( i -> arr[i] == 2 ? i : 0 ).filter( e -> e != 0 ).toArray();
        if (indexes.length == 0) return new int[]{-1} ;
        else return Arrays.copyOfRange(arr, indexes[0], indexes[indexes.length-1]+1);
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1});
    }
}
