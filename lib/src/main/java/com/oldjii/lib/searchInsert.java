package com.oldjii.lib;

public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
            if(target > nums[nums.length - 1]) {
                return nums.length;
            }
        }

        return 0;
    }
}
