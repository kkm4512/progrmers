package Seven;

import java.util.*;

public class Five {

    /**
     *  1. 룰러가 벽에서 벗어나면 안됨
     *  2. 구역의 일부분만 포함되도록 칠하면 안됨
     */
    public static int solution(int n, int m, int[] section) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> sectionList = new ArrayList<>();
        int count = 0;
        for ( int s : section ) {
            sectionList.add(s);
        }
        for ( int i=1; i<=n; i++ ) {
            map.put(i,sectionList.contains(i) ? 0 : 1);
        }
        for ( int i=1; i<=n; i++ ) {
            //청소가 안됐다면
            if (map.get(i) == 0) {
                count++;
                for ( int j=i; j<=i+m-1; j++ ) {
                    map.put(j,1);
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        solution(8,4,new int[]{2,3,6});
    }
}
