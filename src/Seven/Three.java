package Seven;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Three {

    /**
     * 1.  / 1 2 2 /
     *  - 1은 제거하고 2,2 의 idx 를 반환
     * 2. / 1 1 2 /
     *  - 1 1은 제거하고, 2의 idx 반환 , 오름차순 정렬
     * 3. / 1 1 1 /
     *  - 모든 1의 idx 를 반환하되, 오름차순 정렬
     */
    public static int[] solution(int[] answers) {
        int[] students = new int[3];
        int[][] patterns = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        for (int i = 0; i < 3; i++) {
            students[i] = guessAnswer(answers, patterns[i]);
        }
        int max = Arrays.stream(students).max().getAsInt();
        return Arrays.stream(IntStream.range(0, students.length).map(idx ->  students[idx] == max ? idx+1 : -1 ).toArray()).filter(i -> i != -1).toArray();
    }

    public static int guessAnswer(int[] answers, int[] pattern) {
        int result = 0;
        for (int i = 0; i < answers.length; i++) {
            int idx = i % pattern.length;
            if (answers[i] == pattern[idx]) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,5});
    }


}
