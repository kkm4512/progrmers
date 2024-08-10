package Five;

import java.util.Arrays;

public class Eight {

    /**
     *  1. 기징긴 가로 * 가장긴 세로
     *  2. 일단 가로와, 세로를 나눠둘까?
     *  3. 이제 각 가로와, 세로를 바꾸어보자
     *  4. 모든 경우의 수를 일단 구해봐야겠는데?
     *  5. 첫 idx 부터 가로와,세로를 뒤집고
     *  6. 그 List 에서의 가로,세로의 max 을 찾고, 곱한걸
     *  7. List 에저장시켜서 출력하는형식으로 해야할거같은딩
     */
    public static int solution(int[][] sizes) {
        int[] maxRow = new int[1];
        int[] maxCol = new int[1];

        Arrays.stream(sizes).forEach(size -> {
            int row = size[0];
            int col = size[1];
            //row 에는 가장 큰값들만
            //col 에는 가장 작은 값들만
            if (row < col) {
                row = size[1];
                col = size[0];
            }
            maxRow[0] = Math.max(maxRow[0],row);
            maxCol[0] = Math.max(maxCol[0],col);
        });
        System.out.println(maxRow[0]);
        System.out.println(maxCol[0]);
        return maxRow[0] * maxCol[0];
    }

    public static void main(String[] args) {
        solution(new int[][]{{60,50},{30,70},{60,30},{80,40}});
    }
}
