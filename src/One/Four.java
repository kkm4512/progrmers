package One;

import java.util.Arrays;

public class Four {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .map( intStr -> intStr.substring(s,s+l) )
                .mapToInt(Integer::parseInt)
                .filter(n -> n > k)
                .toArray();
    }

    public static void main(String[] args) {
        solution(new String[]{"0123456789","9876543210","9999999999999"},50000,5,5);
    }
}
