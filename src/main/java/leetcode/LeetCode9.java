package leetcode;


/**
 * 优化点：
 * 1、还可以过滤以0结尾的
 * 2、只需要反转一半就可以拿来比较了 奇数/10 偶数直接比较
 */
public class LeetCode9 {
    public static void main(String args[]) {

        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int result = 0;
        if(x < 0){
            return false;
        }
        while(temp != 0){
            result = result*10+temp%10;
            temp/=10;
        }
        if(x == result){
            return true;
        }
        return false;
    }
}
