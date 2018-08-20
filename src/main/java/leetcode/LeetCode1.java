package leetcode;

import java.util.ArrayList;

import java.util.List;

public class LeetCode1 {
    public static void main(String args[]){
        int[] b = new int[]{2,7,9,10};
        for (int i = 0; i < b.length ; i++) {
            System.out.println(b[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();
        for(int i = 0 ; i < nums.length -1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++ ){
                if(nums[i] + nums[j] == target){
                    if(numList.contains(i)|| numList.contains(j)){
                        continue;
                    }
                    numList.add(i);
                    numList.add(j);
                }
            }
        }
        int[] result = new int[numList.size()];
        for(int i = 0 ; i < numList.size() ; i++){
            result[i] = numList.get(i);
        }
        return result;
    }
}
