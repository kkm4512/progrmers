package Seven;

import java.util.Arrays;
import java.util.Comparator;

public class Two {
    public static int solution(int k, int m, int[] score) {
        Integer[] intScore = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(intScore, Comparator.reverseOrder());
        int result = 0;
        for ( int i=0; i<(intScore.length/m); i++ ) {
            Integer[] copy = Arrays.copyOfRange(intScore,i*m,(i*m)+m);
            Arrays.sort(copy);
            result += copy[0] * m;
        }
        return result;


    }

    public static void main(String[] args) {
        solution(4,3,new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2,1});
    }
}
