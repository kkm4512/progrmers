package Two;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Nine {

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1]+1;
        int c = slicer[2];
        switch (n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, b);
            case 2:
                return Arrays.copyOfRange(num_list, a, num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, a, b);
            default:
                return IntStream.range(a,b)
                        .filter( i -> (i-a) % c == 0 )
                        .map( i -> num_list[i] )
                        .toArray();

        }
    }

    public static void main(String[] args) {
        int[] solution = solution(4, new int[]{1, 5, 3}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(Arrays.toString(solution));
    }
}
