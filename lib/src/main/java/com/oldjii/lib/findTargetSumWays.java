package com.oldjii.lib;

public class findTargetSumWays {
    private int res = 0;

    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, 0, S);
        return res;
    }

    private void dfs(int[] nums, int index, int target) {
        if(index == nums.length) {
            if(target == 0)
                res++;
        } else {
            dfs(nums, index + 1, target + nums[index]);     //两行计算出了数组内元素间的所有运算的可能性
            dfs(nums, index + 1, target - nums[index]);
        }
    }
}
