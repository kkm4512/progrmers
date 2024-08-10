package Two;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Three {

    public static void solution(String my_string, int m, int c) {
        String collect = IntStream.range(0, my_string.length() / m)
                .mapToObj(i -> String.valueOf(my_string.charAt(i * m + c - 1)))
                        .collect(Collectors.joining());


        System.out.println(collect);


    }

    public static void main(String[] args) {
        solution("ihrhbakrfpndopljhygc",4,2);
    }
}
