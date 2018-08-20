package leetcode;


public class LeetCode14 {
    public static void main(String args[]) {
        System.out.println();
    }




    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ret = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = strs[i].length() < min ? strs[i].length() : min;
        }
        if (min == 0) {
            return "";
        }

        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    return ret.toString();
                } else if (j == strs.length - 1) {
                    ret.append(strs[j].charAt(i));
                }
            }
        }
        return ret.toString();
    }
}
