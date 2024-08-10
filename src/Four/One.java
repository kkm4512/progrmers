package Four;

import java.util.stream.IntStream;

public class One {

    public static int[] solution(int[] num_list, int n) {
        return IntStream.range(0,num_list.length)
                .filter(num -> num % n == 0)
                .map( num -> num_list[num] )
                .toArray();

    }

    public static void main(String[] args) {
        solution(new int[]{4, 2, 6, 1, 7, 6},4);
    }


}
