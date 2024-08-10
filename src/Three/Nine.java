package Three;

import java.util.Arrays;

public class Nine {

    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0,n);
    }

    public static void main(String[] args) {
        solution(new int[]{2,1,6},2);
    }
}
