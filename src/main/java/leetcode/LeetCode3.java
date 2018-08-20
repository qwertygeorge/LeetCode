package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 滑动窗口方法不暴力
 */
public class LeetCode3 {
    public static void main(String[] args){
        int result = lengthOfLongestSubstring("wsvsuwxlyabjchruujhclb");
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int tempLength = 0;
        int begin = 0;
        int end = 0;
        int tempIndex = begin;
        Set<Character> charSet = new HashSet<>();
        while(end < s.length()){
            char temp = s.charAt(end);
            if(!charSet.contains(temp)){
                end++;
                tempLength++;
                charSet.add(temp);
            }else{
                charSet.remove(s.charAt(begin));
                begin++;
                tempLength--;
            }
            maxLength = tempLength > maxLength ? tempLength : maxLength;
        }
        return maxLength;
    }
}
