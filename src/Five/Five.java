package Five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Five {
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        //문자열 붙일떄 더 빠르게 가능하기떄문에 StringBuilder 선언
        StringBuilder sb = new StringBuilder();

        for ( char c : s.toCharArray() ) {
            //공백일 경우
            if (c == ' ') {
                list.add(sb.toString());
                sb = new StringBuilder();
            //공백이 아닐 경우
            } else {
                sb.append(c);
            }
        }
        //마지막 sb에 있는 단어 넣어주기 위함
        list.add(sb.toString());
        List<String> answer = list.stream().map(string -> {
            return IntStream.range(0,string.length())
                    //지금 여기에는 Stream<char> 형태들이 모여있음
                    .mapToObj(i -> {
                        char c = string.charAt(i);
                        return i%2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c);
                    }).map(String::valueOf)
                    .collect(Collectors.joining());
        }).collect(Collectors.toList());
        return String.join(" ",answer);

    }

    public static void main(String[] args) {
        Five five = new Five();
        five.solution("try hello world");
    }
}

