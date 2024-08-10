package Five;

import java.util.Arrays;

public class Two {

    public static int solution(int[] num_list) {
         return num_list.length >= 11 ?
                Arrays.stream(num_list).sum() :
                Arrays.stream(num_list).reduce(1, (a, b) -> a * b);


    }

    public static void main(String[] args) {
        solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1});
    }
}
