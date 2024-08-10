package Two;

public class Two {

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        String part = sb.substring(s,e+1);
        String reversedPart = new StringBuilder(sb.substring(s,e+1)).reverse().toString();
        return my_string.replace(part,reversedPart);



    }

    public static void main(String[] args) {
        solution("Progra21Sremm3",6,12);
    }
}
