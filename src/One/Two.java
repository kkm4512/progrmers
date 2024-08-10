package One;

import java.util.Arrays;

public class Two {

    public static String solution(String[] arr) {
        return Arrays.stream(arr)
                .reduce("", (a,b) -> a+b  );
    }

    public static void main(String[] args) {
        solution(new String[]{"a","b","c"});
    }
}
