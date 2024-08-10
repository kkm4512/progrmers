package Seven;

public class Four {
    public static int solution(int[] nums){
        int result = 0;
        for ( int i=0; i<nums.length; i++ ){
            for ( int j=i+1; j<nums.length; j++ ){
                for ( int z=j+1; z<nums.length; z++ ) {
                    int sum = nums[i]+nums[j]+nums[z];
                    if (isPrime(sum)) result++;
                }
            }
        }
        return result;
    }

    //소수 판별 로직
    public static boolean isPrime(int n){
        //1보다 작거나 같다면 소수가 아니기떄문에 return false
        if (n <= 1) return false;
        //n이 i로 나누어 떨어진다면 소수가 아님
        // 왜냐면 소수는 1과 자신밖에 약수가 없기때문
        for ( int i=2; i<=(int)Math.sqrt(n); i++ ) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4});
    }
}

