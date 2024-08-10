package Six;

public class Six {

    /**
     *  1. 음식의 종류와,양은 같아야함
     *  2. 음식을 먹는 순서도 같아야함
     *  3. 칼로리가 낮은 음식을 먼저 먹을 수 있게 배치하기
     *
     *  1. 그럼일단 홀수 일때는 1개씩 버리게 하는 리스트를 새로만들자
     */
    public static String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
                System.out.println(answer);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        solution(new int[]{1,7,1,2});
    }
}
