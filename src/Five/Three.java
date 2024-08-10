package Five;

public class Three {

    public static int solution(String myString, String pat) {
        String myStringUniCode = makeUniCode(myString.toUpperCase());
        String patUniCode = makeUniCode(pat.toUpperCase());
        return myStringUniCode.contains(patUniCode) ? 1 : 0 ;

    }

    private static String makeUniCode(String s){
        return String.join("",s.chars().mapToObj(String::valueOf).toArray(String[]::new));
    }

    public static void main(String[] args) {
        solution("AbCdEfG","aBc");
    }
}
