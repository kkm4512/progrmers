package Seven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class One {
    public static String solution(String[] cards1, String[] cards2, String[] goals) {
        List<String> listCards1 = Arrays.stream(cards1).collect(Collectors.toList());
        List<String> listCards2 = Arrays.stream(cards2).collect(Collectors.toList());
            for (String goal : goals) {
                if ( listCards1.get(0).equals(goal)) listCards1.remove(0);
                else if ( listCards2.get(0).equals(goal)) listCards2.remove(0);
                else return "No";
        }
        return "Yes";
    }


    public static void main(String[] args) {
        solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
    }


}
