package Three;

import java.util.Arrays;

public class Six {

    public static int[] solution(int[] num_list, int n) {
        int[] lastCopy = Arrays.copyOfRange(num_list,0,n);
        int[] firstCopy = Arrays.copyOfRange(num_list,n,num_list.length);
        int [] dest = new int[firstCopy.length + lastCopy.length];
        System.arraycopy(firstCopy,0,dest,0,firstCopy.length);
        System.arraycopy(lastCopy,0,dest,firstCopy.length,lastCopy.length);
        return dest;
    }

    public static void main(String[] args) {
        solution(new int[]{5, 2, 1, 7, 5},3);
    }
}
