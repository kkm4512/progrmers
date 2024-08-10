package Three;

import java.util.stream.IntStream;

public class One {

    public static int solution(int[] num_list) {
        return IntStream.range(0,num_list.length)
                .filter(i -> num_list[i] < 0)
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        solution(new int[]{12, 4, 15, 46, 38, 1, 15});
    }


}
