package One;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Five {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0,my_strings.length)
                .forEach(e -> {
                    sb.append(my_strings[e].substring( parts[e][0],parts[e][1]+1 ));
                });
        return sb.toString();
    }

    public static void main(String[] args) {
        solution(
                new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][]{{0,4},{1,2},{3,5},{7,7}}
                );
    }
}
