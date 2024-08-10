package Six;

public class Seven {

    /**
     *  1. 콜라 빈 병 2개를 가져다주면, 콜라 1명을 받을 수 있다.
     *  2. 보유 중인 빈 병이 2개 미만이라면, 콜라를 받을 수 없다.
     */
    public static int solution(int a, int b, int n) {
        int cola = 0;
        while (n >= a){
            cola += b * (n/a);
            n = (b * (n/a)) + (n%a);
        }
        System.out.println(cola);
        return cola;
    }

    public static void main(String[] args) {
        solution(2,1,20);
    }
}
