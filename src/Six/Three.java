package Six;

import java.util.Arrays;

public class Three {

    public static int[] solution(int[] array, int[][] commands) {
        int[] results = new int[commands.length];
        int i = 0;
        for ( int[] command : commands ) {
            int[] copyArray = Arrays.copyOfRange(array,command[0]-1,command[1]);
            Arrays.sort(copyArray);
            results[i] = copyArray[command[2]-1];
            ++i;
        }
        return results;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4},new int[][]{{2,5,3},{4,4,1},{1,7,3}});
    }
}
