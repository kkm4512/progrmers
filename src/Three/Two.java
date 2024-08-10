package Three;

import java.util.Arrays;

public class Two {

    public static int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
                .flatMapToInt( interval -> Arrays.stream( Arrays.copyOfRange(arr, interval[0],interval[1]+1) )  )
                .toArray();



    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1,3},{0,4}});
    }
}
