package Four;

import java.util.stream.IntStream;

public class Three {

    public static String[] solution(String[] names) {
        return IntStream.range(0,names.length)
                .filter(n -> n%5 == 0)
                .mapToObj(n -> names[n])
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});
    }
}
