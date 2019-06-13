package com.oldjii.lib;

public class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1_i = m - 1, nums2_i = n - 1, nums1_re = m + n - 1;
        while(nums2_i >= 0) {
            if(nums1_i >= 0) {
                if(nums1[nums1_i] > nums2[nums2_i])
                    nums1[nums1_re--] = nums1[nums1_i--];
                else
                    nums1[nums1_re--] = nums2[nums2_i--];
            } else nums1[nums1_re--] = nums2[nums2_i--];
        }
    }
}
