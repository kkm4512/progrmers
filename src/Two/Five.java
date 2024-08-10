package Two;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Five {

    public static int[] solution(int n, int k) {
        List<Integer> list =
                IntStream.rangeClosed(1,n)
                        .filter(num -> num % k == 0)
                        .boxed()
                        .collect(Collectors.toList());
        return list.stream()
                .mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        solution(10,3);
    }
}
