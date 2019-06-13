package com.oldjii.lib;

public class removeElement {
    public int removeElement(int[] nums, int val) {
        //这道题，思路跟上一题一样：还是使用慢指针和快指针构建一个新的数组，满足某种情况的时候不添值，忽略

        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
