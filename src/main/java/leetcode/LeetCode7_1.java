package leetcode;


/**
 * result*10 之前判断是否大于Integer.MAX_VALUE/10
 *                      小于Integer.MIN_VALUE/10
 */
public class LeetCode7_1 {
    public static void main(String args[]) {

        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
            long result = 0;
            int flag = 1;
            if(x < 0){
                flag = -1;
                x = -x;
            }
            while(x != 0){
                result = result * 10 + x%10;
                x /= 10;
            }
            result *= flag;
            if(result < Math.pow(-2,31) || result >= Math.pow(2,31)){
                return 0;
            }
            return (int)result;
    }
}
