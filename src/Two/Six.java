package Two;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Six {

    public static String solution(String my_string, int[] indices) {
        Set<Integer> list = Arrays.stream(indices).boxed().collect(Collectors.toSet());
        return IntStream.range(0,my_string.length())
                .filter(n -> !list.contains(n))
                .mapToObj(n -> String.valueOf(my_string.charAt(n)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        int[] indices = new int[]{1, 16, 6, 15, 0, 10, 11, 3};
        solution("apporoograpemmemprs",indices);
    }
}
