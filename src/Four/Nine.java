package Four;

import java.util.Arrays;

public class Nine {

    public static int solution(int[] arr) {
        for ( int i=0; i<10000000; i++ ) {
            int[] copy = Arrays.copyOf(arr,arr.length);
            arr = Arrays.stream(arr).map( e -> {
                if (e >= 50 && e%2 == 0) return e/2;
                else if (e < 50 && e%2 == 1) return (e*2)+1;
                else return e;
            } ).toArray();

            if (Arrays.equals(arr, copy)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 100, 99, 98});
    }
}
