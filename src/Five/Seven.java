package Five;

import java.util.stream.IntStream;

public class Seven {
    /**
     *  1. p의 길이만큼을 t에서 뽑은 숫자가, p보다 작거나 같으면 횟수 증가
     */

    public static int solution(String t, String p) {
        //람다식 내부에서 외부 변수 접근 불가하기때문에, Array 로 접근
        int[] count = new int[1];
        IntStream.rangeClosed(0, t.length() - p.length())
                .forEach( i -> {
                    long tConvert = Long.parseLong(t.substring(i,i+p.length()));
                    long pConvert = Long.parseLong(p,10);
                    if (tConvert <= pConvert) count[0] += 1;
                });
        return count[0];

    }

    public static void main(String[] args) {
        solution("3141592","271");
    }
}
