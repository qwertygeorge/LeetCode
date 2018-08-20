package leetcode;
/**
 * 因为 长方形高度由两边中较短的一边决定
 * 从两边开始 较短的一边向较长的一边移动 只需要遍历一次
 */
public class LeetCode11_2 {
    public static void main(String args[]) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
