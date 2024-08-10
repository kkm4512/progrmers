package Four;

public class Five {

    public static int solution(int[] numbers, int n) {
        int sum = 0;
        for ( int number : numbers ) {
            sum += number;
            if (sum > n) return sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        solution(new int[]{34, 5, 71, 29, 100, 34},123);
    }
}
