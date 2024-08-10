package One;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Seven {
    public static String[] solution(String my_string) {
        List<String> stringList = new ArrayList<>();
        IntStream.range(0,my_string.length())
                .forEach( n -> stringList.add(my_string.substring(n)) );

        stringList.sort(String::compareTo);
        String[] strings = stringList.toArray(new String[0]);

        return strings;
    }

    public static void main(String[] args) {
        solution("banana");
    }
}
