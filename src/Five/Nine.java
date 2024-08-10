package Five;

import java.util.ArrayList;
import java.util.List;

public class Nine {

    /**
     * 그럼 일단 s 에대한 아스키코드값 + n 하면되는거아닌가?
     * 만약 현재 alphabet 아스키 코드
     * 현재의 아스키 코드값이 65 ~ 90 [대문자]
     * 97 ~ 122 [소문자] 일단 이렇게 분기 처리하자
     * 그리고 만약 대문자 로직에서 현재 아스키 코드값에서 +n을 했을때 90을 초과하게 된다면
     * (아스키 코드값 + n ) - 90 을 해주자
     */
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        List<Character> results = new ArrayList<>();
        for ( char c : sb.toString().toCharArray() ) {
            int ascii = c+0;
            //대문자
            if (ascii >= 65 && ascii <= 90) {
                //만약 아스키 코드값에 + n을 더했더니 대문자를 초과할경우
                if (ascii + n >= 91){
                    //만약 Z = 90이 들어왔다고 가정 n =4
                    // 65 A 3
                    // 66 B 2
                    // 67 C 1
                    // 68 D 0
                    char convertedAlphabet = (char) ((ascii - 65 + n) % 26 + 65);
                    results.add(convertedAlphabet);
                } else {
                    results.add((char) (ascii+n));
                }
            //소문자
            } else if (ascii >= 97 && ascii <= 122){
                if (ascii + n >= 123){
                    char convertedAlphabet = (char) ((ascii - 97 + n) % 26 + 97);
                    results.add(convertedAlphabet);
                } else {
                    results.add((char) (ascii+n));
                }
            //그 외 (공백)
            } else {
                results.add(c);
            }
        }
        StringBuilder resultsStringBuilder = new StringBuilder();
        for ( char c : results ) {
            resultsStringBuilder.append(c);
        }
        return resultsStringBuilder.toString();
    }


    public static void main(String[] args) {
        solution("AB",3);
    }
}
