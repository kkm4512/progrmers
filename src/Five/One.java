package Five;

import java.util.Arrays;

public class One {

    public static int solution(int[] num_list) {
        int[] count = new int[1];
        Arrays.stream(num_list)
                .forEach(e -> {
                    while (e > 1) {
                        count[0]++;
                        if (e%2 == 1 ) e = (e-1)/2;
                        else e /= 2;
                    }
                });
        return count[0];

    }

    public static void main(String[] args) {
        solution(new int[]{12, 4, 15, 1, 14});
    }


}
