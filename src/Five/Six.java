package Five;

public class Six {
    /**
     *  1. 학교 학생 3명의 정수 번호를 더했을때 0이 되면 3명의 학생은 삼총사 라고함
     *  2. 모든 경우의 수 (중복허용) 중 3명의 정수를 계산하였을떄 0이 되면 모두 "삼총사"로 지칭
     *  3. 매개변수가 주어졌을떄, 해당하는 삼총사의 촛 숫자를 return 하기
     */

    /**
     *  1. 근데 지금 어쩃든 내가 만들어야하는 동작은 모든 경우의수를 비교해야 한단 말이지?
     *  0 1 2 / 0 1 3 / 0 1 4
     *  0 2 3 / 0 2 4
     *  0 3 4
     *  1 2 3 / 1 2 4
     *
     *
     */

    public static int solution(int[] number) {
        int count = 0;
        for ( int i=0; i<number.length; i++ ) {
            for ( int j=i+1; j<number.length; j++ ) {
                for ( int z=j+1; z<number.length; z++ ) {
                    int one = number[i];
                    int two = number[j];
                    int three = number[z];
                    if (one + two + three == 0) count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        solution(new int[]{-2, 3, 0, 2, -5});
    }
}
