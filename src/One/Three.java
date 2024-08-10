package One;

public class Three {
    public static int solution(String number) {
        return number.chars()
                .map(Character::getNumericValue)
                .reduce(0, Integer::sum) % 9;
    }

    public static void main(String[] args) {
        solution("123");
    }
}
