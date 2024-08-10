package Four;

import java.util.Arrays;

public class Eight {

    public static int[] solution(int[] array) {
        return Arrays.stream(array).map( e -> {
            if (e >= 50 && e%2 == 0) return e/2;
            else if (e < 50 && e%2 == 1) return e*2;
            else return e;
        }).toArray();
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 100, 99, 98});
    }
}
