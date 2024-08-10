package One;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Eight {

    public static int solution(String my_string, String is_suffix) {
        List<String> strings = new ArrayList<>();
        IntStream.range(0,my_string.length())
                .forEach( n -> strings.add(my_string.substring(n)) );
        int result = 0;
        if (strings.contains(is_suffix)) result = 1;
        return result;


    }

    public static void main(String[] args) {
        solution("banana","nan");
    }

}
