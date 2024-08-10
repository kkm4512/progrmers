package One;

import java.util.stream.IntStream;

public class One {

    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder(); // StringBuilder 인스턴스 생성
        IntStream.range(0,str1.length())
                .forEach(n -> {
                    sb.append(str1.charAt(n));
                    sb.append(str2.charAt(n));
                });
        return sb.toString();
    }

    public static void main(String[] args) {
        solution("aaaaa","bbbbb");
    }
}
