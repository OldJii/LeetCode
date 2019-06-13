package com.oldjii.lib;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = max > sum ? max : sum;
            if(sum < 0)
                sum = 0;
        }

        return max;
    }
}
