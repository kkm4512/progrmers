package Seven;

public class Six {

    /**
     *  1. 기사들은 1 ~ number 까지의 번호 지정
     *  2. 기사는 자신의 번호 "약수 갯수"에 해당하는 공격력 가진 무기 구매
     *  3. 하지만 이웃나라의 협약에 의해, 제한수치보다 큰 공격을 가진 무기는 안됨
     *  4. 15번으로 지정된 기사의 약수는, 1 3 5 15 로 4개 이므로, 공격력 4인 무기 구매 가능
     *  5. 무기를 만들때, 공격력 1당 1kg의 철이 필요함, "철의 무게 미리 계산"
     */
    public static int solution(int number, int limit, int power) {
        Integer result = 0;
        for ( int i=1; i <= number; i++ ) {
            result += getPrimes(i) > limit ? power : getPrimes(i);
        }
        return result.intValue();
    }

    //약수의 갯수를 구하는 함수
    public static Integer getPrimes(int number){
        Integer count = 0;
        for ( int i=1; i*i <= number; i++ ) {
            if (i*i == number) count++;
            else if (number%i == 0) count+=2;
        }
        return count;
    }

    public static void main(String[] args) {
        solution(5,3,2);
    }
}
