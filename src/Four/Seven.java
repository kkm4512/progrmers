package Four;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Seven {

    public static int[] solution(int[] arr) {
        int start = IntStream.range(0, arr.length)
                .filter(n -> arr[n] == 2)
                .findFirst()
                .orElse(-1);

        int end = IntStream.iterate(arr.length - 1, i -> i >= 0, i -> i - 1)
                .filter(n -> arr[n] == 2)
                .findFirst()
                .orElse(-1);

        if (start == -1 || end == -1) return new int[]{-1};
        return Arrays.copyOfRange(arr,start,end+1);
    }

    public static void main(String[] args) {
        solution(new int[]{1,1,1});
    }
}
