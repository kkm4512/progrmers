package Two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Four {

    public static int[] solution(String my_string) {
        List<String> upperAlphabets = IntStream.range(65,91).mapToObj( n -> String.valueOf ( (char) n) ).collect(Collectors.toList());
        List<String> lowerAlphabets = IntStream.range(97,123).mapToObj( n -> String.valueOf ( (char) n) ).collect(Collectors.toList());
        List<String> allAlphabets = new ArrayList<>(upperAlphabets);
        allAlphabets.addAll(lowerAlphabets);
        HashMap<String,Integer> alphabets = new HashMap<>();
        upperAlphabets.forEach( n -> alphabets.put( n,0 ) );
        lowerAlphabets.forEach( n -> alphabets.put( n,0 ) );
        for ( char n : my_string.toCharArray() ) {
            String strChar = String.valueOf(n);
            if (alphabets.containsKey(strChar)) alphabets.put(strChar, alphabets.get(strChar) +1 );
        }
        int[] alphabetCounts = new int[52];
        IntStream.range(0,52).forEach( n -> alphabetCounts[n] = alphabets.get(allAlphabets.get(n)) );
        return alphabetCounts;
    }

    public static void main(String[] args) {
        solution("Programmers");
    }
}
