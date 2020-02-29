class Solution {
    public int findRepeatNumber(int[] nums) {
        // return methodOne(nums);
        return methodTwo(nums);
    }

    /**
     * 原地置换，如无重复，理想结果为nums[i] == i;
     **/
    public int methodOne(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i) {
                if(nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    temp = nums[i];
                    nums[i] = nums[temp];
                    nums[temp] = temp;
                }
            }
        }
        return -1;
    }

    /**
     * 利用Set不允许有重复元素的性质
     **/
    public int methodTwo(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}