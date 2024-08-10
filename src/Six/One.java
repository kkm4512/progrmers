package Six;

import java.util.HashMap;
import java.util.Map;

public class One {

    /**
     *  1. 아스키 코드값이 65보다 작은걸 찾아서 뺴내보자
     *  2. 빼내고, 남은 문자열들을
     */
    public static void solution(int s) {
        StringBuilder results = new StringBuilder();
        Map<Character,String> map = new HashMap<>();
        map.put('0',"zero");
        map.put('1',"one");
        map.put('2',"two");
        map.put('3',"three");
        map.put('4',"four");
        map.put('5',"five");
        map.put('6',"six");
        map.put('7',"seven");
        map.put('8',"eight");
        map.put('9',"nine");
        for ( char qwe : Integer.toString(s).toCharArray() ) {
            results.append(map.get(qwe));
        }
        System.out.println(results);

    }

    public static void main(String[] args) {
        solution(1478123);
    }


}
