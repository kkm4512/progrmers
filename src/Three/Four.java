package Three;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Four {

    public static int[] solution(int[] arr, int[] query) {
        List<int[]> arrList = Arrays.asList(arr);

        IntStream.range(0, query.length).forEach(i -> {
            int queryIndex = query[i];
            arrList.set(0, (i % 2 == 0)
                    ? Arrays.copyOfRange(arrList.get(0), 0, queryIndex + 1)
                    : Arrays.copyOfRange(arrList.get(0), queryIndex, arrList.get(0).length));
        });

        return arrList.get(0);

    }

    public static void main(String[] args) {
        solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2});
    }
}
