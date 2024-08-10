package Six;

import java.util.Arrays;
import java.util.Comparator;

public class Two {

    /**
     * 각 문자열의 n번째 인덱스를 순서로 정렬시키기
     * 1. 일단 먼저 일반적인 정렬먼저 시켜보자
     */
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자를 기준으로 먼저 비교
                int result = s1.charAt(n) - s2.charAt(n);
                if (result == 0) {
                    // n번째 문자가 같다면 전체 문자열을 사전순으로 비교
                    return s1.compareTo(s2);
                }
                return result;
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        solution(new String[]{"sun", "bed", "car"}, 1);
    }
}
