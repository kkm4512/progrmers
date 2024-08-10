package Six;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Eight {
    /**
     * 1. 명예의 전당에 한명씩 넣는다 (result 에는 명예의 전당에서 가장 작은 점수를 넣는다)
     * 2.
     */

    public static void solution(int k, int[] scores) {
        int[] answer = new int[scores.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < scores.length; i++) {
            priorityQueue.add(scores[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }
        System.out.println(Arrays.toString(answer));

    }

    public static void main(String[] args) {
        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }
}
