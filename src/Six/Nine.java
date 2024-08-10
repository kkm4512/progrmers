package Six;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Nine {

    public static String solution(int a, int b) {
        Map<String ,String> map = new HashMap<>();
        map.put("MONDAY","MON");
        map.put("TUESDAY","TUE");
        map.put("WEDNESDAY","WED");
        map.put("THURSDAY","THU");
        map.put("FRIDAY","FRI");
        map.put("SATURDAY","SAT");
        map.put("SUNDAY","SUN");
        LocalDateTime date = LocalDateTime.of(2016, 5, 24, 0, 0);
        String week = date.getDayOfWeek().toString();
        return map.get(week);


    }

    public static void main(String[] args) {
        solution(5,24);
    }
}
