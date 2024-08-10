package Four;

import java.util.stream.IntStream;

public class Four {

    public static String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0,todo_list.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});
    }
}
