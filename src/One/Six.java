package One;

public class Six {
    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        solution("ProgrammerS123",11);
    }
}
