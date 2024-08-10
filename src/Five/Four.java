package Five;

import java.util.Arrays;

public class Four {
    /**
     * 1 <= n <= 100,000,000
     * 2. n의 타입은 21억보다 낮기 때문에 int 타입으로 선언
     */
    public static int solution(int n) {
        /**
         * 1. Integer.toString 메서드를 활용하여 n -> (String) 3진수 변환
         * 2. (String) 3진수 -> reverse
         * 3. (reverse String) 3진수 -> 10진수
         */

        //10진수 -> 3진수
        String tenToThree = Integer.toString(n,3);
        //reverse 3진수
        String reverseTenToThree = new StringBuilder(tenToThree).reverse().toString();
        // 3진수 -> 10진수
        /**
         * 1. 컴퓨터는 reverseTenToThree가 몇진수인지 모른다.
         * 2. 따라서 Integer.parseInt(reverseTenToThree,3); 의 뜻을 해석하면 다음과 같다
         * 3. reverseTenToThree는 3진수이며 이것을 10진수로 변환시켜라
         */
        return Integer.parseInt(reverseTenToThree,3);
    }

    public static void main(String[] args) {
        solution(45);
    }
}
