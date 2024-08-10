package Three;

import java.util.Arrays;
import java.util.List;

public class Eight {

    public static String[] solution(String[] str_list) {
        List<String> stringList = Arrays.asList(str_list);
        int getL = stringList.contains("l") ? stringList.indexOf("l") : Integer.MAX_VALUE;
        int getR = stringList.contains("r") ? stringList.indexOf("r") : Integer.MAX_VALUE;

        if (getL < getR) {
            return Arrays.copyOfRange(str_list, 0, getL);
        } else if (getR < getL){
            return Arrays.copyOfRange(str_list, getR + 1, str_list.length);
        } else {
            return new String[0];
        }

    }

    public static void main(String[] args) {
        solution(new String[]{"l"});
    }
}
