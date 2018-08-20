package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13_TODO {
    public static void main(String args[]) {
    }



    /**
     * 挺好的解法
     */
    public static int romanToInt(String s) {

        int ret = 0;
        Map<String,Integer> romanMap = new HashMap<>();
        romanMap.put("M",1000);
        romanMap.put("D",500);
        romanMap.put("C",100);
        romanMap.put("L",50);
        romanMap.put("X",10);
        romanMap.put("V",5);
        romanMap.put("I",1);
        ret += romanMap.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >= 0 ; i--) {

        }
        return ret;
    }
}
