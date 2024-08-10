package Two;

import java.util.stream.IntStream;

public class Seven {

    public static int[] solution(int start_num, int end_num) {
        return IntStream.iterate(start_num, n -> n - 1)
                .limit( start_num - end_num + 1 )
                .toArray();
    }

    public static void main(String[] args) {
        solution(10,3);
    }
}
