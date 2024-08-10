package Four;

import java.util.stream.IntStream;

public class Two {

    public static int solution(int[] num_list) {
        //홀수
        int left = IntStream.range(0,num_list.length)
                .filter(n -> n%2 == 1)
                .map( idx -> num_list[idx] )
                .sum();
        //짝수
        int right = IntStream.range(0,num_list.length)
                .filter(n -> n%2 == 0)
                .map( idx -> num_list[idx] )
                .sum();
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        solution(new int[]{4, 2, 6, 1, 7, 6});
    }
}
