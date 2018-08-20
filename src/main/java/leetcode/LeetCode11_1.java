package leetcode;

public class LeetCode11_1 {
    public static void main(String args[]) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int h = 0;
        for (int i = 0; i < height.length; i++){
            if(height[i] <= maxLeft || height[i] <= h){
                continue;
            }
            for (int j = height.length -1; j > i ;j--){
                if(height[j] <= maxRight || height[j] <= h){
                    continue;
                }
                int htemp = Math.min(height[i],height[j]);
                int temp = htemp*(j-i);
                maxArea = temp > maxArea? temp:maxArea;
                h = htemp > h? htemp:h;
            }
        }
        return maxArea;
    }
}
