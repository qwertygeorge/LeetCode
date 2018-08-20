package leetcode;

/**
 * 暴力+优化 过滤一些不必要的循环
 */
public class LeetCode5_1 {

    public static void main(String[] args){
        String a = "a";
        System.out.println(longestPalindrome(a));

    }

    public static String longestPalindrome(String s) {
        int maxLength = 0;
        int tempLength;
        String result ="";
        String temp;
        for(int i = 0; i < s.length(); i++){
            if(maxLength < s.length() -i){
                for(int j = s.length() -1 ; j >= i; j--){
                    if(s.charAt(i) == s.charAt(j)){
                        if((j-i+1) > maxLength){
                            temp = s.substring(i,j+1);
                            if(isCycle(temp)){
                                tempLength = temp.length();
                                if(tempLength > maxLength){
                                    maxLength = tempLength;
                                    result = temp;
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static boolean isCycle(String str){
        int begin = 0;
        int end = str.length()-1;
        boolean flag = true;
        while (begin < end){
            if(str.charAt(begin) ==str.charAt(end)){
                begin++;
                end--;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}
