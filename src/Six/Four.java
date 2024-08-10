package Six;

import java.util.TreeSet;

public class Four {

    public static int[] solution(int[] numbers) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for ( int i=0; i<numbers.length; i++ ) {
            for ( int j=i+1; j<numbers.length; j++ ) {
                treeSet.add( numbers[i] + numbers[j] );
            }
        }
        return treeSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        solution(new int[]{5,0,2,7});
    }
}
