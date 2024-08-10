package Four;

import java.util.Arrays;

public class Six {
    public static int[] solution(int[] arr, int[][] queries) {
        for ( int i=0; i< queries.length; i++ ) {
            int left = queries[i][0];
            int right = queries[i][1];
            for ( int j=Math.min(left,right); j<=Math.max(left,right); j++ ) {
                arr[j]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        solution(new int[]{0, 1, 2, 3, 4},new int[][]{{0,1},{1,2},{2,3}});
    }
}
