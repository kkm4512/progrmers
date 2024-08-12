package Seven;

import java.util.*;
import java.util.stream.Collectors;

public class Seven {

    /**
     *  1. 일단 몇개 일치하는지 구하기
     *  2. 순서는 상관없다고 했으니까 sort 시키고 대조해보기
     *  3. System.out.println
     */
    public static int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> win_numsList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        Map<Integer,Integer> lottoRank = new HashMap<>();
        lottoRank.put(1,6);
        lottoRank.put(2,5);
        lottoRank.put(3,4);
        lottoRank.put(4,3);
        lottoRank.put(5,2);
        lottoRank.put(6,1);
        int zeroCount = 0;
        int result = 0;
        int[] answer = new int[2];
        for ( int lotto : lottos ) {
            if (win_numsList.contains(lotto)) result++;
            if (lotto == 0) zeroCount++;
        }
        answer[0] = lottoRank.getOrDefault(result+zeroCount,6);
        answer[1] = lottoRank.getOrDefault(result,6);
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{0, 0, 0, 0, 0, 0},new int[]{38, 19, 20, 40, 15, 25});
    }
}
