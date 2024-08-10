package Two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class One {

    public static int solution(String my_string, String is_prefix) {
         return my_string.startsWith(is_prefix) ? 1 : 0;


    }

    public static void main(String[] args) {
        solution("banana","ban");
    }


}
