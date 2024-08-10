package Six;

import java.util.*;

public class Five {

    public static void solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int[] ints = new int[s.length()];
        for ( int i=0; i<s.length(); i++ ) {
            char c = s.charAt(i);
            ints[i] =  i-map.getOrDefault(c,i+1);
            map.put(c,i);
        }
        System.out.println(Arrays.toString(ints));

    }

    public static void main(String[] args) {
        solution("banana");
    }
}
